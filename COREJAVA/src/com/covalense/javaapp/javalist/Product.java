package com.covalense.collection.javalist;

public class Product implements Comparable<Product> {
	String name;
	int cost;
	double rating;

	public int compareTo(Product o) {
		if (this.cost < o.cost) {
			return -1;
		} else if (this.cost > o.cost) {
			return 1;
		} else {
			return 0;
		}
	}
}
