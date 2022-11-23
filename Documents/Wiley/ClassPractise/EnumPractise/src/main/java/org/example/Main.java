package org.example;

public class Main {
    public static void main(String[] args) {
        // Instantiate the enum that we created.
        // If you tried
        // Coffee coffee = new Coffee();
        // You'd get an error because enums aren't like normal classes.
        // So we instantiate them like this:
        Coffee coffee = Coffee.CAPPUCCINO;

        //
        System.out.println(coffee.getMilkType());

        if (coffee == Coffee.CAPPUCCINO) {
            System.out.println("It's a Cappuccino with : " + coffee.getMilkType() + " milk!");
        }
    }
}