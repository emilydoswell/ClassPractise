package persistence;

import java.util.Collection;

import org.springframework.stereotype.Component;

import database.BookDataBase;
import entity.Book;

@Component("dao")
public class BookDaoImpl implements BookDao {

	@Override
	public Collection<Book> getAllRecords() {
		return BookDataBase.getBookList().values();
	}

	@Override
	public Book searchRecord(int id) {
		return BookDataBase.getBookList().get(id);
	}

	@Override
	public Book insertRecord(Book book) {
		return BookDataBase.getBookList().put(book.getBookId(), book);
	}

}
