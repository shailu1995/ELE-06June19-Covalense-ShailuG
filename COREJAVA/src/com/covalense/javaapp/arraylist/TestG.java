package com.covalense.collection.arraylist;

import java.util.ArrayList;

public class TestG {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(3.2);
		al.add(2.5);
		al.add(2.7);
		al.add(3.5);
		al.add(7.2);

		for (int i = 0; i < al.size(); i++) {
			Object r = al.get(i);
			System.out.println(r);
		}
	}

}
