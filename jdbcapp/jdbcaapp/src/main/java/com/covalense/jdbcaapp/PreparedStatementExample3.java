package com.covalense.jdbcaapp;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

import lombok.extern.java.Log;

@Log
public final class PreparedStatementExample3 {
	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement stmt = null;
		int rs;

		// String query = null;
		// String query1 = null;
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
			String query = "insert into employee_info(id,name,dept_id,mngr_id)" + " values(?,?,?,?)";

			stmt = con.prepareStatement(query);
			stmt.setInt(1, Integer.parseInt(args[0]));
			stmt.setString(2, args[1]);
			stmt.setInt(3, Integer.parseInt(args[2]));
			stmt.setInt(4, Integer.parseInt(args[3]));
			rs = stmt.executeUpdate();
			log.info("" + rs);

			/*
			 * stmt.setInt(3, Integer.parseInt(args[2])); stmt.setString(4, args[3]);
			 * stmt.setDouble(5, Double.parseDouble(args[4])); stmt.setLong(6,
			 * Long.parseLong(args[5]));
			 */

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
