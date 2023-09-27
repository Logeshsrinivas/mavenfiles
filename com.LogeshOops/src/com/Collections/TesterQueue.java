package com.Collections;

import java.util.Arrays;
import java.util.PriorityQueue;

public class TesterQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue(Arrays.asList(56,11,77,32,54,99));
		System.out.println(pq);
		
		Laptop l1 = new Laptop("Dell","inspiration",45000);
		Laptop l2 = new Laptop("Lenovo","ideapad",56000);
		Laptop l3 = new Laptop("Hp","HpBook1",37000);
		Laptop l4 = new Laptop("Apple","MacBookPro",45000);
		
		
		PriorityQueue<Laptop> pql = new PriorityQueue();
		pql.add(l1);
		pql.add(l2);
		pql.add(l3);
		pql.add(l4);
		
	}

}
