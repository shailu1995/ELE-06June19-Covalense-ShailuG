package com.covalense.hibernate.manytone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.covalense.hibernate.bean.EmployeeInfoBean;

import lombok.Data;
@Data
@Entity
@Table(name="employee_addressinfo")
public class EmployeeAddressInfo implements Serializable {

	@EmbeddedId
	private EmployeeAddressPKBean addressPKBean;

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
	private long pincode;

}
