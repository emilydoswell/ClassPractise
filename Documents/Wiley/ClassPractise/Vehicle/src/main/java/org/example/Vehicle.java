package org.example;

// Create a class called Vehicle. In the Vehicle class constructor initialize few variables like color, no of
// wheels, model etc.

public class Vehicle {
    // Variables
    String colour;
    String model;
    int noWheels;

    // Constructor
    public Vehicle() {
    }

    public Vehicle(String colour, String model, int noWheels) {
        this.colour = colour;
        this.model = model;
        this.noWheels = noWheels;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNoWheels() {
        return noWheels;
    }

    public void setNoWheels(int noWheels) {
        this.noWheels = noWheels;
    }

    // Methods
    public String drive() {
        String message = "I am driving";
        System.out.println(message);
        return message;
    }

    public String stop() {
        String message = "I am stopping";
        System.out.println(message);
        return message;
    }
}
