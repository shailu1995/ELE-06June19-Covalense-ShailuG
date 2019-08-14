package com.covalense.springrest.bean;

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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.extern.java.Log;

@SuppressWarnings("serial")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@JsonRootName(value = "emp_info")
@Table(name = "employee_info")
@Entity

//@XmlRootElement(name = "employee-info-bean")
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeInfoBean implements Serializable {

	// @XmlElement(name = "other-info")
	@JsonProperty(value = "other-info")
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "infoBean")
	private EmployeeOtherInfo employeeOtherBean;

	// @XmlElement(name = "address-info")
	@JsonProperty(value = "address-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "addressPKBean.infoBean")
	private List<EmployeeAddressInfo> addressInfos;

	// @XmlElement(name = "education-info")
	@JsonProperty(value = "education-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employeeEducationalPKBean.infoBean")
	private List<EmployeeEducationalInfoBean> educationaInfo;

	// @XmlElement(name = "experience-info")
	@JsonProperty(value = "experience-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employeeExperiencePKBean.infoBean")
	private List<EmployeeExperienceInfoBean> experienceInfoBean;

	// @XmlElement(name = "training-info")
	@JsonProperty(value = "training-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "employeeInfoBeans")
	private List<TrainingInfoBean> trainingInfoBean;

	// @XmlElement(name = "emp-id")
	//@JsonProperty(value = "emp-id")
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private Integer age;

	@Column(name = "gender")
	private String gender;

	@Column(name = "salary")
	private Long salary;

	@Column(name = "phone_number")
	private Long phone;

	@Column(name = "joining_date")
	private Date joiningdate;

	@Column(name = "account_number")
	private Long acnt_no;

	@Column(name = "email_id")
	private String email;

	@Column(name = "designation")
	private String designation;

	@Column(name = "date_of_birth")
	private Date dob;

	@Column(name = "password")
	private String password;

	// @XmlElement(name = "dept-id")
	@JsonProperty(value = "dept-id")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dept_id", referencedColumnName = "dept_id")
	private DepartmentInfoBean departmentInfoBean;

	/*
	 * @Column(name = "mngr_id") private int managerid;
	 */

	// @XmlElement(name = "manager-id")
	@JsonProperty(value = "manager-id")
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "mngr_id", referencedColumnName = "id")
	private EmployeeInfoBean managerid;

	public EmployeeOtherInfo getEmployeeOtherBean() {
		return employeeOtherBean;
	}

	public void setEmployeeOtherBean(EmployeeOtherInfo employeeOtherBean) {
		this.employeeOtherBean = employeeOtherBean;
	}

	public List<EmployeeAddressInfo> getAddressInfos() {
		return addressInfos;
	}

	public void setAddressInfos(List<EmployeeAddressInfo> addressInfos) {
		this.addressInfos = addressInfos;
	}

	public List<EmployeeEducationalInfoBean> getEducationaInfo() {
		return educationaInfo;
	}

	public void setEducationaInfo(List<EmployeeEducationalInfoBean> educationaInfo) {
		this.educationaInfo = educationaInfo;
	}

	public List<EmployeeExperienceInfoBean> getExperienceInfoBean() {
		return experienceInfoBean;
	}

	public void setExperienceInfoBean(List<EmployeeExperienceInfoBean> experienceInfoBean) {
		this.experienceInfoBean = experienceInfoBean;
	}

	public List<TrainingInfoBean> getTrainingInfoBean() {
		return trainingInfoBean;
	}

	public void setTrainingInfoBean(List<TrainingInfoBean> trainingInfoBean) {
		this.trainingInfoBean = trainingInfoBean;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Date getJoiningdate() {
		return joiningdate;
	}

	public void setJoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}

	public Long getAcnt_no() {
		return acnt_no;
	}

	public void setAcnt_no(Long acnt_no) {
		this.acnt_no = acnt_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public DepartmentInfoBean getDepartmentInfoBean() {
		return departmentInfoBean;
	}

	public void setDepartmentInfoBean(DepartmentInfoBean departmentInfoBean) {
		this.departmentInfoBean = departmentInfoBean;
	}

	public EmployeeInfoBean getManagerid() {
		return managerid;
	}

	public void setManagerid(EmployeeInfoBean managerid) {
		this.managerid = managerid;
	}
}
