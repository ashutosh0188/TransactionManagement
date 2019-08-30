package com.example.springboot.TransactionsManagement.model;

public class Organization {
    private Employee employee;
    private Insurance insurance;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "employee=" + employee +
                ", insurance=" + insurance +
                '}';
    }
}
