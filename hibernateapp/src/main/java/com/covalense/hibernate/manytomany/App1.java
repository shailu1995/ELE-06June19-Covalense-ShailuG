package com.covalense.hibernate.manytomany;

import java.util.Arrays;

import com.covalense.hibernate.bean.EmployeeInfoBean;
import com.covalense.hibernate.model.HibernateImpl;

public class App1 {
	public static void main(String[] args) {
		TrainingInfoBean trainingInfoBean = new TrainingInfoBean();
		trainingInfoBean.setCourseid(102);
		trainingInfoBean.setCoursetype("j2ee");
		
		HibernateImpl impl=new HibernateImpl();
		
		EmployeeInfoBean infoBean1=impl.getEmployeeInfoBean(2);
		EmployeeInfoBean infoBean2=impl.getEmployeeInfoBean(3);
		
		trainingInfoBean.setEmployeeInfoBeans(Arrays.asList(infoBean1,infoBean2));
		impl.createEmployee(trainingInfoBean);
	}

}
