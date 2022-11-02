package org.example;

public class CarRentalSystem {
    public CarRentalSystem() {
    }

    public static void main(String[] args) {
        new Audi("A8", "Red");
        BMW bmw = new BMW("Q5", "Silver");

        new Honda("City", "Blue");

        Driver john = new Driver("John");
        new Driver("Alex");
        john.setCar(bmw);
        john.drive();

        Mercedes mercedes = new Mercedes("Fast", "Black");
        Driver milly = new Driver("Milly");
        milly.setCar(mercedes);
        milly.drive();
    }
}