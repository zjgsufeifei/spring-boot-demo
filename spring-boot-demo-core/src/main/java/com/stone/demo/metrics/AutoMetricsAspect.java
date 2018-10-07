package com.stone.demo.metrics;

import com.codahale.metrics.Counter;
import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Timer;
import com.codahale.metrics.annotation.Counted;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author shiqing
 * @data 18/7/15
 */
@Aspect
@Component
public class AutoMetricsAspect {

  protected ConcurrentMap<String, Meter> meters = new ConcurrentHashMap<>();
  protected ConcurrentMap<String, Meter> exceptionMeters = new ConcurrentHashMap<>();
  protected ConcurrentMap<String, Timer> timers = new ConcurrentHashMap<>();
  protected ConcurrentMap<String, Counter> counters = new ConcurrentHashMap<>();

  @Autowired
  MetricRegistry metricRegistry;

  @Pointcut(value = "execution(public * *(..))")
  public void publicMethods() {
  }

  @Before("publicMethods() && @annotation(countedAnnotation)")
  public void instrumentCounted(JoinPoint jp, Counted countedAnnotation) {
    String name = name(jp.getTarget().getClass(), StringUtils.hasLength(countedAnnotation.name()) ? countedAnnotation.name() : jp.getSignature().getName(), "counter");
    Counter counter = counters.computeIfAbsent(name, key -> metricRegistry.counter(key));
    counter.inc();
  }

  private String name(Class<?> targetClass, String annotationName, String suffix) {
    return targetClass.getName().concat(annotationName).concat(suffix);
  }
}
