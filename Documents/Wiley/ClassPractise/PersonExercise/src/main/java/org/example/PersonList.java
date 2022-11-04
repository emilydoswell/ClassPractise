package org.example;

public class PersonList {
    private Person[] persons;
    private int totalNoPersons;

    public PersonList(int totalNoPersons) {
        this.totalNoPersons = totalNoPersons;
        persons = new Person[totalNoPersons];
    }

    public void input(int i, Person name) {
        persons[i] = name;
    }

    public void display() {
        for (int i = 0; i < persons.length; i++) {
            System.out.println("name: " + persons[i].getPersonName() + " age: " + persons[i].getAge());
        }
    }
}
