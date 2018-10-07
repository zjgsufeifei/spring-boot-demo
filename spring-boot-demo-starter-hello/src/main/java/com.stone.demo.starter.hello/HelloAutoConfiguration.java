package com.stone.demo.starter.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shiqing
 * @data 18/7/17
 */
@Configuration
@EnableConfigurationProperties(HelloProperties.class)
@ConditionalOnClass(HelloWorldService.class)
@ConditionalOnProperty(prefix = "hello", value = "enabled", matchIfMissing = true)
public class HelloAutoConfiguration {

  @Autowired
  private HelloProperties helloProperties;

  @Bean
  @ConditionalOnMissingBean(HelloWorldService.class)
  public HelloWorldService helloService() {
    HelloWorldService helloService = new HelloWorldService();
    helloService.setMsg(helloProperties.getMsg());
    return helloService;
  }
}
