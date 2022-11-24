package persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import entity.Book;

public class BookRowMapper implements RowMapper<Book> {
	
	@Override
	public Book mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		int bookID = resultSet.getInt("BOOKID");
		String bookName = resultSet.getString("BOOKNAME"); 
		String authorName = resultSet.getString("AUTHORNAME");
		int noOfCopies = resultSet.getInt("NOOFCOPIES");
		
		Book book = new Book(bookID, bookName, authorName, noOfCopies);
		return book;
	}
}
