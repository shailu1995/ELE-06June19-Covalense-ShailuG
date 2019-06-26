package com.covalense.javaapp.exception;

public class Test1 {

	public static void main(String[] args) {
		char Null = 0;

		System.out.println("main started");

		try {
			System.out.println(12 / 0);

			System.out.println(Null);

		} catch (ArithmeticException ae) {
			System.out.println("sorry");
		} catch (NullPointerException ne) {
			System.out.println("really sry");
		}

		System.out.println("main started");

	}

}
