package presentation;

import java.util.Collection;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import entity.Student;

import service.StudentService;
import service.StudentServiceImpl;

@Component("studentPresentation")
public class StudentPresentationImpl implements StudentPresentation {

	private StudentService studentService;
	
	// We'd only use this (qualifier) if there were two implementations of the interface, to specify which implementation we're using. 
	//	@Qualifier("service")
	
	@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@Override
	public void showMenu() {
		System.out.println("===========================");
		System.out.println("Book Management System");
		System.out.println("1. List All Students");
		System.out.println("2. Add New Student");
		System.out.println("3. Exit");
		System.out.println("============================");
	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner = new Scanner(System.in);
		
		switch (choice) {
		case 1:
			Collection<Student> students = studentService.getAllStudents();
			for(Student aStudent : students) {
				System.out.println(aStudent);
			}
			break;
		case 2:
			Student newStudent = new Student();
			
			System.out.println("Enter Student name : ");
			newStudent.setName(scanner.next());
			System.out.println("Enter Student Roll Number : ");
			newStudent.setRollNo(scanner.nextInt());
			System.out.println("Enter Grade : ");
			newStudent.setGrade(scanner.nextInt());
			
			if(studentService.addStudent(newStudent))
				System.out.println("Student Added");
			else
				System.out.println("Student with Roll Number " + newStudent.getRollNo() + " already exist, so cannot add it!");
			
			break;
		}
	}
}
