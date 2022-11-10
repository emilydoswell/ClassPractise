package emily.persistence;

import emily.database.EmployeeDataBase;
import emily.entity.Employee;

import java.util.Collection;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public Collection<Employee> getAllRecords() {
        return EmployeeDataBase.getEmployeeList().values();
    }

    @Override
    public Employee searchRecord(int id) {
        return EmployeeDataBase.getEmployeeList().get(id);
    }

    @Override
    public Employee insertRecord(Employee employee) {
        return EmployeeDataBase.getEmployeeList().put(employee.getEmpId(), employee);
    }

    @Override
    public Employee deleteRecord(int id) {
        return EmployeeDataBase.getEmployeeList().remove(id);
    }
}

// EmployeeDataBase.getEmployeeList() is all static, therefore we don't need to
// instantiate the an object from the class in order to use it.