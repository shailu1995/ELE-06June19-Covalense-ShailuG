package com.covalense.mywebapp.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="department_info")
	public class EmployeeDepartmentInfoBean {
	@Id
	@Column(name="id")
	private int deptid ;  
	@Column(name="name")
	private String deptname; 
	}//end of class

