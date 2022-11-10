package presentation;

import java.util.Collection;
import java.util.Scanner;

import entity.Book;

import service.BookService;
import service.BookServiceImpl;

public class BookPresentationImpl implements BookPresentation {
	
	BookService bookService = new BookServiceImpl();

	@Override
	public void showMenu() {
		System.out.println("===========================");
		System.out.println("Book Management System");
		System.out.println("1. List All Books");
		System.out.println("2. Search Book By ID");
		System.out.println("3. Add New Book");
		System.out.println("7. Exit");
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
			newBook.setBookName(scanner.next());
			System.out.println("Enter Number of copies : ");
			newBook.setBookId(scanner.nextInt());
			
//			if(employeeService.addEmployee(newEmployee))
//				System.out.println("Employee Record Added");
//			else
//				System.out.println("Employee with id "+newEmployee.getEmpId()+" already exist, so cannot add it as a new employee!");
			
			break;
		}
	}
}
