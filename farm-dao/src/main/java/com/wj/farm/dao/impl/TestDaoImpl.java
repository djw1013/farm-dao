package com.wj.farm.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.wj.farm.core.util.convert.MapUtils;
import com.wj.farm.core.util.sql.SqlUtil;
import com.wj.farm.dao.ITestDao;
import com.wj.farm.entity.TestEntity;

@Repository
public class TestDaoImpl implements ITestDao{

    @Resource
    private JdbcTemplate jdbcTemplate;
    /**
     * 
     */
    public List<TestEntity> queryList(String name) {
        List<Map<String, Object>> list = jdbcTemplate.queryForList(SqlUtil.getSql("test", "selectSql"),name);
        return MapUtils.mapList2BeanList(list, TestEntity.class);
    }


}
