package com.covalense.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(34);
		al.add("swati");
		al.add(null);
		al.add(3.2);
		al.add(null);

		Iterator it = al.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
		}

	}

}
