package com.covalense.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestK {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("SWATI");
		al.add("GADMI");
		al.add("BIDAR");
		al.add("BKIT");
		al.add("TYSS");

		ListIterator<String> lit = al.listIterator();

		while (lit.hasNext()) {
			String r = lit.next();
			System.out.println(r);
		}
		System.out.println("************");

		Iterator<String> it = al.iterator();

		while (it.hasNext()) {
			String r = it.next();
			System.out.println(r);
		}

	}

}
