package com.covalense.hibernate.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernate.util.HibernetUtil;

import lombok.extern.java.Log;

@Log
public class DeleteRecord {
	public static void main(String[] args) {
		SessionFactory factory = HibernetUtil.getSessionFactory();
		Session session = factory.openSession();
		String hql = "delete from EmployeeInfoBean where id=155";
		Query query = session.createQuery(hql);
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();

			int result = query.executeUpdate();
			log.info("DELETED....." + result);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
