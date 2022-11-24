package test;

// We import the static class because then we can use static methods from the class without the class name
// e.g. we can use 
// fail("Not yet implemented") 
// instead of having to call Assertions.fail("Not yet implemented")

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import entity.Book;
import persistence.BookDaoImpl;

class BookDaoImplTest {
	
	// Instantiate the Dao
	BookDaoImpl dao;

	// Must instantiate the dao before the start of testing
	@BeforeEach
	void setUp() throws Exception {
		// Instantiate a new BookDaoImpl object so that we can use it
		dao = new BookDaoImpl();
	}

	// Set the dao instantiation to null once testing is complete
	@AfterEach
	void tearDown() throws Exception {
		// Set the instantiated object to null because we're finished with it
		dao = null;
	}
	
	// assertTrue just checks that my statement is true
	@DisplayName("Test Get All Records")
	@Test
	void testGetAllRecords() {
		// fail("Not yet implemented");
		assertTrue(dao.getAllRecords().size() > 0);
	}

	@DisplayName("Test Search Records")
	@Test
	void testSearchRecord() {
		// fail("Not yet implemented");
		
		// assertTrue: is my statement true.
		assertTrue(dao.searchRecord(103) != null);
	}

	@DisplayName("Test Insert Record")
	@Test
	void testInsertRecord() {
		// fail("Not yet implemented");
		
		// assertEquals(expected result, what we're checking)
		// The expected result is 1, and if we are successful in inserting the record, the output of that is also 1.
		// Why? because if we check the insertRecord method in bookDaoImpl, it returns an integer.
		assertEquals(1, dao.insertRecord(new Book(205, "Normal People", "Sally Rooney", 500)));
	}

	// So, as with all of these tests, first of all check the return type of the method that we're testing
	// from in the daoImpl. The return type here is int. Therefore, when we run our test we want to make sure
	// that we test against the output we expect from this method.
	// if the deletion is successful, then rows is 1 and the output of deleteRecord is 1. 1 = 1.
	@Test
	void testDeleteRecord() {
		// fail("Not yet implemented");
		assertEquals(1, dao.deleteRecord(202));
	}

}
