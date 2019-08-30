package com.example.springboot.TransactionsManagement.service;

import com.example.springboot.TransactionsManagement.model.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private InsuranceService insuranceService;


    public void joinEmployee(Organization organization) {
        employeeService.addEmployee(organization.getEmployee());
        insuranceService.addInsurance(organization.getInsurance());
    }

    public void exitEmployee(long code) {
        employeeService.deleteEmployee(code);
        insuranceService.deleteInsurance(code);
    }

    public Organization getEmployee(long code) {
        Organization response = new Organization();
        response.setEmployee(employeeService.getEmployeeDetails(code));
        response.setInsurance(insuranceService.getInsuranceDetails(code));
        return response;
    }
}
