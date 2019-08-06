package com.covalense.hibernate.cache;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;
import lombok.extern.java.Log;
@Entity
@Data
@Table(name="employeenew")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class EmployeeNewInfo  {
	@Id
	@Column(name="eid")
	private int eid;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
}
