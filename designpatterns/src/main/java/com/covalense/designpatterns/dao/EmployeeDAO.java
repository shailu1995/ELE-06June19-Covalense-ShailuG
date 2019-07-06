package com.covalense.designpatterns.dao;

import java.util.ArrayList;

import com.covalense.designpatten.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	ArrayList getAllEmployeeInfo();
	 EmployeeInfoBean getEmployeeInfo(String id);
	 EmployeeInfoBean getEmployeeInfo(int id);
	 boolean createEmployeeInfo(EmployeeInfoBean bean);
	 boolean updateEmployeeInfo(EmployeeInfoBean bean);
	 boolean deleteEmployeeInfo(int id);
	 boolean deleteEmployeeInfo(String id);
}//end of interface
