package com.LogeshOops;

import java.util.Scanner;

/**
 * Application to design Products and its types 
 * @author Logesh
 * @since 0.1
 */

public class TestProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); // Creating a Scanner object to read input from Console
		
		System.out.println("Enter the electronic Product id ");
		int id = sc.nextInt();
		
		System.out.println("Enter electronic Product Name :");
		String name = sc.next();
		
		System.out.println("Enter electronic price :");
		double price = sc.nextDouble();
		
		System.out.println("Enter waranty period of electronic product : ");
		int waranty = sc.nextInt();
		
		System.out.println("Enter the Clothing Product id ");
		int id1 = sc.nextInt();
		
		System.out.println("Enter Clothing Product Name :");
		String name1 = sc.next();
		
		System.out.println("Enter Clothing Product price :");
		double price1 = sc.nextDouble();
		
		System.out.println("Enter Clothing product size : ");
		String size = sc.next();
		
		System.out.println("Enter Clothing product Material : ");
		String material = sc.next();
		
		ClothingProduct c = new ClothingProduct(id1,name1,price,size, material); // Creating a object and initializing for Clothing Product
		ElectronicProduct e = new ElectronicProduct(id,name, price, waranty); // Creating a object and initializing for Electronic Product
		
		System.out.println("Electronic Product Information :");
		e.displayInfo(); // Calling DisplayInfo method
		
		System.out.println("Clothing Product Information :");
		c.displayInfo(); // Calling DisplayInfo method

	}

}
