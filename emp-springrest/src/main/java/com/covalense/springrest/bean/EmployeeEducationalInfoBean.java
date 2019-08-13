package com.covalense.springrest.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;
import lombok.ToString;

@ToString
@Entity
@Table(name = "employee_educational_info")
public class EmployeeEducationalInfoBean implements Serializable {

	@XmlTransient
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
	public EmployeeEducationalPKBean getEmployeeEducationalPKBean() {
		return employeeEducationalPKBean;
	}
	public void setEmployeeEducationalPKBean(EmployeeEducationalPKBean employeeEducationalPKBean) {
		this.employeeEducationalPKBean = employeeEducationalPKBean;
	}
	public String getDegreeType() {
		return degreeType;
	}
	public void setDegreeType(String degreeType) {
		this.degreeType = degreeType;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getYop() {
		return yop;
	}
	public void setYop(Date yop) {
		this.yop = yop;
	}
	

}// end of class
