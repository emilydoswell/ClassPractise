package Emily;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeMain {
    public static void main(String args[]) {
        // Generate TreeSet
        Set<Employee> myCollection = new TreeSet<Employee>();

        myCollection.add(new Employee(1, "Nicky", 2, "Junior", "Sales", 25000));
        myCollection.add(new Employee(2, "Lucy", 2, "Senior", "Customer Exp", 45000));
        myCollection.add(new Employee(3, "Jane", 3, "Junior", "Customer Exp", 25000));
        myCollection.add(new Employee(4, "Jake", 1, "Senior", "Tech", 32000));
        myCollection.add(new Employee(5, "Ellie", 5, "Junior", "Sales", 25000));

        System.out.println("Sorted Employees by years experience");
        for (Employee employee : myCollection) {
            System.out.println(employee);
        }
    }
}
