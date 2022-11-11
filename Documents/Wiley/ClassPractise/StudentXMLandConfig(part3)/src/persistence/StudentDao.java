package persistence;

import java.util.Collection;

import entity.Student;

public interface StudentDao {
	
	Collection<Student> getAllRecords();
	Student searchRecord(int rollNo);
	Student insertRecord(Student student);

}
