package com.covalense.hibernate.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.covalense.hibernate.bean.EmployeeInfoBean;
import com.covalense.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class ReadDemo {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		String hql = "select name from EmployeeInfoBean";
		Query query = session.createQuery(hql);
		List<String> ename = query.list();
		
		for (String empName : ename) {
			log.info("name.......>" + empName);
		}
		/*
		 * String hql = "from EmployeeInfoBean"; Query query=session.createQuery(hql);
		 * List<EmployeeInfoBean> employeeInfoBeans=query.list(); for (EmployeeInfoBean
		 * employeeInfoBean : employeeInfoBeans) {
		 * log.info("id"+employeeInfoBean.getId());
		 * log.info("name"+employeeInfoBean.getName());
		 * log.info("age"+employeeInfoBean.getAge());
		 * log.info("salary"+employeeInfoBean.getSalary());
		 * log.info("Account number"+employeeInfoBean.getAcnt_no());
		 * log.info("department"+employeeInfoBean.getDeptid());
		 * log.info("designation"+employeeInfoBean.getDesignation());
		 * log.info("email_id"+employeeInfoBean.getEmail());
		 * log.info("gender"+employeeInfoBean.getGender());
		 * log.info("manager_id"+employeeInfoBean.getManagerid());
		 * log.info("phone"+employeeInfoBean.getPhone());
		 * log.info("dob"+employeeInfoBean.getDob());
		 * log.info("joining date"+employeeInfoBean.getJoiningdate());
		 */
	}

}
