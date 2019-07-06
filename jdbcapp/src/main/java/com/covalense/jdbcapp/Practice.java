package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class Practice {
	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		
		try {
			Class.forName("my.sql.jdbc.Driver").newInstance();
			
			String dburl="";
			con.
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}