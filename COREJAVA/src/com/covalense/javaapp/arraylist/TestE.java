package com.covalense.collection.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestE {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(34);
		al.add("swati");
		al.add(null);
		al.add(3.2);
		al.add(null);

		ListIterator lit = al.listIterator(al.size());
		// ListIterator lit= al.listIterator(3);

		while (lit.hasPrevious()) {
			Object r = lit.previous();
			System.out.println(r);
		}
		;

	}

}
