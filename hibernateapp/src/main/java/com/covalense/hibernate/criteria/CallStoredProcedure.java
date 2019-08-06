package com.covalense.hibernate.criteria;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.hibernate.bean.EmployeeInfoBean;
import com.covalense.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class CallStoredProcedure {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		StoredProcedureQuery query = session.createStoredProcedureCall("getrecordinfo", EmployeeInfoBean.class);
		List<EmployeeInfoBean> emp = query.getResultList();
		for (EmployeeInfoBean employeeInfoBean : emp) {
			log.info("" + employeeInfoBean.getId());
			log.info("" + employeeInfoBean.getDesignation());
			log.info("" + employeeInfoBean.getGender());
		}
	}

}
