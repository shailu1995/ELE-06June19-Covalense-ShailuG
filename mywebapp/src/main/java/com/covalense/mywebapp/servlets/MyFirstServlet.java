package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.bean.EmployeeInfoBean;

public class MyFirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext ctx = getServletContext();
		String movieName = ctx.getInitParameter("movie");

		ServletConfig config = getServletConfig();
		String actorname = config.getInitParameter("actor");

		String currentDateTime = new Date().toString();

		String httpMethod = req.getMethod();
		String protocol = req.getProtocol();
		String requestUrl = req.getRequestURL().toString();

		System.out.println("httpmethod" + httpMethod);
		System.out.println("protocol" + protocol);
		System.out.println("requesturl method" + requestUrl);

		// get query string info
		String fnameValue = req.getParameter("fname");
		String lnameValue = req.getParameter("lname");

		String htmlResponse = "<!DOCTYPE html>" + "<html>" + "<head>" + "<meta charset=\"ISO-8859-1\">"
				+ "<title>my 1st html</title>" + "</head>" + "<body>" + "<h1>" + "Current Date and Time is:" + "<br>"
				+ "<span style=\"color: red\">" + currentDateTime + "</span>" + "<br><br>" + "first name: " + fnameValue
				+ "<br>" + "last name: " + lnameValue + "<br>" + "movie name: " + movieName + "<br>" + "actor name: "
				+ actorname + "</h1>" +

				"</body>" + "</html>";

		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();
		out.print(htmlResponse);

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
		out.print("<br> Id " + empInfo.getId());
		out.print("<br> Name " + empInfo.getName());
		out.print("<br> Name " + empInfo.getEmail());
		out.print("</BODY>");
		out.print("</HTML>");
	}
}

}// end of main
