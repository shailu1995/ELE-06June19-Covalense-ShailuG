package com.covalense.hibernate.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="employee_info")
@Data
public class EmployeeInfoBean implements Serializable{
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private int age;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="salary")
	private long salary;
	
	@Column(name="phone_number")
	private long phone;
	
	@Column(name="joining_date")
	private Date joiningdate;
	
	@Column(name="account_number")
	private long acnt_no;
	
	@Column(name="email_id")
	private String email;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="date_of_birth")
	private Date dob;
	
	@Column(name="dept_id")
	private int deptid;
	
	@Column(name="mngr_id")
	private int managerid;
	
}
