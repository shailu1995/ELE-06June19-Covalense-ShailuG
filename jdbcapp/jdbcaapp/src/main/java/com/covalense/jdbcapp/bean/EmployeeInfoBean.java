package com.covalense.jdbcapp.bean;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeInfoBean {

	private int id;
	private String name;
	private int age;
	private String gender;
	private long salary;
	private long phone;
	private String email;
	private String designation;
	private Date dob;
	private long acnt_no;
	private Date joiningdate;
	private int deptid;
	private int managerid;

}// end of class
