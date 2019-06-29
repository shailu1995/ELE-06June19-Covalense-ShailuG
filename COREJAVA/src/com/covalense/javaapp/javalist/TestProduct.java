package com.covalense.collection.javalist;

import java.util.TreeSet;

public class TestProduct {

	public static void main(String[] args) {
		TreeSet<Product> t = new TreeSet<Product>();

		Product s1 = new Product();
		s1.name = "LIPSTIC";
		s1.cost = 600;
		s1.rating = 95.8;

		Product s2 = new Product();
		s2.name = "COMB";
		s2.cost = 200;
		s2.rating = 96.8;

		Product s3 = new Product();
		s3.name = "LAKME";
		s3.cost = 1000;
		s3.rating = 94.8;

		Product s4 = new Product();
		s4.name = "FAIRLOVELY";
		s4.cost = 90;
		s4.rating = 93.8;

		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);

		System.out.println("FOR EACH LOOP OUTPUT ");
		for (Product r : t) {
			System.out.println("name of product is " + r.name);
			System.out.println("cost of product " + r.cost);
			System.out.println("rating of product " + r.rating);
		}
	}

}
