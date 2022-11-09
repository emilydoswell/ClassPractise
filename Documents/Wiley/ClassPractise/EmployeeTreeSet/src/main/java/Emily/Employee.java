package Emily;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Employee implements Comparable<Employee> {
    private int employeeID;
    private String name;
    private int yrsExp;
    private String designations;
    private String department;
    private int salary;

    @Override
    public int compareTo(Employee employee2) {
        if (yrsExp > employee2.yrsExp) {
            return 1;
        } else if (yrsExp < employee2.yrsExp) {
            return -1;
        } else if (this.equals(employee2)) {
            return 0;
        }
        return 1;
    }
}
