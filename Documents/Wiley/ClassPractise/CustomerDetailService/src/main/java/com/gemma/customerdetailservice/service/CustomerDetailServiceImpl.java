package com.gemma.customerdetailservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerDetailServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<CustomerShare> getCustomerRatingByCustomerId(String customerId);
    List<CustomerShare> customerShareList = new ArrayList<CustomerShare>();

    DetailList details = restTemplate.getForObject("http://localhost:8804/details" + customerId, DetailList.class);

    for(Detail detail: details.getDetails())
    {
        Share share = restTemplate.getForObject("https://localhost:8802/shares" + detail.getShareId(), Share.class);

        CustomerShare customerShare = new CustomerShare(detail.getCustomerId(), share.getShareName(), detail.getQuantity, share.getSharePrice(), (detail.getQuantity() * detail.getSharePrice)), detail.getShareType());

        customerShareList.add(customerShare);
    }

    return customerShareList;
}
