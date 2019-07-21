package com.covalense.hibernate.oper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.covalense.hibernate.bean.CustomerBean;
import com.covalense.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class ReadDemo {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		CustomerBean bean = session.get(CustomerBean.class, 11);
		log.info("id is:" + bean.getId());
		log.info("id is:" + bean.getFirstname());
		log.info("id is:" + bean.getLastname());
		log.info("id is:" + bean.getContnum());
		log.info("id is:" + bean.getCity());
		log.info("id is:" + bean.getCountry());
		log.info("id is:" + bean.getState());
		log.info("id is:" + bean.getAddress());

		Transaction transaction = session.beginTransaction();
		transaction.commit();
		session.close();
	}
}
