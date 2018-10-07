package com.stone.demo.quartz;

import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.context.ConfigurableApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author shiqing
 * @data 18/7/25
 */
public class SampleJobTest {

  @Rule
  public OutputCapture outputCapture = new OutputCapture();

//  @Test
//  public void quartzJobIsTriggered() throws InterruptedException {
//    try {
//      ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class);
//      long end = System.currentTimeMillis() + 5000;
//      while(!this.outputCapture.toString().contains("Hello world") &&  System.currentTimeMillis() < end) {
//        Thread.sleep(1000);
//      }
//      assertThat(this.outputCapture.toString().contains("Hello world"));
//    } catch (Exception e) {
//      e.printStackTrace();
//    }
//  }

}
