package com.covalense.javaapp.collections;

import java.util.ArrayList;
import java.util.logging.Logger;

/*
 * WAP to store five product bean object into arraylist and display only
 *  the product which has a cost price less than the 2000
 */
public class TestProduct {

	private static final Logger log = Logger.getLogger("shailu");

	public static void main(String[] args) {
		ArrayList<Product> a = new ArrayList<Product>();
		Product p1 = new Product();
		p1.setName("bag");
		p1.setCost(10);
		p1.setRating(4.5);
		Product p2 = new Product();
		p2.setName("pen");
		p2.setCost(2200);
		p2.setRating(4.5);
		Product p3 = new Product();
		p3.setName("tv");
		p3.setCost(40000);
		p3.setRating(4.5);
		a.add(p1);
		a.add(p2);
		a.add(p3);
		for (Product p : a) {
			if (p.getCost() > 2000)
				log.info("name=" + p.getName() + " cost=" + p.getCost() + " rating=" + p.getRating());
		}

	}
}
