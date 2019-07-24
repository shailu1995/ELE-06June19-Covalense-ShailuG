package com.covalense.spring.empmgnt.bean;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeExperienceInfoBean {
	private int id;
	private String companyname;
	private String designation;
	private Date joiningdate;
	private Date leavingdate;

}// end of class
