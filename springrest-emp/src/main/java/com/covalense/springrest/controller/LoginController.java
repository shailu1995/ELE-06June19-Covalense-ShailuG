package com.covalense.springrest.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.springrest.bean.EmployeeInfoBean;
import com.covalense.springrest.bean.EmployeeResponse;
import com.covalense.springrest.dao.EmployeeDAO;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;

	@PostMapping(value = "/auth", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse login(int id, String password,HttpServletRequest request) {
		EmployeeResponse response = new EmployeeResponse();
		
			EmployeeInfoBean bean = dao.getEmployeeInfoBean(id);
			if (bean != null && bean.getPassword().equals(password)) {
				response.setStatusCode(201);
				response.setMessage("successfull");
				response.setDec("loged in successfully!!");
				response.setBeans(Arrays.asList(bean));
				request.getSession().setAttribute("bean", bean);
			} else {
				response.setStatusCode(401);
				response.setMessage("failure");
				response.setDec("unable to login try once");
			}
			return response;
		
	}

	@GetMapping(value = "/logout", produces = MediaType.APPLICATION_JSON_VALUE)
	private EmployeeResponse logout(HttpSession session) {
		session.invalidate();
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(201);
		response.setMessage("successfull");
		response.setDec("loged out successfully!!");
		return response;

	}

	@GetMapping(value = "/readcookie", produces = MediaType.APPLICATION_JSON_VALUE)

	private EmployeeResponse readCookie(@CookieValue(name = "JSESSIONID") String sessionid) {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(201);
		response.setMessage("successfull");
		response.setDec("JSESSIONID: " + sessionid);
		return response;

	}
}
