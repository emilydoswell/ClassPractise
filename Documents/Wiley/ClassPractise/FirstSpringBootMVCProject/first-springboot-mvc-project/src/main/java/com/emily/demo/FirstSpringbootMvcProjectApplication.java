package com.emily.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.emily.demo")
public class FirstSpringbootMvcProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootMvcProjectApplication.class, args);
	}

}
