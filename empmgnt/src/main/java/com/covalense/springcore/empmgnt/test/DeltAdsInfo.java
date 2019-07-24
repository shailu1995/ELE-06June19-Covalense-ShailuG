package com.covalense.springcore.empmgnt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.spring.empmgnt.bean.EmployeeAddressInfoBean;
import com.covalense.springcore.empmgnt.config.HibernateConfig;

import lombok.extern.java.Log;

@Log
public class DeltAdsInfo {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		Session session = factory.openSession();

		EmployeeAddressInfoBean empAdd = session.get(EmployeeAddressInfoBean.class, 10);

		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.delete(empAdd);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
