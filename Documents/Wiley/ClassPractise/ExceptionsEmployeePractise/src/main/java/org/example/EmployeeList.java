package org.example;

import exception.NameCheckedException;

public class EmployeeList {
    private Employee[] employees;
    private int totalNoEmployees;

    // Make an empty array to put the names in to check if they've already been used
    // private String names[];

    public EmployeeList(int totalNoEmployees) {
        this.totalNoEmployees = totalNoEmployees;
        employees = new Employee[totalNoEmployees];
    }

    public void input(int i, Employee name) throws NameCheckedException {
        // in here, check if the name has already been used (from my new array),
        // if it has been used then throw an exception
        for (int index = 0; index < i; index++) {
            if (employees[i].getName().equals(name.getName())) {
                throw new NameCheckedException("Duplicate name entered");
            }
        }
        employees[i] = name;
    }

    public void display() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("name: " + employees[i].getName() + " age: " + employees[i].getAge());
        }
    }
}
