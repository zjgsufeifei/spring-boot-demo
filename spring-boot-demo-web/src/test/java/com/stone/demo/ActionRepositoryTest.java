package com.stone.demo;

import com.stone.demo.dal.entity.ActionDO;
import com.stone.demo.dal.repository.ActionRepository;
import com.stone.demo.web.DemoApplication;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author shiqing
 * @data 18/7/17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
public class ActionRepositoryTest {

  @Autowired
  private ActionRepository actionRepository;

  @Test
  public void test() throws Exception {
    actionRepository.save(new ActionDO("xiepengfei", "code", "666"));

    Assert.assertEquals(1, actionRepository.findAll().size());
    Assert.assertEquals("666", actionRepository.findByName("xiepengfei").getDesc());
    actionRepository.delete(actionRepository.findByName("xiepengfei"));
  }
}
