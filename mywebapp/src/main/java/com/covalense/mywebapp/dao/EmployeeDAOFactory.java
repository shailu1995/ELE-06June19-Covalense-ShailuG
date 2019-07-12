package com.covalense.mywebapp.dao;

public class EmployeeDAOFactory {
	
private EmployeeDAOFactory() {}

	private static String dbInteractionType = "hibernate";

	public static EmployeeDAO getInstance() {
		EmployeeDAO dbo = null;

		if (dbInteractionType.equals("jdbc")) {
			dbo = new EmployeeDAOJDBCImpl();
		} else if (dbInteractionType.equals("hibernate")) {
			dbo = new EmployeeDAOHibernateImpl2();
		}

		return dbo;
	}// end of getInstance()
}// end of class
