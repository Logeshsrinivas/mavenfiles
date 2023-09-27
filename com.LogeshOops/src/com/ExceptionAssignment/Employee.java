package com.ExceptionAssignment;

import java.time.LocalDate;
import java.time.Period;


class InvalidEmpNumberException extends Exception{
	public InvalidEmpNumberException(String message) {
		super(message);
	}
}
class InvaildDateofJoining extends Exception{
	public InvaildDateofJoining(String message) {
		super(message);
	}
}

class Employee{
	private int employeecode;
	private String name;
	private LocalDate dateofBirth;
	private LocalDate dateofAppointment;
	
	public Employee(int employeecode, String name, LocalDate dateofBirth, LocalDate dateofAppointment) {
		super();
		this.employeecode = employeecode;
		this.name = name;
		this.dateofBirth = dateofBirth;
		this.dateofAppointment = dateofAppointment;
	}

	public int getEmployeecode() {
		return employeecode;
	}

	public void setEmployeecode(int employeecode) {
		this.employeecode = employeecode;
	}
welcome to chennai.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public LocalDate getDateofAppointment() {
		return dateofAppointment;
	}

	public void setDateofAppointment(LocalDate dateofAppointment) {
		this.dateofAppointment = dateofAppointment;
	}
	public int getYearsOfExperience() {
        return Period.between(dateofAppointment, LocalDate.now()).getYears();
    }
	
}
		
	


