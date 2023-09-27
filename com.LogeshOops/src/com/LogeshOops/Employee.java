package com.LogeshOops;
/**
 * Application to calculate employee salary based on percentage and bonus
 * @author Logesh
 * @since 0.1
 */

public class Employee {
	
	int employeeID ; // Declaring int variable 
	String name; // Declaring String variable 
	String designation; // Declaring String variable 
	double salary; //Declaring Double variable 
	public Employee(int employeeID, String name, String designation, double salary) { // Creating four argument constructor
		this.employeeID = employeeID;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
	public void displayInfo() { // Method to print values
		System.out.println("Employee_ID : " +employeeID +"\n"
				+ "Employee_Name : " +name+"\n"
				+ "Job_Designation : " + designation+"\n"
				+ "Salary : " + salary);
						
	}
	public void increaseSalary(double percentage){ // Method to calculate percentage of salary
		double amt = salary * (percentage/100);
		salary += amt;
		System.out.println("Salary of the employee after increased with percentage : " +salary);
	}
	
	public void increaseSsalary(double percentage, double bonus) { // Method to calculate percentage and bonus of salary
		double amt = (salary *(percentage/100))+(salary*(bonus/100)) ;
		salary += amt;
		System.out.println("Salary of the employee after increased with percentage and bonus : "+salary);
	}
}
