package com.covalense.collection.arraylist;

import java.util.ArrayList;

public class TestA {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(34);
		al.add("swati");
		al.add(null);
		al.add(2.6);
		al.add("kingfisher");

		for (int i = 0; i < al.size(); i++) {
			Object r = al.get(i);
			System.out.println(r);
		}

	}

}
