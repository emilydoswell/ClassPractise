package org.example;

public class Main {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        int fact = factorial.calculateFactorial(5);
        System.out.println(fact);
    }
}