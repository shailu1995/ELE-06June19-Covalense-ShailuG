package com.covalense.jadbcapp.connectionpool;

import java.io.FilterOutputStream;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public final class ConnctionPoolTest {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String query = null;
		ConnectionPool pool = null;
		try {
			pool = ConnectionPool.getConnectionPool();
			con = pool.getConnectionFromPool();
			// issue sql query via connection
			query = "select * from employee_info";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				log.info("id             ====> " + rs.getInt("ID"));
				log.info("name           ====> " + rs.getString("name"));
				log.info("age            ====> " + rs.getInt("age"));
				log.info("gender         ====> " + rs.getString("gender"));
				log.info("salary         ====> " + rs.getDouble("salary"));
				log.info("phone          ====> " + rs.getLong("phone_number"));
				log.info("joining_date   ====> " + rs.getDate("joining_date"));
				log.info("account_number ====> " + rs.getLong("account_number"));
				log.info("email_id       ====> " + rs.getString("email_id"));
				log.info("designation    ====> " + rs.getString("designation"));
				log.info("date_of_birth  ====> " + rs.getDate("date_of_birth"));
				log.info("dept_id        ====> " + rs.getInt("dept_id"));
				log.info("mngr_id        ====> " + rs.getInt("mngr_id"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				pool.returnConnectionToPool(con);
				/*
				 * if (con != null) { con.close();
				 */
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}
}
