package com.covalense.designpatterns.dao;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.designpatten.beans.EmployeeInfoBean;

public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		return null;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		//1. load config file
		Configuration cfg = new Configuration();
		//cfg.configure();
		cfg.configure("MyHiberateCinfigFile.xml");
		//cfg.configure(new File("D:\\MyHiberateCinfigFile.xml"));
		/*
		 * try { cfg.configure(new URL(
		 * "https://raw.githubusercontent.com/shailu1995/ELE-06June19-Covalense-ShailuG/master/SuportingDocs/MyHiberateCinfigFile.xml"
		 * )); } catch (HibernateException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } catch (MalformedURLException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		cfg.addAnnotatedClass(EmployeeInfoBean.class);
		
		//2.build the session factory
		SessionFactory factory = cfg.buildSessionFactory();
		
		//3.open session
		Session session = factory.openSession();
		
		// interact with db via session
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
		
		//close the session
		session.close();
		return bean;

	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
