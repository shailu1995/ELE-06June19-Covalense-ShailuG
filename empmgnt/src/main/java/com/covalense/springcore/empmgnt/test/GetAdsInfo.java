package com.covalense.springcore.empmgnt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.spring.empmgnt.bean.EmployeeAddressInfoBean;
import com.covalense.springcore.empmgnt.config.HibernateConfig;

import lombok.extern.java.Log;

@Log
public class GetAdsInfo {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		Session session = factory.openSession();

		EmployeeAddressInfoBean empAdd = session.get(EmployeeAddressInfoBean.class, 10);
		log.info("id :" + empAdd.getId());
		log.info("address type : :" + empAdd.getAddressType());
		log.info("address1  :" + empAdd.getAddress1());
		log.info("address2 :" + empAdd.getAddress2());
		log.info("city :" + empAdd.getCity());
		log.info("country :" + empAdd.getCountry());
		log.info("landmark :" + empAdd.getLandmark());
		log.info("pincode :" + empAdd.getPincode());
		log.info("state :" + empAdd.getState());
	}
}
