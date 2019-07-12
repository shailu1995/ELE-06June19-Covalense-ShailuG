package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.bean.EmployeeInfoBean;
import com.covalense.mywebapp.dao.EmployeeDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;
@WebServlet("/create")
public class CreateEmployeeInfo extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//resp.setContentType("text/html");  
		
		String idValue = req.getParameter("empid");
		String name=req.getParameter("name");
		String gender=req.getParameter("gender");
		String age=req.getParameter("age");
		String salary=req.getParameter("salary");
		String phonenum=req.getParameter("phonenum");
		String joiningdate=req.getParameter("joiningdate");
		String accountnum=req.getParameter("accountnum");
		String emailid=req.getParameter("emailid");
		String designation=req.getParameter("designation");
		String dob=req.getParameter("dob");
		String deprtid=req.getParameter("deprtid");
		String mngrid=req.getParameter("mngrid");
		
		//EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setId(Integer.parseInt(idValue));
		bean.setName(name);
		bean.setAge(Integer.parseInt(age));
		bean.setSalary(Double.parseDouble(salary));
		bean.setAcnt_no(Long.parseLong(accountnum));
		bean.setDepartmentId(Integer.parseInt(idValue));
		bean.setDesignation(designation);
		bean.setEmail(emailid);
		bean.setGender(gender);
		bean.setManagerid(Integer.parseInt(idValue));
		bean.setPhone(Long.parseLong(idValue));
		SimpleDateFormat format = new SimpleDateFormat(); 
		Date date;
		
		  try {
			date=format.parse(joiningdate);
			  bean.setJoiningdate(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		//EmployeeInfoBean infobean = dao.getEmployeeInfo(idValue);
		dao.createEmployeeInfo(bean);

		// send the
		PrintWriter out = resp.getWriter();

		
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color: red\"> Record inserted successfully</span></H1>");
			out.print("</BODY>");
			out.print("</HTML>");
		
	}// end of doget

}// end of main
