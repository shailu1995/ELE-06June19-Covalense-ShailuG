package com.covalense.springcore.warehouse.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.covalense.springcore.warehouse.beans.ItemBean;
@Component
public class HibernateConfig {
	@Bean
	public SessionFactory getSessionFactory() {
	Configuration configuration=new Configuration();
	 configuration.configure("Hibernate.cfg.xml");
	 configuration.addAnnotatedClass(ItemBean.class);
	 SessionFactory factory=configuration.buildSessionFactory();
	return factory;
	}
}
