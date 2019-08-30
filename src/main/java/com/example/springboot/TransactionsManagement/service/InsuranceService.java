package com.example.springboot.TransactionsManagement.service;

import com.example.springboot.TransactionsManagement.dao.InsuranceDAO;
import com.example.springboot.TransactionsManagement.model.Insurance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsuranceService {
    @Autowired
    private InsuranceDAO insuranceDAO;

    public void addInsurance(Insurance insurance) {
        insuranceDAO.addInsurance(insurance);
    }

    public void deleteInsurance(long code) {
        insuranceDAO.deleteInsurance(code);
    }

    public Insurance getInsuranceDetails(long code) {
        return insuranceDAO.getInsurance(code);
    }
}
