package com.covalense.javaapp.streamassignments;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;

@Log
public class TestProductSort {

	public static void main(String[] args) {

		ArrayList<Product> al = new ArrayList<Product>();

		Product p1 = new Product("car", 800000, "BMW");
		Product p2 = new Product("Mobile", 20000, "Samsung");
		Product p3 = new Product("Laptop", 100000, "Apple");

		al.add(p1);
		al.add(p2);
		al.add(p3);

		Comparator<Product> c = (i, j) -> {
			if (i.getCost() > j.getCost()) {
				return 1;
			} else if (i.getCost() < j.getCost()) {
				return -1;
			} else {
				return 0;
			}
		};

		al.stream().sorted(c).forEach(i -> log.info("" + i));

	}

}
