package com.covalense.hibernate.manytone;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_educational_info")
public class EmployeeEducationalInfoBean implements Serializable {

	@EmbeddedId
	private EmployeeEducationalPKBean employeeEducationalPKBean;

	/*
	 * @Column(name = "educational_type") private String educationaltype;
	 */
	@Column(name = "degree_type")
	private String degreeType;
	@Column(name = "branch")
	private String branch;
	@Column(name = "college_name")
	private String collegeName;
	@Column(name = "univercity")
	private String university;
	@Column(name = "percentage")
	private Double percentage;
	@Column(name = "location")
	private String location;
	@Column(name = "yop")
	private Date yop;

}// end of class
