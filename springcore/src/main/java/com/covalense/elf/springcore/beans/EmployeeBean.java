package com.covalense.elf.springcore.beans;

import javax.security.auth.Destroyable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javafx.fxml.Initializable;
import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log
public class EmployeeBean implements InitializingBean, DisposableBean {
	private String name;
	private int id;
	private DepartmentBean departmentBean;

	public void destroy() throws Exception {
		log.info("Intialization ****************");

	}

	public void afterPropertiesSet() throws Exception {
		log.info("**********");
	}
}
