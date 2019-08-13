package com.covalense.springrest.controller;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
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

import com.covalense.springrest.bean.EmployeeInfoBean;
import com.covalense.springrest.dao.EmployeeDAO;

@Controller
@RequestMapping("/employeerest")
public class RestController {
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}
	
	@GetMapping(path="/getEmployee")
	public @ResponseBody EmployeeInfoBean getEmployee(@RequestParam("id") int id){
		return dao.getEmployeeInfoBean(id);
		
	}
	
	@GetMapping("/getAllEmployee")
	public @ResponseBody List<EmployeeInfoBean> getAllEmployeeXml(){
		return dao.getAllEmployeeInfo();
	}
	
	@PostMapping("/createEmployee")
	public @ResponseBody boolean addEmployee(@RequestBody EmployeeInfoBean employeeInfoBean){
		return dao.createEmployeeInfo(employeeInfoBean);
		
	}
	
	@PutMapping("/updateEmployee")
	public @ResponseBody boolean updateEmployee(@RequestBody EmployeeInfoBean employeeInfoBean){
		return dao.updateEmployeeInfo(employeeInfoBean);
		
	}
	@DeleteMapping("/removeEmployee")
	public @ResponseBody boolean removeEmployee(@RequestParam() EmployeeInfoBean employeeInfoBean){
		return dao.createEmployeeInfo(employeeInfoBean);
		
	}
	
}
