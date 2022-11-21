package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 7, -4, 6, -10, 23, 1, -3);

        long count = numbers.stream().filter((t) -> t < 0).count();

        System.out.println("Total number of negative number : " + count);
    }
}