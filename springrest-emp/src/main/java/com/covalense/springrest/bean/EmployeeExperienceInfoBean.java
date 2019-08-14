package com.covalense.springrest.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;

@Entity
@Table(name = "employee_experience_info")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeExperienceInfoBean implements Serializable{
	
	@EmbeddedId
	private EmployeeExperiencePKBean employeeExperiencePKBean;

	@Column(name="designation")
	private String designation;
	
	@Column(name="joining_date")
	private Date joiningdate;
	
	@Column(name="leaving_date")
	private Date leavingdate;

	public EmployeeExperiencePKBean getEmployeeExperiencePKBean() {
		return employeeExperiencePKBean;
	}

	public void setEmployeeExperiencePKBean(EmployeeExperiencePKBean employeeExperiencePKBean) {
		this.employeeExperiencePKBean = employeeExperiencePKBean;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getJoiningdate() {
		return joiningdate;
	}

	public void setJoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}

	public Date getLeavingdate() {
		return leavingdate;
	}

	public void setLeavingdate(Date leavingdate) {
		this.leavingdate = leavingdate;
	}

	
}// end of class
