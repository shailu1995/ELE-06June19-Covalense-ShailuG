package com.covalense.hibernate.oper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernate.bean.EmployeeInfoBean;

import lombok.extern.java.Log;
@Log
public class ReadDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeInfoBean.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		EmployeeInfoBean empInf = session.get(EmployeeInfoBean.class,107);
		log.info("employee id is "+empInf.getId());
		log.info("employee name is "+empInf.getName());
		log.info("employee age is "+empInf.getAge());
		log.info("employee salary is "+empInf.getSalary());
		log.info("employee gender is "+empInf.getGender());
		log.info("employee salary is "+empInf.getSalary());
		log.info("employee account number is "+empInf.getAcnt_no());
		log.info("employee joining date  is "+empInf.getJoiningdate());
		log.info("employee email_id is "+empInf.getEmail());
		log.info("employee  designation is "+empInf.getDesignation());
		log.info("employee depat_id is "+empInf.getDeptid());
		log.info("employee manager_id is "+empInf.getManagerid());
		log.info(""+empInf.getDob());
		session.close();

	}

}
