package com.LogeshOops;
/**
 * Application to design customer and account 
 * @author Logesh
 * @since 0.1
 */

public class Account {
	private int id; // Declaring private int variable
	private Customer customer; // Declaring private customer object
	private double balance = 0.0; // Declaring private double variable
	public Account(int id, Customer customer) { // creating two argument constructor
		this.id = id;
		this.customer = customer;
	}
	public Account(int id, Customer customer, double balance) { // creating three argument constructor
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}
	public int getId() { // Getter Method
		return id;
	}
	public Customer getCustomer() { // Getter Method
		return customer;
	}
	public double getBalance() { // Getter Method
		return balance;
	}
	public void setBalance(double balance) { // Setter Method
		this.balance = balance;
	}
	@Override
	public String toString() { // Method to print values
		return "" + customer.toString() +"balance" + balance;
	}
	public String getCustomerName() { // Method to get customer name
		return customer.getName();
	}
	public double deposit(double amount) { // Method to deposit amount
		return balance+=amount;
		 
	}
	public double withdraw(double amount) { // Method to withdraw amount
		if(balance>=amount) {
			balance-=amount;
			System.out.println(amount + ": Withdrawn Sucessfully");
		}
		return balance;
		
	}
}
