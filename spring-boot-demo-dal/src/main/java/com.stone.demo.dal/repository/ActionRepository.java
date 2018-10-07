package com.stone.demo.dal.repository;

import com.stone.demo.dal.entity.ActionDO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author shiqing
 * @data 18/7/17
 */
@Repository
public interface ActionRepository extends JpaRepository<ActionDO, Long>{

  ActionDO findByName(String name);
}
