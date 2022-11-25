package org.example;

import java.util.Arrays;

public class Main {
    public static boolean solution(String str, String ending) {
        String[] strArray = str.split("");
        String[] endingArray = ending.split("");

        int length = strArray.length;

        for (int i = endingArray.length; i > 0; i--) {
            if (endingArray[i-1].equals(strArray[length-1])) {
                length--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(solution("Smelly", "name"));

    }
}