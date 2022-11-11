package service;

import java.util.Collection;

import entity.Student;

public interface StudentService {
	
	Collection<Student> getAllStudents();
	
	Student searchStudentById(int id);

	boolean addStudent(Student student);
}
