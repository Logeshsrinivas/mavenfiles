package com.LogeshOops;
/**
 * Application to design customer and account 
 * @author Logesh
 * @since 0.1
 */


public class Customer {
	private int id;// Declaring private int variable
	private String name; // Declaring private String variable
	private char gender; // Declaring private char variable
	
	public Customer(int id, String name, char gender) { // creating three argument constructor
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	public int getId() { // Getter Method
		return id;
	}

	public String getName() { // Getter Method
		return name;
	}

	public char getGender() { // Getter Method
		return gender;
	}
	@Override
	public String toString() { // Method to print values
		return "Customer Nanme(ID) : " + name +"("+id+")";
		
	}
	
	

}
