package org.example;

// Exercise : Consider user has N eggs. Then display the no of eggs in gross (144 eggs make one gross)
// and no of eggs in a dozen (12 eggs make one dozen) and the no of eggs that is left out remaining.
// The total no of eggs can be got as input. The program should display how many gross, how many dozen,
// and how many left over eggs the user has.

import java.util.Scanner;

public class CalculateEggs {
    int numEggs;
    int grossEggs;
    int dozenEggs;
    int leftEggs;

    public void setNumEggs(int numEggs) {
        this.numEggs = numEggs;
    }

    // Gross
    private void calculateGrossEggs() {
        grossEggs = numEggs/144;
    }

    public int getGrossEggs() {
        calculateGrossEggs();
        return grossEggs;
    }

    // Dozen
    private void calculateDozenEggs() {
        numEggs = numEggs - (grossEggs * 144);
        dozenEggs = numEggs/12;
    }

    public int getDozenEggs() {
        calculateDozenEggs();
        return dozenEggs;
    }

    // Left over
    private void calculateLeftOver() {
        leftEggs = numEggs - (dozenEggs * 12);
    }

    public int getLeftEggs() {
        calculateLeftOver();
        return leftEggs;
    }
}


