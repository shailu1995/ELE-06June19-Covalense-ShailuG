package com.covalense.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.covalense.hibernate.bean.EmployeeInfoBean;
import com.covalense.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class Restriction {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		Criterion cr = Restrictions.eq("id", 106);
		criteria.add(cr);
		EmployeeInfoBean emp = (EmployeeInfoBean) criteria.uniqueResult();
		log.info("" + emp.getId());
		log.info(""+emp.getDeptid());
		log.info(""+emp.getDesignation());
	}
}
