package emily.service;

import emily.entity.Employee;
import emily.entity.EmployeePaySlip;

import java.util.Collection;
import java.util.List;

public interface EmployeeService {
    Collection<Employee> getAllEmployees();

    Employee searchEmployeeById(int id);

    boolean addEmployee(Employee employee);

    boolean deleteEmployee(int id);

    boolean incrementSalary(int id,double increment);

    EmployeePaySlip generatePaySlip(int employeeId);

    List<Employee> searchEmployeeByDepartment(String empDepartment);
}
