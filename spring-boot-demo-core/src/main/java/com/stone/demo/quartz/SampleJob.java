package com.stone.demo.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author shiqing
 * @data 18/7/25
 */
public class SampleJob extends QuartzJobBean {

  private String name;
  @Override
  protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
    System.out.println(String.format("Hello %!", this.name));
    System.out.println(this);
  }
}
