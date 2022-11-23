package org.example;

public enum Dish {
    CURRY(1000, true, 15),
    PIZZA(500, false, 12),
    RAMEN(400, true, 17);

    // Properties
    private int calories;
    private boolean vegetarian;
    private int price;

    Dish(int calories, boolean vegetarian, int price) {
        this.calories = calories;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public int getCalories() {
        return calories;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getPrice() {
        return price;
    }

    public boolean isHighCalorie() {
        if (getCalories() > 600)
            return true;
        else
            return false;
    };
}

