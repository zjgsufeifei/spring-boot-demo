package com.stone.demo.dal.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author shiqing
 * @data 18/7/17
 */
@Entity
@Data
@Table(name = "demo_action")
public class ActionDO implements Serializable {

  private static final long serialVersionUID = -2080638633992464039L;

  @Id
  @GeneratedValue
  private Long id;
  @Column(nullable = false, unique = true)
  private String name;
  @Column(nullable = false)
  private String action;
  @Column(nullable = true)
  private String desc;

  public ActionDO() {
  }

  public ActionDO(String name, String action, String desc) {
    this.name = name;
    this.action = action;
    this.desc = desc;
  }
}
