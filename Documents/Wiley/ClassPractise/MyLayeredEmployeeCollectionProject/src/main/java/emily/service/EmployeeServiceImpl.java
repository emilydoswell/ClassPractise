package emily.service;

import emily.entity.Employee;
import emily.persistence.EmployeeDao;
import emily.persistence.EmployeeDaoImpl;

import java.util.Collection;

public class EmployeeServiceImpl implements EmployeeService {
    //Service will request persistence layer for all data needs
    private EmployeeDao employeeDao=new EmployeeDaoImpl();

    @Override
    public Collection<Employee> getAllEmployees() {
        return employeeDao.getAllRecords();
    }

    @Override
    public Employee searchEmployeeById(int id) {
        return employeeDao.searchRecord(id);
    }

    @Override
    public boolean addEmployee(Employee employee) {
        Employee emp = employeeDao.searchRecord(employee.getEmpId());
        if (emp != null) {
            return false;
        }
        employeeDao.insertRecord(employee);
        return true;
    }

    @Override
    public boolean deleteEmployee(int id) {

        return false;
    }

    @Override
    public boolean incrementSalary(int id, double increment) {
        return false;
    }
}
