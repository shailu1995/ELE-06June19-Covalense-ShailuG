package com.covalense.elf.springcore.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.elf.springcore.beans.DepartmentBean;
import com.covalense.elf.springcore.beans.EmployeeBean;
import com.covalense.elf.springcore.configurations.EmployeeConfig;

import lombok.extern.java.Log;

@Log
public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		((ConfigurableApplicationContext)context).registerShutdownHook();
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);

		log.info("employee name :" + employeeBean.getName());
		log.info("employee id :" + employeeBean.getId());

		DepartmentBean departmentBean = employeeBean.getDepartmentBean();
		log.info("dept id :" + departmentBean.getDeptId());
		log.info("dept name :" + departmentBean.getDeptName());
		
		

	}

}
