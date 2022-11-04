package org.example.demo;

public class StudentList {
    // Generate array
    private Student[] studentList;
    private int numberPeople;

    public StudentList(int numberPeople) {
        this.numberPeople = numberPeople;
        studentList = new Student[numberPeople];
    }

    public void input(Student student, int i) {
        studentList[i] = student;
    }

    public void display(int numberPeople) {
        for (int i = 0; i < numberPeople; i++) {
            System.out.println("Roll Number: " + studentList[i].getRollNo() + " Name: " + studentList[i].getName() + " Age: " + studentList[i].getAge() + " Marks: " + studentList[i].getMarks());
        }
    }
}
