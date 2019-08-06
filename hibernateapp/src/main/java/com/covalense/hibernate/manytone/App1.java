package com.covalense.hibernate.manytone;

import java.util.Arrays;
import java.util.List;

import org.jboss.jandex.Main;

import com.covalense.hibernate.bean.EmployeeInfoBean;
import com.covalense.hibernate.manytomany.TrainingInfoBean;
import com.covalense.hibernate.model.HibernateImpl;

public class App1 {
	public static void main(String[] args) {
		EmployeeInfoBean bean1=new EmployeeInfoBean();
		bean1.setId(25);
		bean1.setName("sagar");
		
		EmployeeInfoBean bean2=new EmployeeInfoBean();
		bean2.setId(24);
		bean2.setName("santosh");
		
		EmployeeInfoBean bean3=new EmployeeInfoBean();
		bean3.setId(26);
		bean3.setName("sangu");
		
		TrainingInfoBean trainingInfoBean=new TrainingInfoBean();
		trainingInfoBean.setCourseid(101);
		trainingInfoBean.setCoursename("java");
		trainingInfoBean.setDuration("20days");
		
		List<EmployeeInfoBean> employeeInfoBeans = null;
		trainingInfoBean.setEmployeeInfoBeans(employeeInfoBeans);
		HibernateImpl imple=new HibernateImpl();
		imple.createEmployee(trainingInfoBean);
		
	}

}
