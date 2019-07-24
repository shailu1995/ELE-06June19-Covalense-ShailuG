package com.covalense.springcore.empmgnt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.spring.empmgnt.bean.EmployeeAddressInfoBean;
import com.covalense.springcore.empmgnt.config.HibernateConfig;


public class AddAdsInfo {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		Session session = factory.openSession();

		EmployeeAddressInfoBean empAdd = new EmployeeAddressInfoBean();
		empAdd.setId(10);
		empAdd.setAddressType("present");
		empAdd.setAddress1("bommanhalli");
		empAdd.setAddress2(" mainlakkasandra");
		empAdd.setCity("bng");
		empAdd.setState("karnataka");
		empAdd.setCountry("india");
		empAdd.setPincode(76);
		empAdd.setLandmark("bannerghatta road");

		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(empAdd);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
