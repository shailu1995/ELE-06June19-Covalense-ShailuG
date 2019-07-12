package com.covalense.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernate.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest {

	public static void main(String[] args) {
		// 1.load config file
		Configuration config = new Configuration();
		config.configure("com/covalense/hibernate/cache/hibernate.cache.cfg.xml");
		config.addAnnotatedClass(EmployeeNewInfo.class);

		// 2.build the session factory
		SessionFactory factory = config.buildSessionFactory();

		// 3.open session
		Session session = factory.openSession();

		// 4.interaction with db
		EmployeeNewInfo bean1 = session.get(EmployeeNewInfo.class, 103);
		log.info("employee id is " + bean1.toString());

		EmployeeNewInfo bean2 = session.get(EmployeeNewInfo.class, 103);
		log.info("employee id is " + bean2.toString());

		EmployeeNewInfo bean3 = session.get(EmployeeNewInfo.class, 103);
		log.info("employee id is " + bean3.toString());

		// close sessiom
		session.close();
	}
}
