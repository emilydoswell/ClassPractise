package org.example;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create HashSet
        Set<Number> myCollection = new LinkedHashSet<>();

        // Create array to store user input
        int[] numbers = new int[10];
        Number newNumber = new Number();

        //Create Scanner
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            // Ask user for input
            System.out.println("Enter a number: ");
            int userInput = input.nextInt();

            // Check if the user has entered duplicate
            if (newNumber.check(userInput, numbers)) {
                numbers[i] = userInput;
                Number number = new Number(userInput, i);
                myCollection.add(number);
            }
        }

        // Iterate through collection of numbers
        Iterator<Number> iterator=myCollection.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Print collection
        System.out.println(myCollection);
    }
}