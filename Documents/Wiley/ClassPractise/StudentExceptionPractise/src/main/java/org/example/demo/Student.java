package org.example.demo;

import org.example.exceptions.AgeException;

public class Student {
    // Variables
    private int rollNo;
    private String name;
    private int age;
    private int marks;

    // Constructor
    public Student() {
    }

    public Student(int rollNo, String name, int age, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Getters & Setters
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {
        if (age < 0) {
            throw new AgeException("You can't be a negative age.");
        } else if (age < 4 || age > 18) {
            throw new AgeException("Please enter an age between 4 - 18");
        }
        this.age = age;
    }
}
