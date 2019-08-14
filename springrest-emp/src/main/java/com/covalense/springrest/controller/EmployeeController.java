package com.covalense.springrest.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.springrest.bean.EmployeeInfoBean;
import com.covalense.springrest.bean.EmployeeResponse;
import com.covalense.springrest.dao.EmployeeDAO;

@RestController
@RequestMapping("/employeerest")
public class EmployeeController {

	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}

	/*
	 * @GetMapping(value = "/getEmployee", produces =
	 * MediaType.APPLICATION_JSON_VALUE) public EmployeeInfoBean
	 * getEmployeeInfo(@RequestParam("id") int id) { return
	 * dao.getEmployeeInfoBean(id);
	 * 
	 * }
	 */
	
	@GetMapping(value = "/getAllEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee(HttpServletRequest request) {
		EmployeeResponse employeeResponse = new EmployeeResponse();
	
		if (request.getSession(false) != null) {
		List<EmployeeInfoBean> bean=dao.getAllEmployeeInfo();
		if (bean!=null) {
			employeeResponse.setStatusCode(201);
			employeeResponse.setMessage("successful");
			employeeResponse.setDec("Employee data inserted successfully");
			employeeResponse.setBeans(bean);
		} else {
			employeeResponse.setStatusCode(401);
			employeeResponse.setMessage("failure");
			employeeResponse.setDec("failed to insert the data ...plz try once...");
		}
		return employeeResponse;
		} else {
			employeeResponse.setStatusCode(501);
			employeeResponse.setMessage("failure");
			employeeResponse.setDec("login first");
		}
		return employeeResponse;
	}

	@GetMapping(value = "/getEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployeeXml(int id,HttpServletRequest request) {
		
		EmployeeResponse employeeResponse = new EmployeeResponse();
		if (request.getSession(false) != null) {
			EmployeeInfoBean bean=dao.getEmployeeInfo(id);
		
		if (bean!=null) {
			employeeResponse.setStatusCode(201);
			employeeResponse.setMessage("successful");
			employeeResponse.setDec("Employee data inserted successfully");
			employeeResponse.setBeans(Arrays.asList(bean));
		} else {
			employeeResponse.setStatusCode(401);
			employeeResponse.setMessage("failure");
			employeeResponse.setDec("failed to insert the data ...plz try once...");
		}
		return employeeResponse;
		} else {
			employeeResponse.setStatusCode(501);
			employeeResponse.setMessage("failure");
			employeeResponse.setDec("login first");
		}
		return employeeResponse;
	}

	@PostMapping("/createEmployee")
	public EmployeeResponse addEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {

		EmployeeResponse employeeResponse = new EmployeeResponse();
		/*
		 * EmployeeInfoBean managerid
		 * =dao.getEmployeeInfoBean(employeeInfoBean.getManagerid().getId());
		 * employeeInfoBean.setManagerid(managerid);
		 */
		System.out.println("em" + employeeInfoBean.getId());
		if (dao.createEmployeeInfo(employeeInfoBean)) {
			employeeResponse.setStatusCode(201);
			employeeResponse.setMessage("successful");
			employeeResponse.setDec("Employee data inserted successfully");
		} else {
			employeeResponse.setStatusCode(401);
			employeeResponse.setMessage("failure");
			employeeResponse.setDec("failed to insert the data ...plz try once...");
		}
		return employeeResponse;

		// return dao.createEmployeeInfo(employeeInfoBean);

	}

	@PutMapping("/updateEmployee")
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean employeeInfoBean,HttpServletRequest request) {
		EmployeeResponse response = new EmployeeResponse();
		if (request.getSession(false) != null) {
		if (dao.updateEmployeeInfo(employeeInfoBean)) {
			response.setStatusCode(201);
			response.setMessage("successful");
			response.setDec("Employee data inserted successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDec("failed to insert the data ...plz try once...");
		}
		return response;
		} else {
			response.setStatusCode(501);
			response.setMessage("failure");
			response.setDec("login first");
		}
		return response;
		// return dao.updateEmployeeInfo(employeeInfoBean);

	}

	@DeleteMapping("/removeEmployee")
	public EmployeeResponse removeEmployee(@RequestParam("id") int id,HttpServletRequest request) {
		EmployeeResponse response = new EmployeeResponse();
		if (request.getSession(false) != null) {
		if (dao.removeEmployee(id)) {
			response.setStatusCode(201);
			response.setMessage("successful");
			response.setDec("Employee data deleted successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDec("failed to delete the data ...plz try once...");
		}
		return response;
		} else {
			response.setStatusCode(501);
			response.setMessage("failure");
			response.setDec("login first....");
		}
		return response;
		// return dao.createEmployeeInfo(employeeInfoBean);
	}

	}
