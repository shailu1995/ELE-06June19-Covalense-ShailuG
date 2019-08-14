package com.covalense.springrest.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "TrainingInfoBean")
@XmlAccessorType(XmlAccessType.FIELD)
public class TrainingInfoBean implements Serializable {

	@Id
	@Column(name = "course_id")
	private Integer courseid;

	@Column(name = "course_name")
	private String coursename;
	@Column(name = "duration")
	private String duration;
	@Column(name = "course_type")
	private String coursetype;
	
	//@XmlTransient
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employee_training", joinColumns = { @JoinColumn(name = "course_id") }, inverseJoinColumns = {
			@JoinColumn(name = "id") })
	List<EmployeeInfoBean> employeeInfoBeans;

	public Integer getCourseid() {
		return courseid;
	}

	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getCoursetype() {
		return coursetype;
	}

	public void setCoursetype(String coursetype) {
		this.coursetype = coursetype;
	}

	public List<EmployeeInfoBean> getEmployeeInfoBeans() {
		return employeeInfoBeans;
	}

	public void setEmployeeInfoBeans(List<EmployeeInfoBean> employeeInfoBeans) {
		this.employeeInfoBeans = employeeInfoBeans;
	}
}
