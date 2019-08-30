package com.example.springboot.TransactionsManagement.model;

public class Employee {
    private long code;
    private String name;

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
