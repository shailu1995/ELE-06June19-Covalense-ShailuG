package com.covalense.springcore.warehouse.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springcore.warehouse.beans.ItemBean;
import com.covalense.springcore.warehouse.config.HibernateConfig;

import lombok.extern.java.Log;

@Log
public class GetItem {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		Session session = factory.openSession();

		ItemBean itemBean = session.get(ItemBean.class, 101);
		log.info("itemid :" + itemBean.getItemId());
		log.info("itemname :" + itemBean.getItemName());
		log.info("description :" + itemBean.getDescription());
		log.info("cost :" + itemBean.getCost());
		log.info("quan :" + itemBean.getQuantity());
	}
}
