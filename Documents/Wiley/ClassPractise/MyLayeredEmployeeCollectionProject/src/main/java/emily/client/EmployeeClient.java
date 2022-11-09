package emily.client;

import emily.presentation.EmployeePresentation;
import emily.presentation.EmployeePresentationImpl;

import java.util.Scanner;

public class EmployeeClient {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        EmployeePresentation employeePresentation=new EmployeePresentationImpl();

        while(true) {
            employeePresentation.showMenu();
            System.out.println("Enter Choice : ");
            int choice=scanner.nextInt();
            employeePresentation.performMenu(choice);
        }

    }
}
