package org.example;

public class Road {
    public static void main(String[] args) {
        // First Car
        Car fordFocus = new Car("Silver", "Ford", 4);
        fordFocus.drive();

        // Second Car
        Car citroenSaxo = new Car("Green", "Citroen", 4);
        citroenSaxo.addPassengers(3);
        citroenSaxo.displayPassengers();

        // First Motorbike
        Motorbike harley = new Motorbike("Red", "harley", 2);
        harley.stop();

        // Second Motorbike
        Motorbike unknown = new Motorbike();
        unknown.drive();
        unknown.changeColour("Green");
        System.out.println(unknown.colour);
    }
}
