package com.covalense.hibernate.hql;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.covalense.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class InsertDataIntoTableHql {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		String hql = "insert into NewTableBean(Id,firstName,lastName,city) from CustomerBean(Id,FirstName,LastName,city) where Id=12";
		
		Query query = session.createQuery(hql);
		int result = query.executeUpdate();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			log.info(""+result);
			//session.save(bean);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}
}
