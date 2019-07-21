package com.covalense.hibernate.util;

import com.covalense.hibernate.bean.StudentInfoBean;
import com.covalense.hibernate.bean.StudentOtherinfoBean;

public class PreparedUtil {

	private PreparedUtil() {
	}

	public static StudentInfoBean prepareData(int rollNum) {
		StudentInfoBean studentInfo = new StudentInfoBean();
		studentInfo.setRollNum(rollNum);
		studentInfo.setName("rahul");
		studentInfo.setAge(23);
		studentInfo.setEmailId("rahul@gmail.com");
		studentInfo.setGender("f");
		studentInfo.setMobileNo(1258744l);

		StudentOtherinfoBean studentOtherinfo = new StudentOtherinfoBean();
		// studentOtherinfo.setRollNum(12);
		studentOtherinfo.setMotherName("savita");
		studentOtherinfo.setFatherName("shivu");
		studentOtherinfo.setNationality("india");
		studentOtherinfo.setReligion("hindu");

		studentInfo.setOtherInfo(studentOtherinfo);
		return studentInfo;
	}
}
