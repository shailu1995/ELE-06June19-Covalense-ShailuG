package com.covalense.springcore.empmgnt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.spring.empmgnt.bean.EmployeeInfoBean;
import com.covalense.springcore.empmgnt.config.HibernateConfig;


public class AddEmpInfo {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		Session session = factory.openSession();

		EmployeeInfoBean empInfo = new EmployeeInfoBean();
		empInfo.setId(10);
		empInfo.setName("vijeth");
		empInfo.setAge(25);
		empInfo.setGender("M");
		empInfo.setSalary(12444);
		empInfo.setPhone(78955544111L);
		//empInfo.setJoiningdate("12-02-2015");
		empInfo.setAcnt_no(12255L);
		empInfo.setEmail("shailu@gmail.com");
		empInfo.setDesignation("software engg");
		empInfo.setManagerid(125);
		empInfo.setDepartmentId(148);
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(empInfo);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
