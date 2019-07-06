package com.covalense.designpatterns;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.covalense.designpatten.beans.EmployeeInfoBean;
import com.covalense.designpatterns.dao.EmployeeDAO;
import com.covalense.designpatterns.dao.EmployeeDAOFactory;
import com.covalense.designpatterns.dao.EmployeeDAOHibernateImpl;
import com.covalense.designpatterns.dao.EmployeeDAOJDBCImpl;

import lombok.extern.java.Log;
/**
 * Hello world!
 *
 */
@Log
public class DesignPattenTest {
	public static void main(String[] args) {
		//EmployeeDAO dao = new EmployeeDAOJDBCImpl();
		//EmployeeDAO dao = new EmployeeDAOHibernateImpl();
		EmployeeDAO dao =  EmployeeDAOFactory.getInstance();
		printData(dao.getEmployeeInfo(102));
		/*
		 * ArrayList<EmployeeInfoBean> beans=dao.getAllEmployeeInfo(); for
		 * (EmployeeInfoBean infobean : beans) { printData(infobean); }
		 */
		//create an employee info
		EmployeeInfoBean empInf = new EmployeeInfoBean();
		empInf.setId(156);
		empInf.setName("ranjita");
		empInf.setAge(23);
		empInf.setSalary(45000);
		empInf.setAcnt_no(255636312);
		empInf.setDepartmentId(15);
		empInf.setDesignation("software_engg");
		empInf.setEmail("shailu@gmail.com");
		empInf.setGender("f");
		empInf.setManagerid(2356451);
		empInf.setPhone(8971048836L);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
		Date date;
		try {
			date = format.parse("1999-10-26");
			empInf.setDob(date);
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		log.info(" "+dao.createEmployeeInfo(empInf));
		
	}
	private static void printData(EmployeeInfoBean infobean) {
		log.info("Id " + infobean.getId());
		log.info("Name " + infobean.getName());
		log.info("Age " + infobean.getAge());
		log.info("Salary " + infobean.getSalary());
		log.info("Account number" + infobean.getAcnt_no());
		log.info("Email_id " + infobean.getEmail());
		log.info("Gender " + infobean.getGender());
		log.info("Phone number " + infobean.getPhone());
		log.info("Designation " + infobean.getDesignation());
		log.info(" Department id" + infobean.getDepartmentId());
		log.info("Manager id " + infobean.getManagerid());
		log.info("Date of birth " + infobean.getDob());
		log.info("Joining date " + infobean.getJoiningdate());
	}
}
