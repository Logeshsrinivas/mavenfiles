package com.LogeshOops;
/**
 * Application to design Products and its types 
 * @author Logesh
 * @since 0.1
 */

public class ElectronicProduct extends Product {
	private int warrantyPeriod; // Declaring private int variable

	public ElectronicProduct(int productId, String productName, double price, int warrantyPeriod) { // creating four argument constructor
		super(productId, productName, price);
		this.warrantyPeriod = warrantyPeriod;
	}
	public int getWarrantyPeriod() { // Getter Method
		return warrantyPeriod;
	}
	@Override
	public void displayInfo() { // Method to print values
		System.out.println("Product_ID : " + super.getProductId()+"\n"
				+ "Product_NAme : " +super.getProductName()+"\n"
				+ "Price : " + super.getPrice()+"\n"
				+ "Warranty Period : " + getWarrantyPeriod()+" Months");		
	}
}
