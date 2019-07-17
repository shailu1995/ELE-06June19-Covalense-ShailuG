package com.covalense.elf.springcore.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.covalense.elf.springcore.beans.EmployeeBean;
@Configuration
@Import(DepartmentConfig.class)
public class EmployeeConfig {
	@Bean
	public EmployeeBean getEmployeeBean() {
		EmployeeBean employeeBean=new EmployeeBean();
		employeeBean.setName("SHAILU");
		employeeBean.setId(25);
		return employeeBean;
	}

}
