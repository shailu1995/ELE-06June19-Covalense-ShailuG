package com.covalense.springcore.empmgnt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.spring.empmgnt.bean.EmployeeInfoBean;
import com.covalense.springcore.empmgnt.config.HibernateConfig;

import lombok.extern.java.Log;

@Log
public class GetEmpInfo {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		Session session = factory.openSession();

		EmployeeInfoBean empInfo = session.get(EmployeeInfoBean.class, 10);
		log.info("name :" + empInfo.getName());
		log.info("age   :" + empInfo.getAge());
		log.info("email :" + empInfo.getEmail());
		log.info("destination :" + empInfo.getDesignation());
		log.info("phone :" + empInfo.getPhone());
		log.info("gender :" + empInfo.getGender());
		log.info("salary :" + empInfo.getSalary());
		log.info("joining date :" + empInfo.getJoiningdate());
		log.info("state :" + empInfo.getManagerid());
		log.info("state :" + empInfo.getDepartmentId());
	}
}
