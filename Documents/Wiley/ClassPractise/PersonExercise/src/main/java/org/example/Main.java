package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("How many people would you like to add to the list");
        int totalNoPersons = input.nextInt();

        // Generate size of array
        PersonList personList = new PersonList(totalNoPersons);

        for (int i = 0; i < totalNoPersons; i++) {
            System.out.println("What's their name?");
            String name = input.next();

            System.out.println("What's their age?");
            int age = input.nextInt();

            // Generate Person
            Person person = new Person(i, name, age);

            // Add to array
            personList.input(i, person);
        }

        // Display the people in the list
        personList.display();
    }
}