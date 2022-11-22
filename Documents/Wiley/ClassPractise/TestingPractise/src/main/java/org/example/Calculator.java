package org.example;

import org.example.exceptions.NegativeNumberException;

public class Calculator {
    /*
     * Requirement - R001 : Divide two Positive Integers
     */
    public int divide(int number1,int number2) throws NegativeNumberException {
        if(number1>=0 && number2>=0)
            return number1/number2;
        else
            throw new NegativeNumberException("Numbers cannot be Negative");
    }

    // Add two Positive Integers
    public int add(int number1, int number2) throws NegativeNumberException {
        if (number1 >= 0 && number2 >= 0)
            return number1 + number2;
        else
            throw new NegativeNumberException("Numbers cannot be Negative");
    }
}
