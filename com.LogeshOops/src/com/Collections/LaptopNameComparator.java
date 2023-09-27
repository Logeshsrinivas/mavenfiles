package com.Collections;

import java.util.Comparator;

public class LaptopNameComparator implements Comparator<Laptop> {
	public int compare(Laptop o1, Laptop o2) {
        return o1.getModel().compareTo(o2.getModel());

    }

}
