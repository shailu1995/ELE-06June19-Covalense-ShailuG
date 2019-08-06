package com.covalense.hibernate.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="department_info")
public class DepartmentInfoBean implements Serializable {
	@Id
	@Column(name = "dept_id")
	private int deptid;

	@Column(name = "dept_name")
	private String deptname;
}
