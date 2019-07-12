package com.covalense.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.hibernate.dto.EmployeeInfoBean;
import com.covalense.hibernate.util.HibernetUtil;

import lombok.extern.java.Log;
import net.bytebuddy.asm.Advice.ArgumentHandler.Factory;

@Log
public class GetAllDetails {

	public static void main(String[] args) {
		SessionFactory factory = HibernetUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		List<EmployeeInfoBean> employeeInfoBean = criteria.list();
		for (EmployeeInfoBean emp : employeeInfoBean) {
			log.info("" + emp);
		}
	}

}
