package com.covalense.hibernate.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernate.util.HibernetUtil;

import lombok.extern.java.Log;

@Log
public class UpdateRecord {
	public static void main(String[] args) {
		SessionFactory factory = HibernetUtil.getSessionFactory();
		Session session = factory.openSession();
		// String hql = "update from EmployeeInfoBean set name='Rahul' where id=:eid";
		String hql = "update from EmployeeInfoBean set name=:nm where id=:eid";
		Query query = session.createQuery(hql);
		query.setParameter("eid", 814);
		query.setParameter("nm", "rakshit");
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();

			int result = query.executeUpdate();
			log.info("updated" + result);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}
}
