package com.covalense.elf.springcore.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.covalense.elf.springcore.beans.DepartmentBean;
@Configuration
public class DepartmentConfig {
	
	@Bean(name="it")
	public DepartmentBean getDepartmentIT() {
		DepartmentBean departmentBean=new DepartmentBean();
		departmentBean.setDeptName("dev");
		departmentBean.setDeptId(204);
		return departmentBean;
	}


	@Bean(name="ceo")
	public DepartmentBean getDepartmentCEO() {
		DepartmentBean departmentBean=new DepartmentBean();
		departmentBean.setDeptName("ceo");
		departmentBean.setDeptId(201);
		return departmentBean;
	}


	@Bean(name="hr")
	public DepartmentBean getDepartmentHR() {
		DepartmentBean departmentBean=new DepartmentBean();
		departmentBean.setDeptName("hr");
		departmentBean.setDeptId(211);
		return departmentBean;
	}

}
