package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IncudeServlet
 */

public class IncdeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher=null;
		response.setContentType("text.html");
		PrintWriter out=response.getWriter();
		
		out.println("1111111");
		out.print("<br>");
		dispatcher=request.getRequestDispatcher("index.html");
		dispatcher.include(request, response);
		out.print("</br>");
		
		out.println("222222222");
		out.print("<br>");
		dispatcher=request.getRequestDispatcher("currentDate?fname=shailu&lname=gadmi");
		dispatcher.include(request, response);
		out.print("</br>");
		
		out.println("33333333");
		out.print("<br>");
		dispatcher=request.getRequestDispatcher("search?id=103");
		dispatcher.include(request, response);
		out.print("</br>");
		
	}
}
