package com.LogeshOops;
/**
 * Application to design Products and its types 
 * @author Logesh
 * @since 0.1
 */

public class ClothingProduct extends Product {
	private String size; // Declaring private String variable
	private String material; // Declaring private String variable
	public ClothingProduct(int productId, String productName, double price, String size, String material) { // Creating Five argument Constructor
		super(productId, productName, price);
		this.size = size;
		this.material = material;
	}
	public String getSize() { // Getter Method
		return size;
	}
	public String getMaterial() { // Getter Method
		return material;
	}
	@Override
	public void displayInfo() { // Method to print values
		System.out.println("Product_ID : " + super.getProductId()+"\n"
				+ "Product_NAme : " +super.getProductName()+"\n"
				+ "Price : " + "$"+super.getPrice()+"\n"
				+ "Size : " + getSize()+"\n"
				+ "Material  : " +getMaterial());		
	}

}
