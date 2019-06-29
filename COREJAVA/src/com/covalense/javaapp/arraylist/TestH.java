package com.covalense.collection.arraylist;

import java.util.ArrayList;

public class TestH {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(34);
		al.add("swati");
		al.add(null);
		al.add(3.2);
		al.add(null);

		for (int i = 0; i < al.size(); i++) {
			Object r = al.get(i);
			System.out.println(r);
		}

	}

}
