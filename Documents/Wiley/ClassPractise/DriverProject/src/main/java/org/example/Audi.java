package org.example;

public class Audi extends Car {
    public Audi(String model, String color) {
        super(model, color);
    }

    public void engine() {
        System.out.println("Audi Engine goes AOOOOM.....");
    }
}