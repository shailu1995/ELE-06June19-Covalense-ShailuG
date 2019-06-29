package com.covalense.collection.hashset;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestB {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();

		// HashMap<String, Integer> hm= new HashMap<String, Integer>();
		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		hm.put("four", 4);
		hm.put("five", 5);

		Set<String> ts = hm.keySet();
		for (String s : ts) {
			System.out.println(s);
		}

		Collection<Integer> ci = hm.values();
		Iterator<Integer> i = ci.iterator();
		while (i.hasNext()) {
			Integer r = i.next();
			System.out.println("VAL " + r);
		}
	}
}
