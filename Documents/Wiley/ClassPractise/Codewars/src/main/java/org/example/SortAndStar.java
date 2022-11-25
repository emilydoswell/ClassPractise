package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SortAndStar {

    public static String twoSort(String[] s) {
        // Sort the array into alphabetical order
        String[] sortedArray;
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));

        // Get first word
        // Split first word into characters
        String firstWord = s[0];
        String[] letters = firstWord.split("");

        String newWord = "";

        for (int i = 0; i < letters.length; i++) {
            newWord += letters[i];
            if (i+1 < letters.length)
                newWord += "***";
        }

        System.out.println(newWord);
        return newWord;
    }
}
