package org.example;

public class Factorial {
    // create constant
    int constant = 0;

    public int calculateFactorial(int n) {
        while(n > 0) {
            int num = n;
            while(num > 0) {
                constant += num--;
            }
            n--;
        }
        return constant;
    }
}
