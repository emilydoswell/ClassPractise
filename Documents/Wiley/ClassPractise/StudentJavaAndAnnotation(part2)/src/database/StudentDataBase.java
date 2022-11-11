package database;

import java.util.LinkedHashMap;
import java.util.Map;

import entity.Student;

public class StudentDataBase {
	static private Map<Integer, Student> studentList = new LinkedHashMap<Integer, Student>();
	
	static {
		studentList.put(101, new Student("Jill", 101, 78));
		studentList.put(102, new Student("Lily", 102, 78));
		studentList.put(103, new Student("Bill", 103, 78));
		studentList.put(104, new Student("Oscar", 104, 78));
	}
	
	public static Map<Integer, Student> getStudentList() {
		return studentList;
	}

}
