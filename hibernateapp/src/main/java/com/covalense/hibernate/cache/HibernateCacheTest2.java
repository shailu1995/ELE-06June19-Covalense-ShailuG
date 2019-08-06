package com.covalense.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest2 {

	public static void main(String[] args) {
		log.info("1st time   " + getEmployeeData(103).toString());
		log.info("2nd time   " + getEmployeeData(103).toString());
		log.info("3rd time   " + getEmployeeData(103).toString());
	}

	private static EmployeeNewInfo getEmployeeData(int id) {
		/*
		 * Configuration config = new Configuration();
		 * config.configure("com/covalense/hibernate/cache/hibernate.cache.cfg.xml");
		 * config.addAnnotatedClass(EmployeeNewInfo.class);
		 */
		EmployeeNewInfo bean = null;
		try (Session session = HibernateCacheUtil.openSession();) {
			bean = session.get(EmployeeNewInfo.class, id);
		}

		return bean;

	}
}
