package com.covalense.javaapp.object;

public class Driver {
	void take(Parent p) {
		if (p instanceof Benz) {
			System.out.println("drive benz");
		} else if (p instanceof Audi) {
			System.out.println("drive audi");
		}
	}
}
