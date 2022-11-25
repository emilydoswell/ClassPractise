package com;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import presentation.BookPresentation;

@SpringBootApplication(scanBasePackages = {"persistence", "service", "presentation"})
@EntityScan(basePackages = "entity")
@EnableJpaRepositories(basePackages = "persistence")
public class BookJdbCandJavaSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer = SpringApplication.run(BookJdbCandJavaSpringBootApplication.class, args);
		
		Scanner scanner = new Scanner(System.in);

		BookPresentation bookPresentation = (BookPresentation)springContainer.getBean("presentation");
		
		while(true) {
			bookPresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			bookPresentation.performMenu(choice);
		}
	}

}
