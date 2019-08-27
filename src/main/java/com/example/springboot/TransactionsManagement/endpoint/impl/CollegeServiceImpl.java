package com.example.springboot.TransactionsManagement.endpoint.impl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/college")
public class CollegeServiceImpl {

    @GetMapping
    public String status() {
        return "status: It's working. Please start using it.";
    }
}
