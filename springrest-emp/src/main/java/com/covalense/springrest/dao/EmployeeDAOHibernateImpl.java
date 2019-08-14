
package com.covalense.springrest.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.covalense.springrest.bean.EmployeeAddressInfo;
import com.covalense.springrest.bean.EmployeeEducationalInfoBean;
import com.covalense.springrest.bean.EmployeeExperienceInfoBean;
import com.covalense.springrest.bean.EmployeeInfoBean;
import com.covalense.springrest.bean.EmployeeOtherInfo;

import lombok.extern.java.Log;

/**
 * @author Administrator
 *
 */

@Log
public class EmployeeDAOHibernateImpl implements EmployeeDAO {
	/*
	 * @Autowired public HibernateUtil hibernateUtil;
	 */
	@Autowired
	SessionFactory sessionFactory;
	// @Override
	public EmployeeInfoBean getEmployeeInfoBean(String id) {
		try {
			return getEmployeeInfoBean(Integer.parseInt(id));
		} catch (NumberFormatException nfe) {
			log.severe("Exception occured while trying to convert parameter id to Integer. id = " + id);
			log.severe(nfe.getMessage());
			return null;
		}
	}

	// @Override
	public EmployeeInfoBean getEmployeeInfoBean(int id) {

		Session session = sessionFactory.openSession();
		EmployeeInfoBean infoBean = session.get(EmployeeInfoBean.class, id);
		session.close();

		return infoBean;
	}

	// @Override
	public EmployeeInfoBean readmployeeInfoBean(String id) {
		return getEmployeeInfoBean(id);
	}

	// @Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo(String id) {
//		Session session = HibernateUtil.getSession();
//		CriteriaBuilder cb = session.getCriteriaBuilder();
//		CriteriaQuery<EmployeeInfoBean> cr = cb.createQuery(EmployeeInfoBean.class);
//
//		Root<EmployeeInfoBean> root = cr.from(EmployeeInfoBean.class);
//		cr.select(root);
//		 
//		Query<EmployeeInfoBean> query = session.createQuery(cr);
//		cr.select(root).where(cb.like(root.get("id"), id+"%"));
//		List<EmployeeInfoBean> results = query.getResultList();
//		session.close();
//		return new ArrayList<EmployeeInfoBean>(results);
		String hql1 = " From EmployeeInfoBean where str(id) like '" + id + "%'";
		Session session = sessionFactory.openSession();
		Query<EmployeeInfoBean> query = session.createQuery(hql1);
		List<EmployeeInfoBean> list = query.list();
		return new ArrayList<EmployeeInfoBean>(list);

	}

	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;
		
		EmployeeOtherInfo employeeOtherInfo=bean.getEmployeeOtherBean();
		employeeOtherInfo.setInfoBean(bean);;
		
		
		for (EmployeeEducationalInfoBean employeeEducationalInfoBean : bean.getEducationaInfo()) {
			employeeEducationalInfoBean.getEmployeeEducationalPKBean().setInfoBean(bean);
		}

		
		for (EmployeeAddressInfo employeeAddressInfo : bean.getAddressInfos()) {
			employeeAddressInfo.getAddressPKBean().setInfoBean(bean);
		}

		
		for (EmployeeExperienceInfoBean employeeExperienceInfoBean : bean.getExperienceInfoBean()) {
			employeeExperienceInfoBean.getEmployeeExperiencePKBean().setInfoBean(bean);
		}

		
		try {
			Session session = sessionFactory.openSession();
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

	// @Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	// @Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	// @Override
	public boolean deleteEmployeeInfo(String id) {
		return deleteEmployeeInfo(Integer.parseInt(id));
	}

	// @Override
	public boolean removeEmployee(int id) {
			Session session = sessionFactory.openSession();
			EmployeeInfoBean employeeInfoBean=session.get(EmployeeInfoBean.class, id);
			session.close();
			return true;
		}
		
	

	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public EmployeeInfoBean getEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}


	/*
	 * public boolean removeEmployee(String id) { return
	 * removeEmployee1(Integer.parseInt(id)); }
	 * 
	 * @Override public boolean removeEmployee(int id) { return removeEmployee1(id);
	 * }
	 */



	
}
