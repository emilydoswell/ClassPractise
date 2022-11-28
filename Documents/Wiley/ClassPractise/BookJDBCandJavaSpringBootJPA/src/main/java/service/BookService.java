package service;

import java.util.Collection;
import java.util.List;

import entity.Book;

public interface BookService {
	Collection<Book> getAllBooks();
	
	Book searchBookById(int id);

	boolean addBook(Book book);
	
	boolean deleteBook(int id);
	
	List<Book> getByNoOfCopies(int copies);
}
