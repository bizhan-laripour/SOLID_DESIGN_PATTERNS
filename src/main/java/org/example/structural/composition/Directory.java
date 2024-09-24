package org.example.structural.composition;

import java.util.ArrayList;
import java.util.List;

/**
 * this class acts like composite in composition design pattern that
 * holds list of components
 */
public class Directory implements Employee {
    private List<Employee> employeeList = new ArrayList<>();
    private int sum = 0;

    @Override
    public int showEmployeeDetails() {
        for (Employee employee : employeeList) {
            sum += employee.showEmployeeDetails();
        }
        return sum;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }
    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    public void getSumOfSalaries(){
        showEmployeeDetails();
        System.out.println("Sum of Salaries: " + sum);
    }
}
