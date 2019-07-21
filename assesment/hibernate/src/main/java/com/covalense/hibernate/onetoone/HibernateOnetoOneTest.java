package com.covalense.hibernate.onetoone;

import java.text.ParseException;
import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covalense.hibernate.bean.StudentInfoBean;
import com.covalense.hibernate.util.HibernateUtilOneToOne;
import com.covalense.hibernate.util.PreparedUtil;

import lombok.extern.java.Log;

@Log
public class HibernateOnetoOneTest {

	public static void main(String[] args) throws ParseException {
		int rollNum = 444;
		StudentInfoBean data = PreparedUtil.prepareData(rollNum);
		save(data);
	}

	private static void save(StudentInfoBean data) {
		Transaction txn = null;
		try (Session session = HibernateUtilOneToOne.getSession()) {
			txn = session.beginTransaction();
			session.save(data);
			txn.commit();
		} catch (Exception ex) {
			log.severe(Arrays.toString(ex.getStackTrace()));
			if (txn != null) {
				txn.rollback();
			}
		}
	}

}
