package com.covalense.mywebapp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.mywebapp.bean.EmployeeInfoBean;


public class HibernetUtil {

	private static SessionFactory sessionFactory;

	private HibernetUtil() {
	}

	private static SessionFactory buildSessionFactory() {
		return new Configuration().configure().addAnnotatedClass(EmployeeInfoBean.class).buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null)
			sessionFactory = buildSessionFactory();
		return sessionFactory;
	}

	public static Session openSession() {
		return getSessionFactory().openSession();
	}
}
