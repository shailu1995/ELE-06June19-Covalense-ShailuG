package com.covalense.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class TestHashSet {

	public static void main(String[] args) {
		HashSet<Object> h = new HashSet<Object>();
		h.add("swati");
		h.add(2.5);
		h.add(58);
		h.add('k');
		h.add(null);

		System.out.println("*********FOR EACH LOOP OUTPUT********** ");
		for (Object r : h) {
			System.out.println(r);
		}

		System.out.println("*******Iterator OUTPUT********** ");
		Iterator<Object> it = h.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
		}

	}

}
