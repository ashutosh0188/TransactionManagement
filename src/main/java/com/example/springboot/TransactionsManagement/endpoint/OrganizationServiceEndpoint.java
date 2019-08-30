package com.example.springboot.TransactionsManagement.endpoint;

import com.example.springboot.TransactionsManagement.model.Organization;

public interface OrganizationServiceEndpoint {
    public void joinOrganization(Organization organization);
    public void exitOrganization(long empCode);
    public Organization getEmployee(long code);
}
