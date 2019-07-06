package com.covalense.jdbcaapp;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public final class JdbcWithAWSDB {
	public static void main(String[] args) {
		String query = "select * from employee_info";
		String dbUrl = "jdbc:mysql://shailugadmi.cvap8faycjot.ap-south-1.rds.amazonaws.com:3306/covalense";
      //try with resources;
		try (Connection con = DriverManager.getConnection(dbUrl, "root", "Shailaja23");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			log.info("connection impl class===>" + con.getClass());

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

		} catch (SQLException | InstantiationException | ClassNotFoundException | IllegalAccessException e) {

			e.printStackTrace();
		}

	}
}
