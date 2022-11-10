package emily.client;

import emily.presentation.EmployeePresentation;
import emily.presentation.EmployeePresentationImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class EmployeeClient {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        // EmployeePresentation employeePresentation=new EmployeePresentationImpl();

        AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
        EmployeePresentation employeePresentation=(EmployeePresentation)springContainer.getBean("presentation");

        while(true) {
            employeePresentation.showMenu();
            System.out.println("Enter Choice : ");
            int choice=scanner.nextInt();
            employeePresentation.performMenu(choice);
        }

    }
}
