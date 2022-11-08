package org.example;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Number {
    // Variables
    private int number;
    private int position;

    // Check user input against array
    public boolean check(int num, int[] numberArray) {
        int count = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] != num) {
                count += 1;
            }
        }
        if (count == numberArray.length)
            return true;
        return false;
    }

}
