package com.covalense.designpatterns.builder;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
public final class EmployeeData3 {
	private int id;
	private String name;
	private int age;
	private String gender;
	private double salary;
	private long phone;
	private Date joiningdate;
	private long acnt_no;
	private String email;
	private String designation;
	private Date dob;
	private int departmentId;
	private int managerid;
}// end of class
