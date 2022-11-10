package emily.service;

import emily.entity.Employee;
import emily.entity.EmployeePaySlip;
import emily.persistence.EmployeeDao;
import emily.persistence.EmployeeDaoImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
        Employee emp = employeeDao.deleteRecord(id);
        if (emp != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean incrementSalary(int id, double increment) {
        Employee employee=employeeDao.searchRecord(id);
        if(employee==null) {
            return false;
        }
        employee.setEmpSalary(employee.getEmpSalary()+increment);
        employeeDao.insertRecord(employee);
        return true;
    }

    /*
     * Business Rule
     * AllowancesA : 18% of salary
     * AllowanceB : 12% of salary
     * Deduction : 8% of salary
     */

    @Override
    public EmployeePaySlip generatePaySlip(int employeeId) {
        Employee employee=employeeDao.searchRecord(employeeId);
        if(employee!=null) {
            double allowanceA=.18*employee.getEmpSalary();
            double allowanceB=.12*employee.getEmpSalary();
            double deduction=.08*employee.getEmpSalary();
            double totalSalary=employee.getEmpSalary()+allowanceA+allowanceB-deduction;

            EmployeePaySlip employeePaySlip=new EmployeePaySlip(employee, allowanceA, allowanceB, deduction,totalSalary);
            return employeePaySlip;
        }
        return null;

    }

    @Override
    public List<Employee> searchEmployeeByDepartment(String empDepartment) {
        Collection<Employee> emp = employeeDao.getAllRecords();
        ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();

        for (Employee employee : emp ) {
            if (employee.getEmpDepartment().equals(empDepartment)) {
                employeeArrayList.add(employee);
            }
        }

        if (employeeArrayList.isEmpty()) {
            return null;
        }

        return employeeArrayList;
    }
}
