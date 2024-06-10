package main;

import com.yourname.assignment.employees.Developer;
import com.yourname.assignment.employees.Manager;
import com.yourname.assignment.utilities.EmployeeUtilities;

public class AssignMain {

	public static void main(String[] args) {
		Manager manager = new Manager();
        manager.setName("Janvi");
        manager.setEmployeeId("M123");
        manager.setSalary(95000);
        manager.setDepartment("HR");

        Developer developer = new Developer();
        developer.setName("Vidhi");
        developer.setEmployeeId("D456");
        developer.setSalary(85000);
        developer.setProgrammingLanguage("Java");

        System.out.println("Manager Details:");
        EmployeeUtilities.printEmployeeDetails(manager);
        System.out.println("Department: " + manager.getDepartment());

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.printEmployeeDetails(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());

        // Update salary example
        EmployeeUtilities.updateEmployeeSalary(manager, 100000);
        System.out.println("\nUpdated Manager Salary: " + manager.getSalary());

	}

}
