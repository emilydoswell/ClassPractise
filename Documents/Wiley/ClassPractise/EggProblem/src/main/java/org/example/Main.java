package org.example;

public class Main {
    public static void main(String[] args) {

        CalculateEggs calculateEggs = new CalculateEggs();

        calculateEggs.setNumEggs(267);

        // Gross
        int grossEggs = calculateEggs.getGrossEggs();
        System.out.println("You have " + grossEggs + " gross eggs");

        // Dozen
        int dozenEggs = calculateEggs.getDozenEggs();
        System.out.println("You have " + dozenEggs + " dozen eggs");

        // Left
        int leftEggs = calculateEggs.getLeftEggs();
        System.out.println("You have " + leftEggs + " leftover eggs");
    }
}