package com.covalense.javaapp.string;

public class TestProduct {

	public static void main(String[] args) {

		Product[] a = new Product[4];
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();

		p1.setName("tv");
		p1.setSize(35);
		p2.setName("laptop");
		p2.setSize(65);
		p3.setName("frize");
		p3.setSize(55);
		p4.setName("washing machine");
		p4.setSize(45);

		a[0] = p1;
		a[1] = p2;
		a[2] = p3;
		a[3] = p4;

		for (int i = 0; i < 4; i++) {
			System.out.println("name of Product " + a[i].getName() + " of size  " + a[i].getSize());
		}

	}

}
