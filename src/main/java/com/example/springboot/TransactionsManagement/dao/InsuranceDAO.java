package com.example.springboot.TransactionsManagement.dao;

import com.example.springboot.TransactionsManagement.model.Insurance;

public interface InsuranceDAO {
    void addInsurance(Insurance insurance);
    void deleteInsurance(long code);
    Insurance getInsurance(long code);
}
