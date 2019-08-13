package com.covalense.springrest.dao;

import java.util.ArrayList;

import com.covalense.springrest.bean.EmployeeInfoBean;

public interface EmployeeDAO {
	ArrayList<EmployeeInfoBean> getAllEmployeeInfo();
	ArrayList<EmployeeInfoBean> getAllEmployeeInfo(String id);
	EmployeeInfoBean getEmployeeInfo(int id);
	EmployeeInfoBean getEmployeeInfoBean(int id);
	
	boolean createEmployeeInfo(EmployeeInfoBean bean);
	EmployeeInfoBean readmployeeInfoBean(String id);
	boolean updateEmployeeInfo(EmployeeInfoBean bean);
	boolean deleteEmployeeInfo(String id);
	boolean deleteEmployeeInfo(int id);

	
}