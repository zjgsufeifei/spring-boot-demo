package com.stone.demo.test;


import com.stone.demo.starter.hello.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shiqing
 * @data 18/7/17
 */
@RestController
@SpringBootApplication
public class TestApplication {

  @Autowired
  HelloWorldService helloService;

  @RequestMapping("/")
  public String index() {
    return helloService.sayHello();
  }

  public static void main(String[] args) {
    SpringApplication.run(TestApplication.class, args);
  }
}
