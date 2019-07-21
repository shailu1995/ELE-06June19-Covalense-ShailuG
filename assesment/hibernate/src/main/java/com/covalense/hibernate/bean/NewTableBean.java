package com.covalense.hibernate.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "newtable")
public class NewTableBean implements Serializable{

	@Id
	@Column(name = "Id")
	private int id;

	@Column(name = "firstName")
	private String firstname;

	@Column(name = "lastName")
	private String lastname;

	@Column(name = "city")
	private String city;
}
