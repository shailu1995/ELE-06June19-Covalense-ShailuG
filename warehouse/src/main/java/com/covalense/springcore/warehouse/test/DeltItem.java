package com.covalense.springcore.warehouse.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springcore.warehouse.beans.ItemBean;
import com.covalense.springcore.warehouse.config.HibernateConfig;

import lombok.extern.java.Log;

@Log
public class DeltItem {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		Session session = factory.openSession();

		ItemBean itemBean = session.get(ItemBean.class, 102);

		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.delete(itemBean);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
