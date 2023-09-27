package com.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TesterMap {

	public static void main(String[] args) {
		HashMap<String,Long> hm = new HashMap<>();
		hm.put("Praveen",9361109224l);
		hm.put("Logesh",9952008803l);
		hm.put("Deepak",8585898787l);
		hm.put("Om Prakash",9999999999l);
		hm.put("Jolly MAni", 1919191919l);
		hm.put("Keerthi",9969969966l);
		System.out.println("Size of the TreeMap is : " + hm.size());
		
		Set<Map.Entry<String,Long>> entry = hm.entrySet();
		
		for (Map.Entry<String,Long> e : entry) {
//			System.out.println(e.getKey() + " " +e.getValue());
			System.out.println("Keys :" + e.getKey());
			System.out.println("Values :" + e.getValue());
			
			
		}

	}

}
