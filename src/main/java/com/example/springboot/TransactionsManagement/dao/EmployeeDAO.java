package com.example.springboot.TransactionsManagement.dao;


import com.example.springboot.TransactionsManagement.model.Employee;

public interface EmployeeDAO  {
    void addEmployee(Employee employee);
    void deleteEmployee(long code);
    Employee getEmployee(long code);
}
