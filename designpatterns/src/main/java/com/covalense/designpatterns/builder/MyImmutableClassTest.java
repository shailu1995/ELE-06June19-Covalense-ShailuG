package com.covalense.designpatterns.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.covalense.designpatterns.builder.EmployeeData2.EmployeeData2Builder;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {

	public static void main(String[] args) {
		MyImmutableClass immutableclass = null;
		immutableclass = new MyImmutableClass("SHAILU", 21, 8971048836L);
		log.info("name is" + immutableclass.getName());
		log.info("age is" + immutableclass.getAge());
		log.info("phone number" + immutableclass.getPhone());

		immutableclass = new MyImmutableClass("swati", 21, 7353258218L);
		log.info("name is" + immutableclass.getName());
		log.info("age is" + immutableclass.getAge());
		log.info("phone number" + immutableclass.getPhone());
		
		SimpleDateFormat format  =new SimpleDateFormat("yyyy-mm-dd");
		Date dates=null;
		try {
			dates = format.parse("2013-10-23");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		/*
		 * EmployeeData empData = new EmployeeData(11, "SHAILU", 25, "FEMale",35000.00,
		 * 5676567678l, dates, 1245044242l, "shailu@gmail.com", "software engineer",
		 * dates, 15, 11); log.info("Name :"+empData.getName());
		 * log.info("id :"+empData.getId());
		 */
		
		EmployeeData2 data2 = new EmployeeData2
				.EmployeeData2Builder()
				.id(10)
				.name("swati")
				.acnt_no(266645542L)
				.age(24)
				.departmentId(10)
				.designation("IT")
				.dob(dates)
				.email("h#gfma.cmo")
				.gender("male")
				.joiningdate(dates)
				.managerid(23)
				.phone(675876868989l)
				.salary(567576.0)
				.build();
		
		log.info("Employeee Data :" +data2.toString());
		
		EmployeeData3 data3 = new EmployeeData3.EmployeeData3Builder()
														.id(11)
														.name("sneha")
														.acnt_no(5675678768l)
														.age(21)
														.departmentId(11)
														.designation("IT")
														.dob(dates)
														.email("s@gmail.com")
														.gender("female")
														.joiningdate(dates)
														.managerid(23)
														.phone(675876868989l)
														.salary(567576.0)
														.build();	
		
		log.info("Employeee Data3 :" +data3.toString());
		

	
	}// end of main
}// end of class
