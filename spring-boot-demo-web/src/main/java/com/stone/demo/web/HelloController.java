package com.stone.demo.web;

import com.stone.demo.domain.Action;
import com.stone.demo.service.impl.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shiqing
 * @data 18/6/4
 */
@RestController
public class HelloController {

  @Autowired
  private HelloService helloService;

  @RequestMapping("/hello")
  public String index() {
    return helloService.say();
  }

  @RequestMapping("/getAction")
  public Action getAction() {
    Action action = new Action();
    action.setAction("action");
    action.setDesc("desc");
    action.setName("name");
    return action;
  }

}
