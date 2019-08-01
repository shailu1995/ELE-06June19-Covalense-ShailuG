package com.covalense.emp.controller;

import static com.covalense.emp.common.EmpConstants.VIEW_LOGINPAGE;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/validator")
public class SessionValidateController {
	
	@GetMapping("/validate/{url1}/{url2}")
	public String validate(HttpSession session,@Value("${invalideSession}")String msg,ModelMap modelMap,
			@PathVariable("url1")String url1,
			@PathVariable("url2")String url2) {
		if (session.isNew()) {
			modelMap.addAttribute("msg", msg);
			return VIEW_LOGINPAGE;
		}
		
		return "forward:/"+url1+"/"+url2;
		
	}
	
	@PostMapping("/validate")
	public String valiadte4Post(HttpSession session,@Value("${invalideSession}")String msg,ModelMap modelMap,
			@PathVariable("url1")String url1,
			@PathVariable("url2")String url2) {
				return valiadte4Post(session, msg, modelMap, url1, url2);
		
		
	}

	


}
