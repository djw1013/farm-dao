package com.wj.farm.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.wj.farm.core.util.xml.SqlUtil;
import com.wj.farm.dao.ITestDao;

@Repository
public class TestDaoImpl implements ITestDao{

    @Resource
    private JdbcTemplate jdbcTemplate;
    /**
     * 
     */
    public List<Map<String, Object>> queryList() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList(SqlUtil.getSql("test", "selectSql"));
        return list;
    }


}
