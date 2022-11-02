package org.example;

public class Car extends Vehicle {
    // Variables
    private int passengers;

    public Car(String colour, String model, int noWheels) {
        super(colour, model, noWheels);
    }

    public void addPassengers(int number) {
        passengers = passengers + number;
    }

    public void displayPassengers() {
        System.out.println("There are : " + passengers + " in this car.");
    }
}
