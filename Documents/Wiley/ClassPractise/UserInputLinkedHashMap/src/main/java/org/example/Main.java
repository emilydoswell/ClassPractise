package org.example;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Number> myCollection = new LinkedHashSet<>();

        int[] numbers = new int[10];
        Number newNumber = new Number();

        //Create Scanner
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number: ");
            int userInput = input.nextInt();

            if (newNumber.check(userInput, numbers)) {
                numbers[i] = userInput;
                Number number = new Number(userInput, i);
                myCollection.add(number);
            }
        }

        Iterator<Number> iterator=myCollection.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(myCollection);
    }
}