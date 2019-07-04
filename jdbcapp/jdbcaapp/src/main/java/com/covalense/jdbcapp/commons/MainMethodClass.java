package com.covalense.jdbcapp.commons;

@Log
public class MainMethodClass {

	public static void main(String[] args) {
		
		//String str =new ClassA();
		String dburl="two";

		Connection con=DriverManager.getConnection(dburl);
		con.printMessage();

	}

}
