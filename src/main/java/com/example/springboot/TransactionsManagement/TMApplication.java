package com.example.springboot.TransactionsManagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class TMApplication implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(TMApplication.class);
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(TMApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Creating database: after applicationContext is loaded");
		String employeeTable = "CREATE TABLE IF NOT EXISTS employee(code INT PRIMARY KEY, name VARCHAR(128) NOT NULL)";
		String insuranceTable = "CREATE TABLE IF NOT EXISTS insurance(code INT PRIMARY KEY, name VARCHAR(128) NOT NULL, coverage_amount INT)";
		jdbcTemplate.execute(employeeTable);
		jdbcTemplate.execute(insuranceTable);
	}

}
