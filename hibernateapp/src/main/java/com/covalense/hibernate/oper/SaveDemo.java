package com.covalense.hibernate.oper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernate.dto.EmployeeEducationalInfoBean;
import com.covalense.hibernate.dto.EmployeeInfoBean;

import javassist.Loader.Simple;

public class SaveDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		// cfg.addAnnotatedClass(EmployeeInfoBean.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		EmployeeInfoBean empInf = new EmployeeInfoBean();
		empInf.setId(156);
		empInf.setName("ranjita");
		empInf.setAge(23);
		empInf.setSalary(45000);
		empInf.setAcnt_no(255636312);
		empInf.setDeptid(15);
		/*
		 * SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); //Date date =
		 * format.parse("1999-10-26"); empInf.setDob(date);
		 */
		empInf.setDesignation("software_engg");
		empInf.setEmail("shailu@gmail.com");
		empInf.setGender("f");
		empInf.setManagerid(2356451);
		empInf.setPhone(8971048836L);

		

		Transaction transaction = session.beginTransaction();
		// session.save(empEduInf);
		session.saveOrUpdate(empInf);
		transaction.commit();
		session.close();
	}

}
