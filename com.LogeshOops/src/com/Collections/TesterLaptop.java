package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class TesterLaptop {

	public static void main(String[] args) {
		Laptop l1 = new Laptop("Dell","inspiration",45000);
		Laptop l2 = new Laptop("Lenovo","ideapad",56000);
		Laptop l3 = new Laptop("Hp","HpBook1",37000);
		Laptop l4 = new Laptop("Apple","MacBookPro",45000);
		
		ArrayList<Laptop> a1 = new ArrayList();
		a1.add(l1);
		a1.add(l2);
		a1.add(l3);
		a1.add(l4);
		Collections.sort(a1, new LaptopNameComparator());
//		Collections.sort(a1, new LaptopBrandComparator());
		Iterator<Laptop> iter = a1.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		System.out.println("----------------------------------------");
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
