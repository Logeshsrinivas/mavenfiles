package com.stream;

import java.util.ArrayList;
import java.util.List;

public class TesterStreamObjects {
	public static ArrayList<Product> getProducts(){
		Product p1 = new Product(12,"Dell",25000.98f);
		Product p2 = new Product(11,"Lenovo",35800.78f);
		Product p3 = new Product(13,"Mac",35800.78f);
		Product p4 = new Product(14,"Samsung",25800.78f);
		Product p5 = new Product(17,"OnePlus",55800.78f);
		
		ArrayList<Product> alProducts = new ArrayList<Product>();
		alProducts.add(p1);
		alProducts.add(p2);
		alProducts.add(p3);
		alProducts.add(p4);
		alProducts.add(p5);
		
		return alProducts;
		
	}
	
	public static void main(String[] args) {
		List<Product> products = getProducts();
		Float f =products.stream()
			.filter(p->(p.getPrice()>30000.0f))
			.map(p->p.getPrice())
			.reduce(0.0f,(sum,p)->sum+p);
		System.out.println(f);
//			.forEach(x->System.out.println(x.getProductID() + "| " + x.getPrice() + " |" + x.getProductName()));
	Product pp =products.stream()
		.max((p1,p2)-> p1.getPrice()<p2.getPrice()?-1:0).get();
	System.out.println(pp.getPrice());
	}

}
