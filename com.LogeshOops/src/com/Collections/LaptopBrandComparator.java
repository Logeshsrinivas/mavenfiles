package com.Collections;

import java.util.Comparator;

public class LaptopBrandComparator implements Comparator<Laptop> {
	
	public int compare(Laptop o1, Laptop o2) {
        return o1.getBrand().compareTo(o2.getBrand());

    }

}
