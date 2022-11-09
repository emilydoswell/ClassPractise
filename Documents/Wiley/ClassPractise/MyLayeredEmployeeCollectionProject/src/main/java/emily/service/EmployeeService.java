package emily.service;

import emily.entity.Employee;

import java.util.Collection;

public interface EmployeeService {
    Collection<Employee> getAllEmployees();

    Employee searchEmployeeById(int id);

    boolean addEmployee(Employee employee);

    boolean deleteEmployee(int id);

    boolean incrementSalary(int id,double increment);
}
