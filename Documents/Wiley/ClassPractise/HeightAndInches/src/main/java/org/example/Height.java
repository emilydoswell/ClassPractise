package org.example;

public class Height {
    // Variables
    int feet;
    int inches;

    // Constructors
    public Height() {
        super();
    }

    public Height(int feet, int inches) {
        super();
        this.feet = feet;
        this.inches = inches;
    }

    // Setters & Getters
    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    // Calculation
    public void sumHeights(Height one, Height two) {
        this.feet = one.getFeet() + two.getFeet();
        this.inches = one.getInches() + two.getInches();

        if (inches > 12 ) {
            feet = feet + (feet / 12);
            inches = inches % 12;
        }
    }
}
