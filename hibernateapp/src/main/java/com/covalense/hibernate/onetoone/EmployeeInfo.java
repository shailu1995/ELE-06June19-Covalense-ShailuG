package com.covalense.hibernate.onetoone;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.covalense.hibernate.bean.onetoone.EmployeeOtherInfo;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_info")
public class EmployeeInfo implements Serializable {

	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private EmployeeOtherInfo otherInfo;
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
	private long accno;

	@Column(name = "email_id")
	private String email;

	@Column(name = "designation")
	private String designation;

	@Column(name = "date_of_birth")
	private Date dob;

	@Column(name = "dept_id")
	private int deptid;

	@Column(name = "mngr_id")
	private int mngrid;

}
