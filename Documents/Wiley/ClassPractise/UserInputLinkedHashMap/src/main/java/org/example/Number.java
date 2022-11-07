package org.example;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Number {
    private int number;
    private int position;

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
