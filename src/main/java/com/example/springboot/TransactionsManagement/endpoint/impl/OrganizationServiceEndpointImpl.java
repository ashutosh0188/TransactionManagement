package com.example.springboot.TransactionsManagement.endpoint.impl;

import com.example.springboot.TransactionsManagement.endpoint.OrganizationServiceEndpoint;
import com.example.springboot.TransactionsManagement.model.Organization;
import com.example.springboot.TransactionsManagement.service.OrganizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/organization")
public class OrganizationServiceEndpointImpl implements OrganizationServiceEndpoint {
    private static final Logger log = LoggerFactory.getLogger(OrganizationServiceEndpointImpl.class);
    @Autowired
    private OrganizationService organizationService;

    @GetMapping
    public String status() {
        return "status: It's working. Please start using it.";
    }


    @Override
    @PostMapping("/join")
    public void joinOrganization(@RequestBody Organization organization) {
        organizationService.joinEmployee(organization);
    }

    @Override
    @GetMapping("/exit/{code}")
    public void exitOrganization(@PathVariable long code) {
        organizationService.exitEmployee(code);
    }

    @Override
    @GetMapping("/emp/{code}")
    public Organization getEmployee(long code) {
        Organization organization = organizationService.getEmployee(code);
        log.info("Response:"+organization);
        return organization;
    }
}
