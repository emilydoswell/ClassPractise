package com.gemma.customerdetailservice.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.gemma")
public class CustomerRatingServiceWebMVCProjectApp {
    public static void main(String[] args) {
        SpringApplication.run(CustomerRatingServiceWebMVCProjectApp.class, args);

    }

    @Bean
    public RestTemplate getTemplate()
    {
        return new RestTemplate();
    }

}
