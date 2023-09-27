package com.LogeshOops;
/**
 * Application to design Products and its types 
 * @author Logesh
 * @since 0.1
 */

public abstract class Product {
	private int productId; // Declaring private int variable
	private String productName; // Declaring private String variable
	private double price; // Declaring private Double variable
	
	public Product(int productId, String productName, double price) { // creating three argument constructor
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	public int getProductId() { // Getter Method
		return productId;
	}
	public String getProductName() {// Getter Method
		return productName;
	}
	public double getPrice() { // Getter Method
		return price;
	}
	abstract void displayInfo(); // abstract method
}
