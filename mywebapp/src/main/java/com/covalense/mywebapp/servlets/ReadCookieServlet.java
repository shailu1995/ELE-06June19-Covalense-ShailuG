package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadCookieServlet
 */

public class ReadCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie[] receivedCookies=request.getCookies();
		PrintWriter out=response.getWriter();
		
		if (receivedCookies == null) {
			out.print("cookies are not present");
			
		}else {
			out.print("cookies are present");
			
			for(Cookie rcvdCookie :receivedCookies) {
				out.print("cookies name"+rcvdCookie.getName());
				out.print("cookies name"+rcvdCookie.getValue());
				
			}
		}
	}

}
