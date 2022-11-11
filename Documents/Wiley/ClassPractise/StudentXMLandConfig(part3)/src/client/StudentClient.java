package client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import presentation.StudentPresentation;
import presentation.StudentPresentation;


public class StudentClient {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		// XML
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentPresentation studentPresentation=(StudentPresentation)springContainer.getBean("studentPresentation");
		
		
		while(true) {
			studentPresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			studentPresentation.performMenu(choice);
		}
	}

}
