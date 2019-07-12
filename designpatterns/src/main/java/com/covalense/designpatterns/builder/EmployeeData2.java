package com.covalense.designpatterns.builder;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public final class EmployeeData2 {
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

	private EmployeeData2(EmployeeData2Builder builder) {
		id = builder.id;
		name = builder.name;
		age = builder.age;
		salary = builder.salary;
		phone = builder.phone;
		gender = builder.gender;
		joiningdate = builder.joiningdate;
		acnt_no = builder.acnt_no;
		email = builder.email;
		designation = builder.designation;
		dob = builder.dob;
		departmentId = builder.departmentId;
		managerid = builder.managerid;
	}

	public static class EmployeeData2Builder {
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

		public EmployeeData2Builder id(int id) {
			this.id = id;
			return this;
		}

		public EmployeeData2Builder name(String name) {
			this.name = name;
			return this;
		}

		public EmployeeData2Builder designation(String designation) {
			this.designation = designation;
			return this;
		}

		public EmployeeData2Builder age(int age) {
			this.age = age;
			return this;
		}

		public EmployeeData2Builder gender(String gender) {
			this.gender = gender;
			return this;
		}

		public EmployeeData2Builder phone(long phone) {
			this.phone = phone;
			return this;
		}

		public EmployeeData2Builder salary(double salary) {
			this.salary = salary;
			return this;
		}

		public EmployeeData2Builder joiningdate(Date joiningdate) {
			this.joiningdate = joiningdate;
			return this;
		}

		public EmployeeData2Builder acnt_no(long acnt_no) {
			this.acnt_no = acnt_no;
			return this;
		}

		public EmployeeData2Builder email(String email) {
			this.email = email;
			return this;
		}

		public EmployeeData2Builder dob(Date dob) {
			this.dob = dob;
			return this;
		}

		public EmployeeData2Builder departmentId(int departmentId) {
			this.departmentId = departmentId;
			return this;
		}

		public EmployeeData2Builder managerid(int managerid) {
			this.managerid = managerid;
			return this;
		}

		public EmployeeData2 build() {
			return new EmployeeData2(this);
		}

	}
}// end of class
