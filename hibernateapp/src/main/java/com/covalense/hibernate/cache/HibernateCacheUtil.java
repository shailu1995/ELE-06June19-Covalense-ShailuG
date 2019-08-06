package com.covalense.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateCacheUtil {
	private static SessionFactory sessionfactory = null;

	private HibernateCacheUtil() {
	}

	private static SessionFactory buildSessionFactory() {
		if (sessionfactory == null) {
			sessionfactory = new Configuration().configure("").addAnnotatedClass(EmployeeNewInfo.class)
					.buildSessionFactory();
		}
		return sessionfactory;

	}

	public static Session openSession() {
		return buildSessionFactory().openSession();
	}
}
