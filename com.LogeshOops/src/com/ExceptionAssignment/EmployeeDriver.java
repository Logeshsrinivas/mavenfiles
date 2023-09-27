package com.ExceptionAssignment;

import java.util.Scanner;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class EmployeeDriver {

	public static void main(String[] args) {
	  ZoneId defaultZoneId = ZoneId.systemDefault();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee code: ");
		int employeecode=sc.nextInt();
		
		if(employeecode<=0) {
			try {
				throw new InvalidEmpNumberException ("Invalid Employee Code");
			} catch (InvalidEmpNumberException e) {
				System.out.println(e.getMessage());
				return;
			}
		}
			
		System.out.println("Enter the name:");
		sc.nextLine();
		String name=sc.nextLine();
		
		System.out.println("Enter the Date of Birth :");
		String dateofBirth=sc.nextLine();
		LocalDate DOB = LocalDate.parse(dateofBirth);
//		Date dob = Date.from(dob.atStartOfDay(defaultZoneId).toInstant());
		
		System.out.println("Enter the Date of Appointment:");
		String dateofAppointment=sc.nextLine();
		LocalDate DOJ = LocalDate.parse(dateofAppointment);
		
		 if (DOB.isAfter(DOJ)) {
	            try {
	                throw new InvaildDateofJoining ("Invalid Date of Join!");
	            } catch (InvaildDateofJoining e) {
	                System.out.println(e.getMessage());
	                return; // Exit the program
	            }
	        }

	        // Create an instance of the Employee class
	        Employee employee = new Employee(employeecode, name,DOB, DOJ);

	        // Display the details
	        System.out.println("\nEmployee Details:");
	        System.out.println("Employee code: " + employee.getEmployeecode());
	        System.out.println("Name: " + employee.getName());
	        System.out.println("Date of birth: " + employee.getDateofBirth());
	        System.out.println("Date of appointment: " + employee.getDateofAppointment());
	        
	         // Calculate years of experience
	         int yearsOfExperience = employee.getYearsOfExperience();
	         System.out.println("Years of experience: " + yearsOfExperience);
		
		
		
		
	}

}
