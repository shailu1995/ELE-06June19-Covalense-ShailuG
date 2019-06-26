package com.covalense.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.bean.EmployeeInfoBean;

/**
 * Servlet implementation class RedirectServlets
 */
//@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		EmployeeInfoBean empInf=new EmployeeInfoBean();
		empInf.setId(124);
		empInf.setName("swati");
		empInf.setEmail("abc@gmail.com");
		
		ServletContext ctx=getServletContext();
		ctx.setAttribute("info", empInf);
	
		//pass the above
		request.setAttribute("info", empInf);
		String url = "search?id=105";
		RequestDispatcher dispatcher=request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		response.sendRedirect(url);

	}

}
