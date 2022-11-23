package org.example;

public enum Coffee {
    MOCHA(5, 20, true, "Soy"), CAPPUCCINO(8, 30, false, "Oat");

    // Constructor is always private
    Coffee(int size, double price, boolean sugar, String milkType) {
        this.size = size;
        this.price = price;
        this.sugar = sugar;
        this.milkType = milkType;
    }

    // Properties
    private int size;
    private double price;
    private boolean sugar;
    private String milkType;

    // Getters only - (no setters because the properties of the enum are fixed)
    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public boolean isSugar() {
        return sugar;
    }

    public String getMilkType() {
        return milkType;
    }
}
