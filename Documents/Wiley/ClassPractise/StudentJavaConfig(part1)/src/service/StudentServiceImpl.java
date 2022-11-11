package service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import entity.Student;

import persistence.StudentDao;
import persistence.StudentDaoImpl;

@Component("service")
public class StudentServiceImpl implements StudentService {
	
	private StudentDao studentDao;
		
		
	public StudentServiceImpl(@Autowired StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}

	
	@Override
	public Collection<Student> getAllStudents() {
		return studentDao.getAllRecords();
	}
	
	@Override
	public Student searchStudentById(int id) {
		return studentDao.searchRecord(id);
	}
	
	@Override
	public boolean addStudent(Student student) {
		Student newStudent = studentDao.searchRecord(student.getRollNo());
		if(newStudent!=null) {
			return false;
		}
		studentDao.insertRecord(student);
		return true;
	}
}
