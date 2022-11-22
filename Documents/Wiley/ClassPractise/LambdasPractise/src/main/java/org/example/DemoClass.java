package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoClass {
    public static void main(String[] args) {
        List<Book> booksList = new ArrayList();

        booksList.add(new Book("Book 1", 60, 5500));
        booksList.add(new Book("Book 2", 60, 2000));
        booksList.add(new Book("Book 3", 60, 6500));
        booksList.add(new Book("Book 4", 60, 1000));

        booksList.stream()
                .filter(book -> book.getPrice() <= 5000)
                .map(book -> new BookDiscount(book, book.getPrice() * 0.95))
                .forEach(book -> System.out.println(book));

        booksList.stream()
                .filter(book -> book.getPrice() > 5000)
                .map(book -> new BookDiscount(book, book.getPrice() * 0.90))
                .forEach(book -> System.out.println(book));
    }
}
