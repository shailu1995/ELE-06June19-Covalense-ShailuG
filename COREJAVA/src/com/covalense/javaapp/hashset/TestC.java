package com.covalense.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("swati");
		h.add("mom");
		h.add("dad");
		h.add("bro");
		h.add("didu");

		System.out.println("FOR EACH LOOP OUTPUT ");
		for (String r : h) {
			System.out.println(r);
		}

		System.out.println("Iterator OUTPUT ");
		Iterator<String> it = h.iterator();
		while (it.hasNext()) {
			String r = it.next();
			System.out.println(r);
		}
	}

}
