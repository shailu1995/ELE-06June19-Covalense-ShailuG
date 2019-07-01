package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public class MyFirstJdbcProgram {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		// 1.load the "driver"
		Driver driver;
		try {
			driver = new Driver();
			DriverManager.deregisterDriver(driver);

			// 2.get the db connected to the driver
			String dbUrl = "jdbc:mysql://localhost:3306/covalense_db?user=root&password=root";
			con = DriverManager.getConnection(dbUrl);

			// 3.issue "sql queries" via "connection"
			String query = "select * from employee_info";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			//
			while (rs.next()) {
				log.info("id             ====> " + rs.getInt("ID"));
				log.info("name           ====> " + rs.getString("name"));
				log.info("age            ====> " + rs.getInt("age"));
				log.info("gender         ====> " + rs.getString("gender"));
				log.info("salary         ====> " + rs.getDouble("salary"));
				log.info("phone          ====> " + rs.getLong("phone"));
				log.info("joining_date   ====> " + rs.getDate("date"));
				log.info("account_number ====> " + rs.getLong("account number"));
				log.info("email_id       ====> " + rs.getInt("email_id"));
				log.info("designation    ====> " + rs.getString("designation"));
				log.info("date_of_birth  ====> " + rs.getDate("date_of_birth"));
				log.info("dept_id        ====> " + rs.getInt("department id"));
				log.info("mngr_id        ====> " + rs.getInt("managerid"));

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {

			try {
				if (con != null) {
					con.close();
					if (stmt != null) {
						stmt.close();
					}
					if (rs != null) {
						rs.close();
					}
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}
}
