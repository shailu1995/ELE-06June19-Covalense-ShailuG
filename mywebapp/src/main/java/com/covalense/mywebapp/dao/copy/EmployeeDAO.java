package com.covalense.mywebapp.dao.copy;

import java.util.ArrayList;

import com.covalense.mywebapp.bean.EmployeeDepartmentInfoBean;
import com.covalense.mywebapp.bean.EmployeeInfoBean;


public interface EmployeeDAO {
	ArrayList getAllEmployeeInfo();
	 EmployeeInfoBean getEmployeeInfo(String id);
	 EmployeeInfoBean getEmployeeInfo(int id);
	 boolean createEmployeeInfo(EmployeeInfoBean bean);
	 boolean updateEmployeeInfo(EmployeeInfoBean bean);
	 boolean deleteEmployeeInfo(int id);
	 boolean deleteEmployeeInfo(String id);
	
}//end of interface
