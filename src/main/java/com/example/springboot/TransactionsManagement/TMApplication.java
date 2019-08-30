package com.example.springboot.TransactionsManagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TMApplication {
	private static final Logger log = LoggerFactory.getLogger(TMApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TMApplication.class, args);
	}
}
