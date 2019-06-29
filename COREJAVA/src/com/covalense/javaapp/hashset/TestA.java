package com.covalense.collection.hashset;

import java.util.HashMap;
import java.util.Map;

public class TestA {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		hm.put("four", 4);
		hm.put("five", 5);
		for (Map.Entry<String, Integer> e : hm.entrySet()) {
			String key = e.getKey();
			Integer value = e.getValue();

			System.out.println("keyy---------" + key);
			System.out.println("value---------" + value);

			System.out.println("___________");

		}

	}
}
