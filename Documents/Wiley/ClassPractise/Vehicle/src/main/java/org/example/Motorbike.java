package org.example;

public class Motorbike extends Vehicle {
    public Motorbike(String colour, String model, int noWheels) {
        super(colour, model, noWheels);
    }

    public Motorbike() {
    }

    public void changeColour(String colour) {
        this.colour = colour;
    }
}
