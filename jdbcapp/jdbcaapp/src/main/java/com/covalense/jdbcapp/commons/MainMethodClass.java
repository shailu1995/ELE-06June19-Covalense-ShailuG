package com.covalense.jdbcapp.commons;

public class MainMethodClass {

	public static void main(String[] args) {

		String str = "one";
		Connection ref = DriverManager.getConnection(str);
		ref.printMessage();
	}// End of main

}// End of class
