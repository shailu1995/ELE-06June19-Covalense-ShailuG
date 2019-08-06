package com.covalense.hibernate.oper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernate.bean.EmployeeEducationalInfoBean;
import com.covalense.hibernate.bean.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class DeleteDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeInfoBean.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		EmployeeInfoBean empInf = session.get(EmployeeInfoBean.class, 105);
		//log.info("employee id is " + empInf.getId());

		/*
		 * EmployeeEducationalInfoBean empInf =
		 * session.get(EmployeeEducationalInfoBean.class, 101);
		 * log.info("employee id is " + empInf.getBranch());
		 */
		Transaction transaction = session.beginTransaction();
		session.delete(empInf);
		transaction.commit();
		session.close();
	}

}
