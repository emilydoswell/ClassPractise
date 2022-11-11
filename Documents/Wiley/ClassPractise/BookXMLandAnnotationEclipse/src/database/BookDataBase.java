package database;

import java.util.LinkedHashMap;
import java.util.Map;

import entity.Book;

public class BookDataBase {
	static private Map<Integer, Book> bookList = new LinkedHashMap<Integer, Book>();
	
	static {
		bookList.put(101, new Book(101, "Paddington Bear", "Author Name", 100));
		bookList.put(102, new Book(102, "The Bullet That Missed", "Richard Osman", 500));
		bookList.put(103, new Book(103, "It Starts with us", "Colleen Hoover", 1000));
		bookList.put(104, new Book(104, "The Satsuma Complex", "Bob Mortimer", 1500));
	}
	
	public static Map<Integer, Book> getBookList() {
		return bookList;
	}

}
