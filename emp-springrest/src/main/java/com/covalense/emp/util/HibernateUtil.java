package com.covalense.emp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public final class HibernateUtil {

	@Autowired
	static SessionFactory sessionFactory;
	
	public static  Session openSession() {
		return sessionFactory.openSession();
	}

}
