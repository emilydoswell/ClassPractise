package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create instances
        Height height1 = new Height(4, 3);
        Height height2 = new Height(4, 3);

        // This is why we create two constructors!!
        Height calculateHeight = new Height();
        calculateHeight.sumHeights(height1, height2);

        System.out.println("Height is: " + calculateHeight.getFeet() + " feet and " + calculateHeight.getInches() + " inches.");
    }
}