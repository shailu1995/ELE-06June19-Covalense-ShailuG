package com.covalense.hibernate.rough;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.covalense.hibernate.onetoone.HibernateUtil;
import com.covalense.hibernate.onetoone.StudentInfo;

public class OneToOne {
	
	private static void save(StudentInfo studentInfo ) {
		Transaction transaction=null;
		try(Session session=HibernateUtil.getSession()){
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
			
		}
		
	}
		
	


}
Transaction transaction=null;
try (Session session=HibernateUtil.getSession()) {
	session.beginTransaction();
	session.save(studentInfo);
	return
	