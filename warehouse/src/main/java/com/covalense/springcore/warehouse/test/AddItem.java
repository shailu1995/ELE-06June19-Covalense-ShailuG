package com.covalense.springcore.warehouse.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springcore.warehouse.beans.ItemBean;
import com.covalense.springcore.warehouse.config.HibernateConfig;

public class AddItem {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		Session session = factory.openSession();

		ItemBean itemBean = new ItemBean();
		itemBean.setItemId(103);
		itemBean.setCost(122508);
		itemBean.setDescription("***");
		itemBean.setItemName("car");
		itemBean.setQuantity(90);

		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(itemBean);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
