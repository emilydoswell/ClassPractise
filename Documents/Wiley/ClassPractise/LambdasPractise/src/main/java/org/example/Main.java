package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Generate list of positive and negative integers
        List<Integer> newList = Arrays.asList(10,-20,-34,56,-43,-1);

        // Convert all negative numbers to positive and display them
        System.out.println("Convert all negative numbers to positive and display them");
        newList.stream()
                .filter((number) -> number < 0)
                .map((number) -> number * -1)
                .forEach((number) -> System.out.println(number));

        // Using conditionals inside the map function
        System.out.println("Using conditionals inside the map function");
        newList.stream()
                .map(t -> {
                        if(t < 0)
                            t = t * -1;
                            return t;
                    }
                ).forEach(t -> System.out.println(t));
    }
}