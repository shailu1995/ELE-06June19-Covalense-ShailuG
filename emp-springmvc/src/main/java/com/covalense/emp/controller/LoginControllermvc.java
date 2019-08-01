package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.emp.bean.EmployeeInfoBean;
import com.covalense.emp.dto.UserBean;

public class LoginControllermvc {
	@Controller
	@RequestMapping("/Form")
	public class FormHandlingController {
		@GetMapping("/getForm")
		public String getForm() {
			return "login";
		}
		@PostMapping("./submitForm")
		public String submitForm3(EmployeeInfoBean infoBean, ModelMap modelMap,HttpServletRequest req) {
			modelMap.addAttribute("infoBean", infoBean);
			return "createEmployee";
		}
		
		
	}
}
