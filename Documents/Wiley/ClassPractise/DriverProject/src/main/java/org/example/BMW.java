package org.example;

public class BMW extends Car {
    public BMW(String model, String color) {
        super(model, color);
    }

    public void engine() {
        System.out.println("BMW Engine goes BOOOOM.....");
    }
}
