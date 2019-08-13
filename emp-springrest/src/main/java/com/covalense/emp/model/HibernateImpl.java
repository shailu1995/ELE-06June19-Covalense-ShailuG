package com.covalense.emp.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.springrest.bean.EmployeeAddressInfo;
import com.covalense.springrest.bean.EmployeeEducationalInfoBean;
import com.covalense.springrest.bean.EmployeeExperienceInfoBean;
import com.covalense.springrest.bean.EmployeeInfoBean;
import com.covalense.springrest.bean.EmployeeOtherInfo;
import com.covalense.springrest.bean.TrainingInfoBean;

public class HibernateImpl {

	private Configuration config = new Configuration();
	private SessionFactory factory = config.configure().buildSessionFactory();

	public void createEmployee(EmployeeInfoBean infoBean, EmployeeOtherInfo otherInfo,
			List<EmployeeAddressInfo> addressInfos, List<EmployeeEducationalInfoBean> educationalInfoBeans,
			List<EmployeeExperienceInfoBean> experienceInfoBeans) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
	//	session.save(infoBean);
		session.save(otherInfo);
		for (EmployeeAddressInfo employeeAddressInfo : addressInfos) {
			session.save(employeeAddressInfo);
		}

		for (EmployeeEducationalInfoBean employeeEducationalInfoBean : educationalInfoBeans) {
			session.save(employeeEducationalInfoBean);
		}
		for (EmployeeExperienceInfoBean employeeExperienceInfoBean : experienceInfoBeans) {
			session.save(employeeExperienceInfoBean);
		}
		transaction.commit();
		session.close();

	}
	
	  public void createEmployee(TrainingInfoBean trainingInfoBean) { 
		  Session   session1 = factory.openSession(); 
		  Transaction transaction1 = session1.beginTransaction(); 
		  session1.save(trainingInfoBean); 
		  }

	  public void createEmployee(EmployeeInfoBean InfoBean) { 
		  Session   session = factory.openSession(); 
		  Transaction transaction = session.beginTransaction(); 
		  session.save(InfoBean); 
		  transaction.commit();
			session.close();
		  }
	  public EmployeeInfoBean getEmployeeInfoBean(int id) {
		  Session   session = factory.openSession();
		  EmployeeInfoBean infoBean=session.get(EmployeeInfoBean.class, id);
		  session.close();
		  return infoBean;
	}
	 
}
