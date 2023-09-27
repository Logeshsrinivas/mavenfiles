package com.Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Occurance {

	public static void main(String[] args) {
		HashMap<Character,Integer> hm = new HashMap();
		String name = "malayalam";
		char[] ch = name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(hm.containsKey(ch[i])) {
				hm.put(ch[i], hm.get(ch[i])+1);
			}else {
				hm.put(ch[i], 1);
			}
		}
		
		Set<Entry<Character, Integer>> entry = hm.entrySet();
		for (Entry<Character, Integer> e : entry) {
			if(e.getValue()==1)
			System.out.println(e.getKey()+ " present :" + e.getValue() + " times");
		}
		System.out.println("--------------------------------------------------");
		List<char[]> l = Arrays.asList(ch);
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		for (int j = 0; j < ch.length; j++) {
		lhs.add(ch[j]);
		}
		for (Character c : lhs) {
			System.out.println(c);
			
		}
	}
}


