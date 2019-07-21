package com.covalense.hibernate.manytomany;

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

import com.covalense.hibernate.bean.EmployeeInfoBean;

import lombok.Data;


@Data
@Entity
@Table(name = "employee_experience_info")
public class TrainingInfoBean implements Serializable {
	
	@Id
	@Column(name="course_id")
	private int courseid;
	@Column(name="course_name")
	private String coursename;
	@Column(name="duration")
	private String duration;
	@Column(name="course_type")
	private String coursetype;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="employee_training",
	joinColumns = {@JoinColumn(name="course_id")},
	inverseJoinColumns = {@JoinColumn(name="id")})
	List<EmployeeInfoBean> employeeInfoBeans;
}
