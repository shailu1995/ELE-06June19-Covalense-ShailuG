package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.bean.EmployeeInfoBean;
import com.covalense.mywebapp.dao.EmployeeDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;

@WebServlet("/search")
//@WebServlet("/search/employeesearch")
/*
 * @WebServlet(urlPatterns = "/search", initParams = {
 * 
 * @WebInitParam(name="actress",value="basanthi") }
 * 
 * )
 */

public class EmployeeSearchServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ServletContext ctx = getServletContext();
		String movieName = ctx.getInitParameter("movie");

		ServletConfig config = getServletConfig();
		String actorname = config.getInitParameter("actor");
		// String movieName1=config.getInitParameter("movie");

		String idValue = req.getParameter("empid");

		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(idValue);

		// send the
		PrintWriter out = resp.getWriter();

		if (bean == null) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color: red\"> Employee Not Found!!!</span></H1>");
			out.print("</BODY>");
			out.print("</HTML>");
		} else {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color: green\"> Employee  Found.....</span></H1>");
			out.print("<br>");
			out.print("<br> Id " + bean.getId());
			out.print("<br> Name " + bean.getName());
			out.print("<br> Age " + bean.getAge());
			out.print("<br> Salary " + bean.getSalary());
			out.print("<br> Account number" + bean.getAcnt_no());
			out.print("<br> Email_id " + bean.getEmail());
			out.print("<br> Gender " + bean.getGender());
			out.print("<br> Phone number " + bean.getPhone());
			out.print("<br> Designation " + bean.getDesignation());
			out.print(" <br> Department id" + bean.getDepartmentId());
			out.print("<br>Manager id " + bean.getManagerid());
			out.print("<br> Date of birth " + bean.getDob());
			out.print("<br>Joining date " + bean.getJoiningdate());
			out.print("<br> name of movie " + movieName);
			out.print("<br>name of  actress " + actorname);
			out.print("</BODY>");
			out.print("</HTML>");
		}

		// get the obj form forward servlet
		//EmployeeInfoBean empInfo = (EmployeeInfoBean) req.getAttribute("info");
		EmployeeInfoBean empInfo = (EmployeeInfoBean) ctx.getAttribute("info");
		if (empInfo == null) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color: red\"> Employeeinfobean obj Not Found!!!</span></H1>");
			out.print("</BODY>");
			out.print("</HTML>");
		} else {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color: green\"> Employee  Found.....</span></H1>");
			out.print("<br>");
			out.print("<br> Id " + bean.getId());
			out.print("<br> Name " + bean.getName());
			out.print("<br> Name " + bean.getEmail());
			out.print("</BODY>");
			out.print("</HTML>");
		}
	}// end of doget

}// end of main
