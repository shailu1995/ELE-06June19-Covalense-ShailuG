package com.covalense.hibernate.oper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernate.bean.EmployeeEducationalInfoBean;

public class UpdateDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		//cfg.addAnnotatedClass(EmployeeEducationalInfoBean.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		/*
		 * EmployeeInfoBean empInf = session.get(EmployeeInfoBean.class,104);
		 * empInf.setSalary(25000); Transaction transaction =
		 * session.beginTransaction();
		 */

		EmployeeEducationalInfoBean empEduInf = session.get(EmployeeEducationalInfoBean.class,"puc");
		empEduInf.setUniversity("MANGLORE");
		Transaction transaction = session.beginTransaction();
		session.update(empEduInf);
		transaction.commit();
		session.close();
	}

}
