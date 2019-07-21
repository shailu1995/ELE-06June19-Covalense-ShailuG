package com.covalense.hibernate.manytone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.covalense.hibernate.bean.EmployeeInfoBean;

import lombok.Data;
import lombok.ToString;
@Data
@ToString
@Embeddable
public class EmployeeExperiencePKBean implements Serializable {

	@ManyToOne
	@JoinColumn(name = "id")
	private EmployeeInfoBean infoBean;
	
	@Column(name="company_name")
	private String companyname;
	
	
	 
}
