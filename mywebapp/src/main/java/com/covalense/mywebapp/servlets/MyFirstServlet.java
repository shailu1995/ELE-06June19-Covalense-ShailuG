package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {
	
	
	/*
	 * public MyFirstServlet() { System.out.println("************"); }
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String currentDateTime=new Date().toString();
		
String httpMethod=req.getMethod();
String protocol=req.getProtocol();
String requestUrl=req.getRequestURL().toString();

System.out.println("httpmethod"+httpMethod);
System.out.println("protocol"+protocol);
System.out.println("requesturl method"+requestUrl);

		//get query strinf info
		String fnameValue=req.getParameter("fname");
		String lnameValue=req.getParameter("lname");
		
		
		String htmlResponse="<!DOCTYPE html>"+
								"<html>"+
								"<head>"+
								"<meta charset=\"ISO-8859-1\">"+
								"<title>my 1st html</title>"+
								"</head>"+
								"<body>"+
									"<h1>"+
									"Current Date and Time is:"+
									"<br>"+
									"<span style=\"color: red\">"+currentDateTime+"</span>"+
									"<br><br>"+
									"first name: "+fnameValue+
									"<br>"+
									"last name: "+lnameValue+
									"</h1>"+
						
								"</body>"+
								"</html>";
		
		//send the Above Html response to browser
		resp.setContentType("text/html");
		//resp.setContentType("application/pdf");
		//resp.setHeader("Refresh", "1");//auto refresh
		PrintWriter out=resp.getWriter();
		out.print(htmlResponse);
		
	}//end of doget

}//end of main
