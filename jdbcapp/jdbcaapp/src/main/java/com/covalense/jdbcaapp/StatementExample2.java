package com.covalense.jdbcaapp;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

import lombok.extern.java.Log;

@Log
public final class StatementExample2 {
	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		int n;
		int n1;
		String query = null;
		String query1 = null;
		// 1.load the "driver"
		Driver driver;
		try {

			/*
			 * driver = new Driver(); DriverManager.deregisterDriver(driver);
			 */

			Class.forName("com.mysql.jdbc.Driver").newInstance();
			// 2.get the db connected to the driver
			// String dbUrl =
			// "jdbc:mysql://localhost:3306/covalense?user=root&password=root";
			// con = DriverManager.getConnection(dbUrl);

			String dbUrl = "jdbc:mysql://localhost:3306/covalense";
			con = DriverManager.getConnection(dbUrl, "root", "root");
			log.info("connection impl class===>" + con.getClass());

			// 3.issue "sql queries" via "connection"
			query = "insert into employee_info values(999,'SHANU',89,'M',25000,8955545522,'2019-01-01',2255544,'sharma@gmail.com','engg','2019-07-01',23,23)";
			query1 = "insert into employee_info values(666,'sharma',89,'M',25000,8955545522,'2019-01-01',"
					+ "2255544,'sharma@gmail.com','engg','2019-07-01',223,23)";
			stmt = con.createStatement();
			n = stmt.executeUpdate(query);
			log.info("" + n);
			n1 = stmt.executeUpdate(query1);
			log.info("" + n1);

			//

		} catch (SQLException | InstantiationException | ClassNotFoundException | IllegalAccessException e) {

			e.printStackTrace();
		} finally {

			try {
				if (con != null) {
					con.close();
					if (stmt != null) {
						stmt.close();
					}

				}
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}
}
