package com.stone.demo.dal;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

/**
 * @author shiqing
 * @data 18/7/17
 */
@Configuration
@EnableJpaRepositories("com.stone")
public class JpaConfiguration {

  @Primary
  @Bean
  @ConfigurationProperties(value = "spring.datasource.druid", locations = "classpath:dataSource.properties")
  public DataSource dataSource(){
    return DruidDataSourceBuilder.create().build();
  }
}
