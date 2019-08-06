package com.covalense.hibernate.manytomany;

import com.covalense.hibernate.bean.EmployeeInfoBean;
import com.covalense.hibernate.model.HibernateImpl;

public class App {
public static void main(String[] args) {
	EmployeeInfoBean bean=new EmployeeInfoBean();
	bean.setId(25);
	bean.setName("swati");
	bean.setDesignation("MD");
	
	EmployeeInfoBean bean1=new EmployeeInfoBean();
	bean1.setId(2);
	bean1.setName("suchi");
	bean1.setDesignation("sd");
	bean1.setManagerid(bean);
	
	EmployeeInfoBean bean2=new EmployeeInfoBean();
	bean2.setId(3);
	bean2.setName("sachin");
	bean2.setDesignation("sd");
	bean2.setManagerid(bean);
	
	HibernateImpl impl=new HibernateImpl();
		/* impl.createEmployee(bean); */ 
		
		
		  impl.createEmployee(bean1); 
		  impl.createEmployee(bean2);
		 
		 
}
}
