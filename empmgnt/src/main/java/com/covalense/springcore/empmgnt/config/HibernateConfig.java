package com.covalense.springcore.empmgnt.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.covalense.spring.empmgnt.bean.EmployeeAddressInfoBean;
@Component
public class HibernateConfig {
	@Bean
	public SessionFactory getSessionFactory() {
	Configuration configuration=new Configuration();
	 configuration.configure("Hibernate.cfg.xml");
	 configuration.addAnnotatedClass(EmployeeAddressInfoBean.class);
	 SessionFactory factory=configuration.buildSessionFactory();
	return factory;
	}
}
