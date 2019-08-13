package com.covalense.springrest.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;
@Entity
@Table(name="department_info")
public class DepartmentInfoBean implements Serializable {
	
	@XmlTransient
	@Id
	@Column(name = "dept_id")
	private Integer deptid;

	@Column(name = "dept_name")
	private String deptname;

	public Integer getDeptid() {
		return deptid;
	}

	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
}
