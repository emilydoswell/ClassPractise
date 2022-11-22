package org.example;

public class Book {
    public String name;
    public int noOfPages;
    public int price;

    public Book(String name, int noOfPages, int price) {
        this.name = name;
        this.noOfPages = noOfPages;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    @Override
    public String toString() {
        return "Book Name : " + getName() + " , Price : " + getPrice() + " , Number of pages : " + getNoOfPages();
    }
}
