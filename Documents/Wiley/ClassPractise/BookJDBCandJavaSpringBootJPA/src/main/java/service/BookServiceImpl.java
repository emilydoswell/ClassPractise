package service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Book;
import persistence.BookDao;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao bookDao;
		
	public BookServiceImpl(@Autowired BookDao bookDao) {
		super();
		this.bookDao = bookDao;
	}
	
		
	public BookServiceImpl() {
	}
			
	@Override
	public Collection<Book> getAllBooks() {
		return bookDao.findAll();
	}
	
	@Override
	public Book searchBookById(int id) {
		return bookDao.findById(id).orElse(null);
	}
	
	@Override
	public boolean addBook(Book book) {
		if (searchBookById(book.getBookId()) == null) {
			bookDao.save(book);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean deleteBook(int id) {
		if (searchBookById(id) != null) {
			bookDao.deleteById(id);
			return true;
		}
		return false;
		
		
		// if bookDao.deleteRecord(id) returns 0, then the value has not been deleted. 
		// bookDao.deleteRecord(id) function returns an integer.
	}
}
