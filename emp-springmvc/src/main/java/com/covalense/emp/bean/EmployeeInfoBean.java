package com.covalense.emp.bean;

import java.io.Serializable;

/*
EMPLOYEE_INFO
-------------
ID (PK) 	(INT)
DEPT_ID	(FK)(INT)
MNGR_ID		(INT)
NAME		(VARCHAR)
AGE			(INT)
GENDER		(VARCHAR)
JOINING_DATE	(DATE)
EMAIL			(VARCHAR)
ACCOUNT_NUMBER	(LONG)
PHONE_NUMBER	(LONG)
SALARY			(DOUBLE)
DESIGNATION		(VARCHAR)
DOB				(DATE)

*/

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "employee_info")
@Data
public class EmployeeInfoBean implements Serializable {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	@Column(name = "gender")
	private String gender;

	@Column(name = "salary")
	private double salary;

	@Column(name = "phone_number")
	private long phone;

	@Column(name = "joining_date")
	private Date joiningDate;

	@Column(name = "account_number")
	private int accountNo;

	@Column(name = "email_id")
	private String email;

	@Column(name = "designation")
	private String designation;

	@Column(name = "date_of_birth")
	private Date dob;

	@Column(name = "dept_id")
	private int departmentId;

	@Column(name = "mngr_id")
	private int managerId;

	@Column(name = "password")
	private String password;

}// end of class
