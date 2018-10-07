package com.stone.demo.domain;

import org.junit.Test;

/**
 * @author shiqing
 * @data 18/7/8
 */
public class ActionTest {

  @Test
  public void propertiesTest(){
    Action actionProperties = new Action();
    System.out.println(actionProperties.getName());
  }
}
