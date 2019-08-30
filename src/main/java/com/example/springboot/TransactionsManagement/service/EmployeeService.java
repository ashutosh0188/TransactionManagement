package com.example.springboot.TransactionsManagement.service;

import com.example.springboot.TransactionsManagement.dao.EmployeeDAO;
import com.example.springboot.TransactionsManagement.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    public void addEmployee(Employee employee) {
        employeeDAO.addEmployee(employee);
    }

    public void deleteEmployee(long code) {
        employeeDAO.deleteEmployee(code);
    }

    public Employee getEmployeeDetails(long code) {
        return employeeDAO.getEmployee(code);
    }
}
