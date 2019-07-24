package com.covalense.hibernate.dto;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "EmployeeEducationalInfo")
@Data
public class EmployeeEducationalInfoBean implements Serializable {
	@Id
	@Column(name = "id")
	private int id;
	@Id
	@Column(name = "educational_type")
	private String educationaltype;
	@Id
	@Column(name = "degree_Type")
	private String degreeType;
	@Id
	@Column(name = "branch")
	private String branch;
	@Id
	@Column(name = "college_Name")
	private String collegeName;
	@Id
	@Column(name = "university")
	private String university;
	@Id
	@Column(name = "percentage")
	private Double percentage;
	@Id
	@Column(name = "location")
	private String location;
	@Id
	@Column(name = "yop")
	private Date yop;

}// end of class
