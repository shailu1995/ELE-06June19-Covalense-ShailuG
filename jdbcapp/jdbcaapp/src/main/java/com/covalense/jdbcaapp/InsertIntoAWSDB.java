package com.covalense.jdbcaapp;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

import lombok.extern.java.Log;

@Log
public final class InsertIntoAWSDB {
	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement stmt = null;
		int rs;

		// String query = null;
		// String query1 = null;
		// 1.load the "driver"
		Driver driver;
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			String dbUrl = "jdbc:mysql://shailugadmi.cvap8faycjot.ap-south-1.rds.amazonaws.com:3306/covalense";
			con = DriverManager.getConnection(dbUrl, "root", "Shailaja23");
			log.info("connection impl class===>" + con.getClass());

			String query = "insert into employee_info(id,name,dept_id,mngr_id)" + " values(?,?,?,?)";

			stmt = con.prepareStatement(query);
			stmt.setInt(1, Integer.parseInt(args[0]));
			stmt.setString(2, args[1]);
			stmt.setInt(3, Integer.parseInt(args[2]));
			stmt.setInt(4, Integer.parseInt(args[3]));
			rs = stmt.executeUpdate();
			log.info("" + rs);

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
