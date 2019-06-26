package com.covalense.javaapp.exception;


public class Test2 {
	void disp() {
		System.out.println("shailu");
		try {
		System.out.println(10/0);
		}
		catch(ArithmeticException ae) {
		System.out.println("swati");
		}
	}

}
