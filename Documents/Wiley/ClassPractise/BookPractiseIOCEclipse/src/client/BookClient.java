package client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import presentation.BookPresentation;
import presentation.BookPresentationImpl;

public class BookClient {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
//		BookPresentation bookPresentation=new BookPresentationImpl();
		
		// XML
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookPresentation bookPresentation=(BookPresentation)springContainer.getBean("bookPresentation");
		
		
		while(true) {
			bookPresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			bookPresentation.performMenu(choice);
		}
	}

}
