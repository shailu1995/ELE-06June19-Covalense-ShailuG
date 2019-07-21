package com.covalense.hibernate.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernate.bean.EmployeeInfoBean;
import com.covalense.hibernate.bean.onetoone.EmployeeOtherInfo;
import com.covalense.hibernate.manytomany.TrainingInfoBean;
import com.covalense.hibernate.manytone.EmployeeAddressInfo;
import com.covalense.hibernate.manytone.EmployeeEducationalInfoBean;
import com.covalense.hibernate.manytone.EmployeeExperienceInfoBean;

public class HibernateImpl {

	private Configuration config = new Configuration();
	private SessionFactory factory = config.configure().buildSessionFactory();

	public void createEmployee(EmployeeInfoBean infoBean, EmployeeOtherInfo otherInfo,
			List<EmployeeAddressInfo> addressInfos, List<EmployeeEducationalInfoBean> educationalInfoBeans,
			List<EmployeeExperienceInfoBean> experienceInfoBeans) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(infoBean);
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
		Session session1 = factory.openSession();
		Transaction transaction1 = session1.beginTransaction();
		session1.save(trainingInfoBean);
	}
}
