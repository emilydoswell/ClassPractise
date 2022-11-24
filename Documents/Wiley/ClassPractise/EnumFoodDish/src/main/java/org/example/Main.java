package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Dish food = Dish.CURRY;

        System.out.println("Your food is  high calorie : " + food.isHighCalorie());
    }
}