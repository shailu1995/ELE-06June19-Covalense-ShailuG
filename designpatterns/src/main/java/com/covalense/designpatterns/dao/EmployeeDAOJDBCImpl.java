package com.covalense.designpatterns.dao;

import java.sql.*;
import java.util.ArrayList;

import com.covalense.designpatterns.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public final class EmployeeDAOJDBCImpl implements EmployeeDAO {
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		String query = "select * from employee_info";
		String dbUrl = "jdbc:mysql://localhost:3306/covalense";
		try (Connection con = DriverManager.getConnection(dbUrl, "root", "root");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			log.info("connection impl class===>" + con.getClass());
			ArrayList<EmployeeInfoBean> beans = new ArrayList<EmployeeInfoBean>();
			while (rs.next()) {
				EmployeeInfoBean bean = new EmployeeInfoBean();
				bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("name"));
				bean.setAge(rs.getInt("age"));
				bean.setGender(rs.getString("gender"));
				bean.setSalary(rs.getDouble("salary"));
				bean.setJoiningdate(rs.getDate("joining_date"));
				bean.setAcnt_no(rs.getLong("account_number"));
				bean.setEmail(rs.getString("email_id"));
				bean.setDesignation(rs.getString("designation"));
				bean.setDob(rs.getDate("date_of_birth"));
				bean.setDepartmentId(rs.getInt("dept_id"));
				bean.setManagerid(rs.getInt("mngr_id"));

				beans.add(bean);
			}
			return beans;
		} catch (SQLException | InstantiationException | ClassNotFoundException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}

	public EmployeeInfoBean getEmployeeInfo(String id) {
		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}
	}// end of employeeInfo(string)

	public EmployeeInfoBean getEmployeeInfo(int id) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String query = null;
		Driver driver;
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String dbUrl = "jdbc:mysql://localhost:3306/covalense";
			con = DriverManager.getConnection(dbUrl, "root", "root");
			log.info("connection impl class===>" + con.getClass());

			// 3.issue "sql queries" via "connection"
			query = "select * from employee_info" + " WHERE id=? ";
			stmt = con.prepareStatement(query);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();

			EmployeeInfoBean bean = new EmployeeInfoBean();
			while (rs.next()) {
				bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("name"));
				bean.setAge(rs.getInt("age"));
				bean.setGender(rs.getString("gender"));
				bean.setSalary(rs.getDouble("salary"));
				bean.setJoiningdate(rs.getDate("joining_date"));
				bean.setAcnt_no(rs.getLong("account_number"));
				bean.setEmail(rs.getString("email_id"));
				bean.setDesignation(rs.getString("designation"));
				bean.setDob(rs.getDate("date_of_birth"));
				bean.setDepartmentId(rs.getInt("dept_id"));
				bean.setManagerid(rs.getInt("mngr_id"));

			}
			return bean;

		} catch (Exception e) {

			e.printStackTrace();
			return null;
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

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
