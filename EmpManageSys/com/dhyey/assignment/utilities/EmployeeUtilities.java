package com.yourname.assignment.utilities;

import com.yourname.assignment.employees.Employee;
public class EmployeeUtilities {
	
	    public static void printEmployeeDetails(Employee employee) {
	        System.out.println("Name: " + employee.getName());
	        System.out.println("Employee ID: " + employee.getEmployeeId());
	        System.out.println("Salary: " + employee.getSalary());
	    }
	    
	    public static void updateEmployeeSalary(Employee employee, double newSalary) {
	        employee.setSalary(newSalary);
	    }
}
