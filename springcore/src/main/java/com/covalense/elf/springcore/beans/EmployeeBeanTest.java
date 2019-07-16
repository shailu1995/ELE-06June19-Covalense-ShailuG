package com.covalense.elf.springcore.beans;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.java.Log;

@Log
public class EmployeeBeanTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		EmployeeBean employee1 = (EmployeeBean) applicationContext.getBean("Employee1");
		
		log.info("name of the employee is :" + employee1.getName());
		log.info("id of the employee is : " + employee1.getId());
		log.info("department id :"+employee1.getDepartmentBean().getDeptId());
		log.info("department name :"+employee1.getDepartmentBean().getDeptName());

		/*
		 * log.info("name of the employee is :" + employee2.getName());
		 * log.info("id of the employee is : " + employee2.getId());
		 */
		//((AbstractApplicationContext)applicationContext).close();
		((ConfigurableApplicationContext)applicationContext).close();
	}
}
