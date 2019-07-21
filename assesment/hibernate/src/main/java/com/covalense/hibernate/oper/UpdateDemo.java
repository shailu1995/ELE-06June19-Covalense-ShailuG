package com.covalense.hibernate.oper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.covalense.hibernate.bean.CustomerBean;
import com.covalense.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class UpdateDemo {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		CustomerBean bean = session.get(CustomerBean.class, 11);
		bean.setLastname("HSGDFH");
		bean.setCountry("FSJHFD");
		
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.saveOrUpdate(bean);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
