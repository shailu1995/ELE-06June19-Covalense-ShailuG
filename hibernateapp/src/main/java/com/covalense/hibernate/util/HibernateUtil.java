package com.covalense.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


//import com.covalense.hibernate.onetoone.EmployeeInfo;
//import com.covalense.hibernate.onetoone.EmployeeOtherInfo;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	private static SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		return sessionFactory;
	}

	/*
	 * private static SessionFactory buildSessionFactory() {
	 * 
	 * return new Configuration().configure() .addAnnotatedClass(EmployeeInfo.class)
	 * .addAnnotatedClass(EmployeeOtherInfo.class) .setProperty("hibernate.dialect",
	 * "org.hibernate.dialect.MySQLInnoDBDialect") .buildSessionFactory(); }
	 */

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null)
			sessionFactory = buildSessionFactory();
		return sessionFactory;
	}

	
	  public static Session getSession() { return
	  getSessionFactory().openSession();
	  
	  }
	 

}
