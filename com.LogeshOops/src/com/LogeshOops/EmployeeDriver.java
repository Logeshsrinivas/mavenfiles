package com.LogeshOops;

import java.util.Scanner;

/**
* Application to calculate employee salary based on percentage and bonus
* @author Logesh
* @since 0.1
*/
public class EmployeeDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Creating a Scanner object to read input from console
		System.out.println("Enter the employee ID ");
		int id = sc.nextInt(); 
		
		System.out.println("Enter Employee Name :");
		String name = sc.next();
		
		System.out.println("Enter Employee Desigination :");
		String job = sc.next();
		
		System.out.println("Enter Employee Salary : ");
		double sal = sc.nextDouble();
		
		Employee e = new Employee(id,name,job, sal);// Creating and initializing object of Employee
		e.displayInfo();// calling displyaInfo method
		
		System.out.println("Enter the percentage of hike in salary : ");
		double per = sc.nextDouble();
		e.increaseSalary(per); // Passing percentage in increaseSalary method
		
		System.out.println("Enter the hike percentage of employee  : ");
		double per1 = sc.nextDouble();
		System.out.println("Enter the bonus of employee : ");
		double bon = sc.nextDouble();
		e.increaseSsalary(per, bon);  // Passing percentage ND bONUS in increaseSalary method
		

	}

}
