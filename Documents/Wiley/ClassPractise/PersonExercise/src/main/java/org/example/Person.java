package org.example;

public class Person {
    // Variables
    private int personId;
    private String personName;
    private int age;

    // Constructor
    public Person() {
    }

    public Person(int personId, String personName, int age) {
        this.personId = personId;
        this.personName = personName;
        this.age = age;
    }

    // Getters & Setters
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
