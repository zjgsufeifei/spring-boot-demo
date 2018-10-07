package com.stone.demo.metrics;

import com.codahale.metrics.JmxReporter;
import com.codahale.metrics.MetricRegistry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author shiqing
 * @data 18/7/15
 */
@Configuration
@ComponentScan({"com.stone.demo"})
@AutoConfigureAfter(AopAutoConfiguration.class)
public class DropwizardMetricsMBeansAutoConfiguration {

  @Value("${metrics.mbeans.domain.name:com.stone.demo}")
  String metricsMBeansDmainName;

  @Autowired
  MetricRegistry metricRegistry;

  @Bean
  public JmxReporter jmxReporter() {
   JmxReporter reporter = JmxReporter
       .forRegistry(metricRegistry)
       .inDomain(metricsMBeansDmainName)
       .build();
    return reporter;
  }
}
