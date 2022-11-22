package emily.persistence;

import emily.database.EmployeeDataBase;
import emily.entity.Employee;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class EmployeeDaoImpl implements EmployeeDao {
//    @Override
//    public Collection<Employee> getAllRecords() {
//        return EmployeeDataBase.getEmployeeList().values();
//    }

    @Override
    public Collection<Employee> getAllRecords() {

        Connection connection = null;
        PreparedStatement preparedStatement;

        Collection<Employee> employeeList = new ArrayList<Employee>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/classpractise", "root", "HelloWorld");;

            preparedStatement = connection.prepareStatement("SELECT * FROM EMPLOYEES");

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("EMPLOYEE_ID");
                String firstName = resultSet.getString("FIRST_NAME");
                String lastName = resultSet.getString("LAST_NAME");
                String email = resultSet.getString("EMAIL");
                String phoneNumber = resultSet.getString("PHONE_NUMBER");
                double sal = resultSet.getDouble("SALARY");

                employeeList.add(new Employee(id, name, desig, deptt, sal, doj));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
//				4.Close
                connection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return employeeList;
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