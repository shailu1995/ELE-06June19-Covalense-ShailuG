package com.covalense.hibernate.onetoone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.covalense.hibernate.bean.onetoone.EmployeeOtherInfo;

import lombok.extern.java.Log;

@Log
public class PrepareDataUtil {
	private PrepareDataUtil() {
	}

	public static EmployeeInfo perpareData(int id) {
		EmployeeInfo empinf = new EmployeeInfo();
		empinf.setId(id);
		empinf.setName("amanda");
		empinf.setAge(31);
		empinf.setGender("female");
		empinf.setSalary(10020);
		empinf.setPhone(919678013212L);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		try {
			date = format.parse("2019-10-10");
			empinf.setJoiningDate(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		empinf.setAccno(10003995345676L);
		empinf.setEmail("inana@gmail.com");
		empinf.setDesignation("singer");
		Date date2;
		try {
			date2 = format.parse("1991-10-10");
			empinf.setDob(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		empinf.setDeptid(6);
		empinf.setMngrid(21);

		EmployeeOtherInfo empOtherInf = new EmployeeOtherInfo();
		empOtherInf.setId(id);
		empOtherInf.setPan("AUAPV7292B");
		empOtherInf.setIsmarried(true);
		empOtherInf.setBloodgroup("b+");
		empOtherInf.setIschallenged(false);
		empOtherInf.setEmergencyContactNumber(919916013212L);
		empOtherInf.setNationality("india");
		empOtherInf.setReligion("hindu");
		empOtherInf.setFatherName("surendra");
		empOtherInf.setMotherName("amba");
		empOtherInf.setSpouseName("arod");
		empOtherInf.setPassport("4623423");
		empOtherInf.setAdhaar(123456789012L);

		empinf.setOtherInfo(empOtherInf);
		return empinf;
	}//end of constructor
}// end of class
