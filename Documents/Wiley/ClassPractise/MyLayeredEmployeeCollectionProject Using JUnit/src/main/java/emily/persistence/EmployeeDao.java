package emily.persistence;

import emily.entity.Employee;

import java.util.Collection;

// This is the layer that interacts with the Database
public interface EmployeeDao {
    // Return the collection of all records of employees
    Collection<Employee> getAllRecords();

    // Search for employees using their id
    Employee searchRecord(int id);

    // Insert a new employee from the database
    Employee insertRecord(Employee employee);

    // Delete an employee from the database
    Employee deleteRecord(int id);
}
