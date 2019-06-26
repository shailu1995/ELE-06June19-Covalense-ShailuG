package com.covalense.javaapp.exception;

public class Irctc {
	void book() {
		System.out.println(" ticket booking");
		try {
		System.out.println(10/0);
		}
		catch(ArithmeticException ae) {
			System.out.println("Exceptions occured at book() ");
		}
		System.out.println(" ticket booked");
	}	

}
