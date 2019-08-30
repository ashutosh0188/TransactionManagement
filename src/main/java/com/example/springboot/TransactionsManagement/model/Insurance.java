package com.example.springboot.TransactionsManagement.model;

public class Insurance {
    private String name;
    private int coverageAmount;
    private long empCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoverageAmount() {
        return coverageAmount;
    }

    public void setCoverageAmount(int coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    public long getEmpCode() {
        return empCode;
    }

    public void setEmpCode(long empCode) {
        this.empCode = empCode;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "name='" + name + '\'' +
                ", coverageAmount=" + coverageAmount +
                ", empCode=" + empCode +
                '}';
    }
}
