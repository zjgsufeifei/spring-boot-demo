package com.stone.demo.service.impl;

import com.codahale.metrics.annotation.Counted;

import org.springframework.stereotype.Service;

/**
 * @author shiqing
 * @data 18/7/15
 */
@Service(value = "helloService")
public class HelloServiceImpl implements HelloService{

  @Override
  @Counted
  public String say() {
    return "Hello world";
  }
}
