package com.stone.demo.starter.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author shiqing
 * @data 18/7/17
 */
@ConfigurationProperties(prefix = "Hello")
public class HelloProperties {

  private static final String MSG = "world";

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  private String msg = MSG;
}
