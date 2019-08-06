package com.covalense.hibernate.inversemapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.covalense.hibernate.bean.EmployeeInfoBean;
import com.covalense.hibernate.bean.onetoone.EmployeeOtherInfo;
import com.covalense.hibernate.manytone.EmployeeAddressInfo;
import com.covalense.hibernate.manytone.EmployeeAddressPKBean;
import com.covalense.hibernate.manytone.EmployeeEducationalInfoBean;
import com.covalense.hibernate.manytone.EmployeeEducationalPKBean;
import com.covalense.hibernate.manytone.EmployeeExperienceInfoBean;
import com.covalense.hibernate.manytone.EmployeeExperiencePKBean;
import com.covalense.hibernate.model.HibernateImpl;

public class App {
public static void main(String[] args) {
	EmployeeInfoBean employeeInfoBean=new EmployeeInfoBean();
	employeeInfoBean.setId(7);
	employeeInfoBean.setName("vijet");
	
	EmployeeOtherInfo employeeOtherInfo=new EmployeeOtherInfo();
	employeeOtherInfo.setAdhaar(125475l);
	employeeOtherInfo.setEmergencyContactName("shweta");
	employeeOtherInfo.setInfoBean(employeeInfoBean);
	
	EmployeeAddressPKBean addressPKBean1=new EmployeeAddressPKBean();
	addressPKBean1.setAddressType("T");
	addressPKBean1.setInfoBean(employeeInfoBean);
	
	EmployeeAddressPKBean addressPKBean2=new EmployeeAddressPKBean();
	addressPKBean2.setAddressType("P");
	addressPKBean2.setInfoBean(employeeInfoBean);
	
	EmployeeAddressInfo addressInfo1=new EmployeeAddressInfo();
	addressInfo1.setAddressPKBean(addressPKBean1);
	addressInfo1.setAddress1("abc");
	addressInfo1.setAddress2("ABC");
	addressInfo1.setCity("bidar");
	addressInfo1.setCountry("india");
	addressInfo1.setLandmark("kjskd");
	addressInfo1.setState("karnataka");
	addressInfo1.setPincode(12345l);
	
	EmployeeAddressInfo addressInfo2=new EmployeeAddressInfo();
	addressInfo2.setAddressPKBean(addressPKBean2);
	addressInfo2.setAddress1("xyz");
	addressInfo2.setCity("glb");
	addressInfo2.setCountry("china");
	addressInfo2.setLandmark("hdfsgdh");
	addressInfo2.setPincode(172653l);
	addressInfo2.setState("bihar");
	
	EmployeeEducationalPKBean educationalPKBean1=new  EmployeeEducationalPKBean();
	educationalPKBean1.setEducatinaolType("full time");
	educationalPKBean1.setInfoBean(employeeInfoBean);
	
	EmployeeEducationalPKBean educationalPKBean2=new EmployeeEducationalPKBean();
	educationalPKBean2.setEducatinaolType("part time");
	educationalPKBean2.setInfoBean(employeeInfoBean);
	
	EmployeeEducationalInfoBean educationalInfoBean1=new EmployeeEducationalInfoBean();
	educationalInfoBean1.setEmployeeEducationalPKBean(educationalPKBean1);
	educationalInfoBean1.setBranch("EC");
	educationalInfoBean1.setCollegeName("bkit");
	educationalInfoBean1.setDegreeType("B.E");
	educationalInfoBean1.setLocation("bhalki");
	educationalInfoBean1.setPercentage(98.00);
	educationalInfoBean1.setUniversity("vtu");
	SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
	Date date3;
	try {
		date3 = format1.parse("2020-08-03");
		educationalInfoBean1.setYop(date3);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	
	EmployeeEducationalInfoBean educationalInfoBean2=new EmployeeEducationalInfoBean();
	educationalInfoBean2.setEmployeeEducationalPKBean(educationalPKBean2);
	educationalInfoBean2.setBranch("mca");
	educationalInfoBean2.setCollegeName("bkit");
	educationalInfoBean2.setDegreeType("B.E");
	educationalInfoBean2.setLocation("bhalki");
	educationalInfoBean2.setPercentage(98.00);
	educationalInfoBean2.setUniversity("vtu");
	
	EmployeeExperiencePKBean experiencePKBean1=new EmployeeExperiencePKBean();
	experiencePKBean1.setInfoBean(employeeInfoBean);
	experiencePKBean1.setCompanyname("IBM");
	
	EmployeeExperiencePKBean experiencePKBean2=new EmployeeExperiencePKBean();
	experiencePKBean2.setInfoBean(employeeInfoBean);
	experiencePKBean2.setCompanyname("goggle");
	
	EmployeeExperienceInfoBean experienceInfoBean1=new EmployeeExperienceInfoBean();
	experienceInfoBean1.setDesignation("dev");
	experienceInfoBean1.setEmployeeExperiencePKBean(experiencePKBean1);
	SimpleDateFormat dateFormat=new SimpleDateFormat();
	Date date4;
	Date date5;
	 try{ 
		 date4= dateFormat.parse("2020-08-03");
		 date5= dateFormat.parse("2014-12-03");
		 experienceInfoBean1.setJoiningdate(date4);
		 }
	  catch (ParseException e) {
		  e.printStackTrace(); 
		  }
	
	 EmployeeExperienceInfoBean experienceInfoBean2=new EmployeeExperienceInfoBean();
	 experienceInfoBean2.setDesignation("dev");
	 experienceInfoBean2.setEmployeeExperiencePKBean(experiencePKBean2);
		SimpleDateFormat dateFormat1=new SimpleDateFormat();
		Date date1;
		Date date6;
		 try{ 
			 date1= dateFormat.parse("2020-08-03");
			 date6= dateFormat.parse("2014-12-03");
			 experienceInfoBean2.setJoiningdate(date1);
			 experienceInfoBean2.setJoiningdate(date6);
			 }
		  catch (ParseException e) {
			  e.printStackTrace(); 
			  }
	
	
	
	employeeInfoBean.setAddressInfos(Arrays.asList(addressInfo1,addressInfo2));
	employeeInfoBean.setEducationaInfo(Arrays.asList(educationalInfoBean1,educationalInfoBean2));
	employeeInfoBean.setExperienceInfoBean(Arrays.asList(experienceInfoBean1,experienceInfoBean2));
	employeeInfoBean.setEmployeeOtherBean(employeeOtherInfo);
	HibernateImpl impl=new HibernateImpl();
	impl.createEmployee(employeeInfoBean);
}
}
