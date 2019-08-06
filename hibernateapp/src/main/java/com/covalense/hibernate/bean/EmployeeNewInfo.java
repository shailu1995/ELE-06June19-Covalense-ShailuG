package com.covalense.hibernate.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.extern.java.Log;


@Entity
@Data
@Table(name="employeenew")
public class EmployeeNewInfo implements Serializable {
	@Id
	@Column(name="eid")
	private int eid;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
}
