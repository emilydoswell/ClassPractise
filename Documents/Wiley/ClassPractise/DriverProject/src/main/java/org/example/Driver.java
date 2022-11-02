package org.example;

public class Driver {
    private String name;
    private Car car;

    public Driver(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void drive() {
        System.out.print(this.name + " is driving " + this.car.getColor() + " color " + this.car.getModel() + " ");
        this.car.engine();
    }
}
