package presentation;

import java.util.Collection;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import entity.Book;

import service.BookService;
import service.BookServiceImpl;

@Component("presentation")
public class BookPresentationImpl implements BookPresentation {
	
	@Autowired
	private BookServiceImpl bookService;
	
	@Autowired
	public void setBookService(BookServiceImpl bookService) {
		this.bookService = bookService;
	}
	
	@Override
	public void showMenu() {
		System.out.println("===========================");
		System.out.println("Book Management System");
		System.out.println("1. List All Books");
		System.out.println("2. Search Book By ID");
		System.out.println("3. Add New Book");
		System.out.println("4. Delete A Book");
		System.out.println("5. Exit");
		System.out.println("============================");
	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner = new Scanner(System.in);
		
		switch (choice) {
		case 1:
			Collection<Book> books = bookService.getAllBooks();
			for(Book aBook : books) {
				System.out.println(aBook);
			}
			break;
		case 2:
			System.out.println("Enter Book ID : ");
			int id = scanner.nextInt();
			Book book = bookService.searchBookById(id);
			if(book!=null)
				System.out.println(book);
			else
				System.out.println("Book with id "+id+" doesnot exist");
			break;
		case 3:
			Book newBook = new Book();
			
			System.out.println("Enter Book id : ");
			newBook.setBookId(scanner.nextInt());
			System.out.println("Enter Book name : ");
			newBook.setBookName(scanner.next());
			System.out.println("Enter Author name : ");
			newBook.setAuthorName(scanner.next());
			System.out.println("Enter Number of copies : ");
			newBook.setNoOfCopies(scanner.nextInt());
			
			if(bookService.addBook(newBook))
				System.out.println("Employee Record Added");
			else
				System.out.println("Employee with id "+newBook.getBookId()+" already exist, so cannot add it as a new employee!");
			
			break;
		case 4:
			System.out.println("Enter Book ID : ");
			
			int bId=scanner.nextInt();
			
			if(bookService.deleteBook(bId))
				System.out.println("Book with id " + bId + " deleted");
			else
				System.out.println("Book with id " + bId + " does not exist");
			
			break;
		case 5:
			System.out.println("Thanks for using this application");
			System.exit(0);
		}
	}
}
