package com.Collections;

import java.util.Comparator;

public class LaptopPriceComprator implements Comparator<Laptop> {

	public int compare(Laptop o1, Laptop o2) {
		return (int)(o1.getPrice()-o2.getPrice());
	}

}
