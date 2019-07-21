package com.covalense.hibernate.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class CustomerBean implements Serializable {
	@Id
	@Column(name = "Id")
	private int id;

	@Column(name = "FirstName")
	private String firstname;

	@Column(name = "LastName")
	private String lastname;

	@Column(name = "contactNumber")
	private long contnum;

	@Column(name = "address")
	private String address;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "country")
	private String country;
}
