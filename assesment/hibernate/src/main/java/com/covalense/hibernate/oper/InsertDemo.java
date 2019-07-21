package com.covalense.hibernate.oper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.covalense.hibernate.bean.CustomerBean;
import com.covalense.hibernate.util.HibernateUtil;

public class InsertDemo {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		CustomerBean bean = new CustomerBean();
		bean.setId(15);
		bean.setFirstname("raju");
		bean.setLastname("gadmi");
		bean.setContnum(15454l);
		bean.setAddress("Bidar");
		bean.setCity("gulbarga");
		bean.setState("karnataka");
		bean.setCountry("india");
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(bean);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
