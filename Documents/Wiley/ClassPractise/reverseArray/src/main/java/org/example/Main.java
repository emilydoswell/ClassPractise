package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeArray = scanner.nextInt();
        int[] userArray = new int[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            userArray[i] = scanner.nextInt();
        }

        int[] reverseArray = new int[sizeArray];

        int size = sizeArray;

        for (int i = 0; i < size; i++) {
//            System.out.println(userArray[sizeArray - 1]);
            reverseArray[i] = userArray[sizeArray - 1];
            sizeArray--;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(reverseArray[i]);
        }

    }
}