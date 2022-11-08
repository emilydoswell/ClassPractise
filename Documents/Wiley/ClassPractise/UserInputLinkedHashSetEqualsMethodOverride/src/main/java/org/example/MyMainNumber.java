package org.example;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class MyMainNumber {
    public static void main(String[] args) {
        Set<MyNumber> myCollection=new LinkedHashSet<MyNumber>();

        Scanner scanner=new Scanner(System.in);

        for(int index=0;index<10;) {
            System.out.println("Enter Number : ");

            MyNumber myNumber=new MyNumber(scanner.nextInt(), index);
            int flag=0;
            for(MyNumber element:myCollection) {
                if(element.getValue()==myNumber.getValue()) {
                    flag=1;
                }
            }
            if(flag!=1) {
                myCollection.add(myNumber);
                index++;
            }
        }

        for(MyNumber element:myCollection) {
            System.out.println(element);
        }
    }
}
