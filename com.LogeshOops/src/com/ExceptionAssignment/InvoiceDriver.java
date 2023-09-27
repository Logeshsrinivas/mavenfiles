package com.ExceptionAssignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InvoiceDriver {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the part number: ");
	        int partNumber = scanner.nextInt();

	        System.out.print("Enter the part description: ");
	        String partDescription = scanner.next();

	        System.out.print("Enter the quantity: ");
	        int quantity = scanner.nextInt();

	        System.out.print("Enter the price per item: ");
	        double pricePerItem = scanner.nextDouble();

	        try {
	            Invoice invoice = new Invoice(partNumber, partDescription, quantity, pricePerItem);
	            System.out.println("Invoice created successfully!");
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        } catch (InputMismatchException e) {
	            System.out.println("Invalid input type!");
	        }
	    }
	 

}
