package com.covalense.hibernate.bean.onetoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.covalense.hibernate.bean.EmployeeInfoBean;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_otherinfo")
public class EmployeeOtherInfo implements Serializable {
	@Id
	@OneToOne
	@JoinColumn(name="id")
//  @PrimaryKeyJoinColumn(name="id")
	private EmployeeInfoBean infoBean;

	@Column(name = "pan_number")
	private String pan;

	@Column(name = "is_married")
	private boolean ismarried;

	@Column(name = "blood_group")
	private String bloodgroup;

	@Column(name = "is_challenged")
	private boolean ischallenged;

	@Column(name = "emergency_contact_num")
	private long emergencyContactNumber;
	
	@Column(name = "emergency_contact_name")
	private String emergencyContactName;

	@Column(name = "nationality")
	private String nationality;

	@Column(name = "religion")
	private String religion;

	@Column(name = "father_name")
	private String fatherName;

	@Column(name = "mother_name")
	private String motherName;

	@Column(name = "spouse_name")
	private String spouseName;

	@Column(name = "passport")
	private String passport;

	@Column(name = "adhar_number")
	private long adhaar;

}
