package com.covalense.hibernate.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernate.util.HibernetUtil;

import lombok.extern.java.Log;

@Log
public class Update {
	public static void main(String[] args) {
		SessionFactory factory = HibernetUtil.getSessionFactory();
		Session session = factory.openSession();
		String hql = "delete from EmployeeInfoBean set name=:nm where id=:eid";
		// String hql = "delete from EmployeeInfoBean set name='"+args[0]+"' where
		// id="+args[1]+"";
		Query query = session.createQuery(hql);
		query.setParameter("eid", args[0]);
		query.setParameter("nm", Integer.parseInt(args[1]));
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
