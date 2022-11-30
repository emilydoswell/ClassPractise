package com.emily.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.emily")
public class MirroredNumberMvcSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MirroredNumberMvcSpringBootApplication.class, args);
	}

}
