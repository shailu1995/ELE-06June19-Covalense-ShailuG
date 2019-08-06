package com.covalense.hibernate.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class DynamicHql {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session ses = factory.openSession();
		//String hql = "delete from EmployeeInfoBean where id=:eid";
		//String hql = " update from EmployeeInfoBean set name =:ename where id =:eid   ";
		String hql = " update from EmployeeInfoBean set name ='"+args[0]+"' where id ='"+args[1]+"' ";
		Query  query = ses.createQuery(hql);
		query.setParameter("eid", args[0]);
		query.setParameter("ename", args[1]);
		Transaction tx = null;
		try {
			tx= ses.beginTransaction();
			int result = query.executeUpdate();
			//log.info("Delete Successfully :"+result);
			log.info("update Successfully :"+result);
			tx.commit();
			
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			ses.close();
		}
		
	}
}
