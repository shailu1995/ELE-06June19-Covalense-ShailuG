package com.covalense.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.covalense.hibernate.dto.EmployeeInfoBean;
import com.covalense.hibernate.util.HibernetUtil;

import lombok.extern.java.Log;

@Log
public class GetDetailPro2 {

	public static void main(String[] args) {
		SessionFactory factory = HibernetUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		Projection pro = Projections.property("name");
		Projection pro1 = Projections.property("id");
		ProjectionList projectionList = Projections.projectionList();
		// criteria.setProjection(pro);
		projectionList.add(pro);
		projectionList.add(pro1);
		criteria.setProjection(projectionList);
		List<Object[]> str = criteria.list();
		for (Object[] a : str) {
			log.info("name....." + a[0]);
			log.info("id....." + a[1]);

		}
	}
}
