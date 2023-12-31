package com.Collections;

public class Laptop {
	private String brand;
	private String model;
	private float price;
	public Laptop() {
		super();
	}
	public Laptop(String brand,String model, int price) {
		this.brand = brand;
		this.model=model;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}
	public int comparable(Laptop o) {
		return this.getModel().compareTo(o.getModel());
	}
	

	
	
}
