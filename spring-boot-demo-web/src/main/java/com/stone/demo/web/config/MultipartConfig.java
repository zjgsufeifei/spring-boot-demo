package com.stone.demo.web.config;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.MultipartConfigElement;

/**
 * @author shiqing
 * @data 18/7/17
 */

@Configuration
public class MultipartConfig {

  @Bean
  public MultipartConfigElement multipartConfigElement(){
    MultipartConfigFactory factory = new MultipartConfigFactory();
    factory.setMaxFileSize("10MB");
    factory.setMaxRequestSize("10MB");
    return factory.createMultipartConfig();
  }

}