package com.covalense.hibernate.awsrds;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernate.cache.EmployeeNewInfo;

import lombok.extern.java.Log;

@Log
public class HibernateProgramForAws {
	public static void main(String[] args) {

		// 1.load config file
		Configuration config = new Configuration();
		config.configure("com/covalense/hibernateapp/awsrds/hibernate.aws.cfg.xml");
		config.addAnnotatedClass(NewEmployeeInfoBean.class);

		// 2.build the session factory
		SessionFactory factory = config.buildSessionFactory();

		// 3.open session
		Session session = factory.openSession();

		// 4.interaction with db
		EmployeeNewInfo bean1 = session.get(EmployeeNewInfo.class, 103);
		log.info("employee id is " + bean1.toString());

		// close sessiom
		session.close();
	}
}
