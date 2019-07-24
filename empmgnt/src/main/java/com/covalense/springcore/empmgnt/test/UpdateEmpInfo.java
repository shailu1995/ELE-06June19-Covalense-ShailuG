package com.covalense.springcore.empmgnt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.spring.empmgnt.bean.EmployeeInfoBean;
import com.covalense.springcore.empmgnt.config.HibernateConfig;

import lombok.extern.java.Log;

@Log
public class UpdateEmpInfo{
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		Session session = factory.openSession();

		EmployeeInfoBean empInfo = session.get(EmployeeInfoBean.class, 10);
		empInfo.setName("anil kapoor");
		empInfo.setAge(25);
		empInfo.setEmail("anil@gmail.com");
		empInfo.setPhone(12255555l);
		empInfo.setGender("m");
		empInfo.setSalary(124588);
		empInfo.setDepartmentId(15);
		empInfo.setManagerid(52);
		empInfo.setAcnt_no(125444);
		empInfo.setDesignation("dev");
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(empInfo);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
