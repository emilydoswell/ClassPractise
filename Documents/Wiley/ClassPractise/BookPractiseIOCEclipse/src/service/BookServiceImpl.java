package service;

import java.util.Collection;

import entity.Book;

import persistence.BookDao;
import persistence.BookDaoImpl;

public class BookServiceImpl implements BookService {
	
	  private BookDao bookDao=new BookDaoImpl();
	
//	private BookDao bookDao;
	
	public BookServiceImpl() {
		super();
		this.bookDao = bookDao;
	}
	
	@Override
	public Collection<Book> getAllBooks() {
		return bookDao.getAllRecords();
	}
	
	@Override
	public Book searchBookById(int id) {
		return bookDao.searchRecord(id);
	}
	
	@Override
	public boolean addBook(Book book) {
		Book newbook = bookDao.searchRecord(book.getBookId());
		if(newbook!=null) {
			return false;
		}
		bookDao.insertRecord(book);
		return true;
	}
}
