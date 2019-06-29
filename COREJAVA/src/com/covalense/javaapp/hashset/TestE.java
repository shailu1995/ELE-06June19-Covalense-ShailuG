package com.covalense.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestE {

	public static void main(String[] args) {
		LinkedHashSet<String> lih = new LinkedHashSet<String>();
		lih.add("swati");
		lih.add("mom");
		lih.add("dad");
		lih.add("bro");
		lih.add("didu");

		System.out.println("FOR EACH LOOP OUTPUT ");
		for (String r : lih) {
			System.out.println(r);
		}

		System.out.println("Iterator OUTPUT ");
		Iterator<String> it = lih.iterator();
		while (it.hasNext()) {
			String r = it.next();
			System.out.println(r);
		}

	}

}
