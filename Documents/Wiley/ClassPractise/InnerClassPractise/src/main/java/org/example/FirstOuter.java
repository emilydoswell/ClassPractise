package org.example;

public class FirstOuter {
    int value;

    public void inputValue(int value) {
        this.value = value;
    }

    public void displayValue() {
        System.out.println("Value: " + value);
    }

    class FirstInner{
        int number;
        public void inputNumber(int number) {
            this.number=number;
        }

        public void displayNumber() {
            System.out.println("Number : " + number);
            System.out.println("Value : " + value);
        }
    }
}

