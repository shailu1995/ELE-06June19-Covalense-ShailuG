package com.covalense.designpatterns.dao;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.hibernate.query.Query;

import com.covalense.designpatterns.beans.EmployeeInfoBean;
import com.covalense.designpatterns.util.HibernetUtil;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOHibernateImpl2 implements EmployeeDAO {

	@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		SessionFactory factory = HibernetUtil.getSessionFactory();
		Session session = factory.openSession();
		String hql = "from EmployeeInfoBean";
		Query query = session.createQuery(hql);
		List<EmployeeInfoBean> employeeInfoBeans = query.list();
		for (EmployeeInfoBean employeeInfoBean : employeeInfoBeans) {
			log.info("id...." + employeeInfoBean.getId());
			log.info("name......." + employeeInfoBean.getName());
			log.info("name..." + employeeInfoBean.getName());
			log.info("age......" + employeeInfoBean.getAge());
			log.info("salary......" + employeeInfoBean.getSalary());
			log.info("Account number....." + employeeInfoBean.getAcnt_no());
			log.info("department....." + employeeInfoBean.getDepartmentId());
			log.info("designation....." + employeeInfoBean.getDesignation());
			log.info("email_id.." + employeeInfoBean.getEmail());
			log.info("gender..." + employeeInfoBean.getGender());
			log.info("manager_id." + employeeInfoBean.getManagerid());
			log.info("phone...." + employeeInfoBean.getPhone());
			log.info("dob......" + employeeInfoBean.getDob());
			log.info("joining date......" + employeeInfoBean.getJoiningdate());
		}
		return null;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		return null;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		Session session = HibernetUtil.openSession();
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
		session.close();
		return bean;

	}

	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;
		try {
			Session session = HibernetUtil.openSession();
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		Transaction txn = null;
		EmployeeInfoBean bean = new EmployeeInfoBean();
		try {
			Session session = HibernetUtil.openSession();
			txn = session.beginTransaction();
			session.delete(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
