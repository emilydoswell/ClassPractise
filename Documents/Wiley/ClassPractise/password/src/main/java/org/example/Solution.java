package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Solution {
    public int solution(String S) {
        String[] characters = S.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)"); // Split S at digit points into an array of strings

        ArrayList<String> nonDigitsArray = new ArrayList<String>();  // Create new array to store non digits

        for (int i = 0; i < characters.length; i++) {  // Iterate through Array to eliminate strings containing numbers
            if (checkNumber(characters[i]) == false) {
                nonDigitsArray.add(characters[i]);  // Add string elements to ArrayList which have no digits present
            }
        }

        ArrayList<String> nonCapitalsArray = new ArrayList<String>(); // Create new ArrayList to store non digits

        for (int i = 0; i < nonDigitsArray.size(); i++) {   // Iterate through ArrayList to eliminate non capitals
            if (checkCapitals(nonDigitsArray, i)) {
                nonCapitalsArray.add(nonDigitsArray.get(i));  // Add string elements to ArrayList which have at least one capital present
            }
        }

        return maxLength(nonCapitalsArray);  // Return final maximum length of password
    }

    public boolean checkNumber(String character) { // method to check if number is present in string
        try {
            int intValue = Integer.parseInt(character);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean checkCapitals(ArrayList<String> lettersArray, int i) {   //  method to check if capital letter present in string
        String letters = lettersArray.get(i); // Establish element from array

        int count = 0; // Generate count
        for (int j = 0; j < letters.length(); j++) {    // Iterate through String
             if (Character.isUpperCase(letters.charAt(j))) {  // Check if character is uppercase
                 count += 1;  // Add one to count if character is uppercase
             }
        }

        if (count > 0)  // If count is greater than 0, at least one uppercase present
            return true;
        return false;
    }

    public int maxLength(ArrayList<String> nonCapitalsArray) {
        int maxLength = 0; // Generate count

        for (int i = 0; i < nonCapitalsArray.size(); i++) {
            if (nonCapitalsArray.get(i).length() > maxLength) {
                maxLength = nonCapitalsArray.get(i).length();
            }
        }

        if (maxLength > 0)  // If maxLength is greater than 0, at least one password is verified
            return maxLength;   // return largest length verified password
        return -1;   // no password suitable, return -1
    }
}

