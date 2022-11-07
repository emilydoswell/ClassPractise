package org.example.demo;

import org.example.exceptions.AgeException;
import org.example.exceptions.RollNoException;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);

        try {
            // Ask user for number of people in the list
            System.out.println("How many people do you want in the list?");
            int numberPeople = input.nextInt();

            // Create instance of student list class
            StudentList studentList = new StudentList(numberPeople);

            for (int i = 0; i < numberPeople; i++) {
                Student student = new Student();

                // Ask user for information about student
                System.out.println("Input Roll Number:");
                student.setRollNo(input.nextInt());
                System.out.println("Input Name:");
                student.setName(input.next());
                System.out.println("Input age:");
                student.setAge(input.nextInt());
                System.out.println("Input marks:");
                student.setMarks(input.nextInt());

                // Input Student object and index into array
                studentList.input(student, i);
            }
            studentList.display(numberPeople);
        } catch (AgeException exception) {
            System.out.println(exception.getMessage());
        } catch (RollNoException e) {
            System.out.println(e.getMessage());;
        } catch (Exception e) {
            System.out.println("Something went wrong, please try again!");
        }
    }
}
