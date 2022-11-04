package org.example;

import exception.AgeCheckedException;
import exception.NameCheckedException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("How many people would you like to add to the list");
            int totalNoPersons = input.nextInt();

            // Generate size of array
            EmployeeList employeeList = new EmployeeList(totalNoPersons);

            for (int i = 0; i < totalNoPersons; i++) {
                System.out.println("What's their name?");
                String name = input.next();

                System.out.println("What's their age?");
                int age = input.nextInt();

                // Generate Person
                Employee person = new Employee((i + 1), name, age);

                // Add to array
                employeeList.input(i, person);
            }
            // Display the people in the list
            employeeList.display();

        } catch (AgeCheckedException exception) {
            System.out.println("Please use an age between 18-60");
        } catch (NameCheckedException e) {
            System.out.println("This isn't right");
        } catch (Exception e) {
            System.out.println("OOPS Something went wrong");
        }
    }
}