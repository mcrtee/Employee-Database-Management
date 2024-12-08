package org.example;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData();

        // Create a new employee
//        Employee newEmployee = new Employee("Meerim", "Graphic Designer", 70000, new Date());
//        employeeData.createEmployee(newEmployee);

        // Get employee by ID
        Employee retrievedEmployee = employeeData.getEmployeeById(1);
        if (retrievedEmployee != null) {
            System.out.println("Employee Retrieved: " + retrievedEmployee);
        }


        // Delete an employee
 employeeData.deleteEmployee(2);

        System.out.println("All Employees:");
        employeeData.getAllEmployees().forEach(System.out::println);
    }
}
