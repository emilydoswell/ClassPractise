package com.gemma.customerdetailservice.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerDetailResource {


    @Autowired
    private CustomerDetailResource customerDetailResource;

    @GetMapping(path="customer/myshares/{cId}" = MediaType.APPLICATION_JSON_VALUE)
    public CustomerShareList getCustomerShareByCustomerIdResource(@PathVariable("cId") String customerId )
    {
        return new CustomerShareList.getCustomerRatingByUserId(customerId);
    }

}
