package com.example.springboot.TransactionsManagement.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Repository
public class BaseDAO extends JdbcDaoSupport {
    @Autowired
    private DataSource dataSource;
    protected JdbcTemplate jdbcTemplate;

    @PostConstruct
    private void init() {
        setDataSource(dataSource);
        this.jdbcTemplate = getJdbcTemplate();
    }
}
