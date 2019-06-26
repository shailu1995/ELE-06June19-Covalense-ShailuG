package com.covalense.javapp.inbuiltfunex;

public class Test4 {

	static void sum(int a, int b) {
		System.out.println("------open method-------");
		System.out.println(a + b);

	}

	public static void main(String[] args) {
		Cal c = Test4::sum;
		c.add(10, 20);
	}

}
