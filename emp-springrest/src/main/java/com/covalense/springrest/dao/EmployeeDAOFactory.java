package com.covalense.springrest.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOFactory {

	@Bean("jdbc")
	public EmployeeDAO getInstanceJDBC() {
		return new EmployeeDAOJDBCImpl();
	}

	@Bean("hibernate")
	public EmployeeDAO getInstanceHibernate() {
		return new EmployeeDAOHibernateImpl();
	}

}
