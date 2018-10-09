package com.stone.demo.web;

//import com.stone.demo.quartz.SampleJob;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

/**
 * @author shiqing
 * @data 18/7/8
 */
@SpringBootApplication(scanBasePackages = {"com.stone.demo"})
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,
                                  DataSourceTransactionManagerAutoConfiguration.class})
@ServletComponentScan
public class DemoApplication {

  public static void main(String[] args) throws Exception {
    System.out.println(" springApplication run !");
    SpringApplication.run(DemoApplication.class, args);
  }
//
//  @Bean
//  public JobDetail sampleJobDetail() {
//    return JobBuilder.newJob(SampleJob.class).withIdentity("sampleJob")
//        .usingJobData("name", "world").storeDurably().requestRecovery().build();
//  }
//
//  @Bean
//  public Trigger sampleJobTrigger() {
//    CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("0/2 * * * * ?");
//    return TriggerBuilder.newTrigger().forJob(sampleJobDetail()).withIdentity("samleTrigger")
//        .withSchedule(scheduleBuilder).build();
//  }
}