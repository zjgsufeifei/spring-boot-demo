package com.stone.demo.starter.hello;

/**
 * @author shiqing
 * @data 18/7/17
 */
public class HelloWorldService {

  private String msg;

  public String sayHello() {
    return "Hello" + msg;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

}
