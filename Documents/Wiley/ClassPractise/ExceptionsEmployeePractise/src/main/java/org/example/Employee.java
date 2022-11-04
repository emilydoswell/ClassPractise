package org.example;

import exception.AgeCheckedException;

public class Employee {
    private int Id;
    private String name;
    private int age;

    // Constructor
    public Employee() {
    }

    public Employee(int Id, String name, int age) throws AgeCheckedException {
        if (age >= 18 && age <= 60) {
            this.Id = Id;
            this.name = name;
            this.age = age;
        } else throw new AgeCheckedException("Age must be between 18-60");
    }

    // Getters & Setters
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeCheckedException {
        if (age >= 18 && age <= 60) {
            this.age = age;
        } else {
            throw new AgeCheckedException("Age must be between 18-60");
        }
    }

}
