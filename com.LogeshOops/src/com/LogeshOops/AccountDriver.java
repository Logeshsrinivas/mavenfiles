package com.LogeshOops;
/**
 * Application to design customer and account 
 * @author Logesh
 * @since 0.1
 */
import java.util.Scanner;

public class AccountDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); // Creating Scanner object to read input from console
		System.out.println("Enter the customer id ");
		int id = sc.nextInt();
		
		System.out.println("Enter Customer Name :");
		String name = sc.next();
		
		System.out.println("Enter customer Gender(M/F) : ");
		char gender = sc.next().charAt(0);
		
		System.out.println("Enter Account Id :");
		int aId = sc.nextInt();
		
		System.out.println("Enter Salary :");
		double sal = sc.nextDouble();
		
		Customer c = new Customer(id,name,gender); // Creating object and initializing for customer 
		Account a = new Account(aId,c,sal); // Creating object and initializing for Account	
		
		System.out.println("Account_ID : " + a.getId()+"\n"   // Printing informations
						+ "Customer_ID : " + c.getId()+"\n"
						+ "Customer_Name : " + c.getName()+"\n"
						+ "Customer_Gender : " + c.getGender()+"\n"
						+ "Account_Balance : " + a.getBalance());
		
		boolean flag =true;
		
		while(flag) { // Creating while loop for options
			System.out.println("1. Withdraw \n"
					+ "2. Deposit \n"
					+ "3. Check Balance \n"
					+ "4. Exit");
			
			int n = sc.nextInt();
			
			if(n==1) { // if the option is 1 it will implement
				System.out.println("Enter Positive Amount to Withdraw : ");
				double amt = sc.nextDouble();
				if(amt<0||(amt>='a'&& amt<='z')||(amt>='A' &&amt <='A')) {
					System.out.println("Enter valid amount to withdraw");
				}
				else if (amt<=a.getBalance()) 
				a.withdraw(amt); // calling withdraw method
				else System.out.println("Amount withdrawn Exceeds the Current Balance");
			}
			else if(n==2) {// if the option is 2 it will implement
					System.out.println("Enter Amount to deposit : ");
					double amt = sc.nextDouble();
					a.deposit(amt); // calling deposit method
					System.out.println("Amount Deposited SucessFully");
			}else if (n==3) { // if the option is 3 it will implement
					System.out.println("Current Balance : " + a.getBalance());
			}else if (n==4) { // if the option is 4 it will implement
				System.out.println("Thank You for Banking With us!");
				flag=false;
				break;
			}
			
		}

	}

}
