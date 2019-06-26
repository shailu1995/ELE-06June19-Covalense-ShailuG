package com.covalense.javapp.inbuiltfunex;

public class Test3 {

	static void open() {
		System.out.println("-----open method-------");
		System.out.println("logic to open ");
	}

	public static void main(String[] args) {
		Room r = Test3::open;
		r.remove();

	}

}
