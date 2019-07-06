package com.covalense.hibernetapp.xmlexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernet.dto.DeptBean;

public class SaveRecord {
	public static void main(String[] args) {

		DeptBean empinf = new DeptBean();
		empinf.setDept_no(15);
		empinf.setDname("it");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(empinf);
		transaction.commit();
		session.close();

	}
}
