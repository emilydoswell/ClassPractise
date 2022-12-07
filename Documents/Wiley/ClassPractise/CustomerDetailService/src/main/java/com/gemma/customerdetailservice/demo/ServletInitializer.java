package com.gemma.customerdetailservice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class ServletInitializer {
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
    {
        return application.sources(CustomerRatingServiceWebMVCProjectApp.class);
    }
}
