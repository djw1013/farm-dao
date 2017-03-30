package com.wj.farm.dao;

import java.util.List;

import com.wj.farm.entity.TestEntity;

public interface ITestDao {
    List<TestEntity> queryList(String name);
}
