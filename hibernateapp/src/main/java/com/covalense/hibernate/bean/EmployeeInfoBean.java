package com.covalense.hibernate.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.covalense.hibernate.bean.onetoone.EmployeeOtherInfo;
import com.covalense.hibernate.manytomany.TrainingInfoBean;
import com.covalense.hibernate.manytone.EmployeeAddressInfo;
import com.covalense.hibernate.manytone.EmployeeEducationalInfoBean;
import com.covalense.hibernate.manytone.EmployeeExperienceInfoBean;

import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Table(name = "employee_info")
@Data
public class EmployeeInfoBean implements Serializable {
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "infoBean")
	private EmployeeOtherInfo employeeOtherBean;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "addressPKBean.infoBean")
	private List<EmployeeAddressInfo> addressInfos;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "employeeEducationalPKBean.infoBean")
	private List<EmployeeEducationalInfoBean> educationaInfo;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "employeeExperiencePKBean.infoBean")
	private List<EmployeeExperienceInfoBean> experienceInfoBean;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "employeeInfoBeans")
	private List<TrainingInfoBean> trainingInfoBean;
	
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	@Column(name = "gender")
	private String gender;

	@Column(name = "salary")
	private long salary;

	@Column(name = "phone_number")
	private long phone;

	@Column(name = "joining_date")
	private Date joiningdate;

	@Column(name = "account_number")
	private long acnt_no;

	@Column(name = "email_id")
	private String email;

	@Column(name = "designation")
	private String designation;

	@Column(name = "date_of_birth")
	private Date dob;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "department_id", referencedColumnName = "dept_id")
	private DepartmentInfoBean departmentInfoBean;
	/*
	 * @Column(name = "mngr_id") private int managerid;
	 */

	@ManyToOne
	@JoinColumn(name = "mngr_id", referencedColumnName = "id")
	private EmployeeInfoBean managerid;
}
