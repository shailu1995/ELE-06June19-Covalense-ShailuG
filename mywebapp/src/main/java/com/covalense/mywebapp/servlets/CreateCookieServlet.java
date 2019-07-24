package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/createCookie")
public class CreateCookieServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//create a cookie
		Cookie myNameCookie = new Cookie("myName", "shailu");
		Cookie myLocationCookie = new Cookie("myLocation", "Bidar");
		myLocationCookie.setMaxAge(7*24*60*60);
		
		//send the cookie to browser
		response.addCookie(myNameCookie);
		response.addCookie(myLocationCookie);
		
		PrintWriter out = response.getWriter();
		out.println("created the cookie.....!!!!");
	}//end of doget
}
