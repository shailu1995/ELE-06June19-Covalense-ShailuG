package com.covalense.spring.empmgnt.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_addressinfo")
public class EmployeeAddressInfoBean {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "address_type")
	private String addressType;
	
	@Column(name = "address1")
	private String address1;
	
	@Column(name = "address2")
	private String address2;
	
	@Column(name = "landmark")
	private String landmark;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "pincode")
	private int pincode;

}// end of class
