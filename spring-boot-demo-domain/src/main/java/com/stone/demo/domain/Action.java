package com.stone.demo.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @author shiqing
 * @data 18/6/5
 */
@Data
@Component
public class Action {

  @Value("${com.stone.demo.name}")
  private String name;

  @Value("${com.stone.demo.action}")
  private String action;

  @Value("${com.stone.demo.desc}")
  private String desc;

  public Action() {
    System.out.printf("ActionProperties init!");
  }
}
