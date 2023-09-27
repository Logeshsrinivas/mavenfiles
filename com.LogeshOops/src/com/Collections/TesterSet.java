package com.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class TesterSet {

	public static void main(String[] args) {
		List<String> listNames = Arrays.asList("Cirs","Stephen","Maria","Merlin","Monica");
		
		HashSet<String> hs = new HashSet<String>(listNames);
		System.out.println(hs);
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>(listNames);
		System.out.println(lhs);
		
		TreeSet<String> ts = new TreeSet(listNames);
		System.out.println(ts);
		
		Laptop l1 = new Laptop("Dell","inspiration",45000);
		Laptop l2 = new Laptop("Lenovo","ideapad",56000);
		Laptop l3 = new Laptop("Hp","HpBook1",37000);
		Laptop l4 = new Laptop("Apple","MacBookPro",45000);
		TreeSet<Laptop> tsl = new TreeSet();
		tsl.add(l1);
		tsl.add(l2);
		tsl.add(l3);
		tsl.add(l4);
		System.out.println("-----------------------------------------------------------------------------");
		for (Laptop laptop : tsl) {
			System.out.println();
			
		}
		
}

}
