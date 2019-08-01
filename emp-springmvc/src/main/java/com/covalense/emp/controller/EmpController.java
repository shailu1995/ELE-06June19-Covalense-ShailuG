package com.covalense.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/abc")
public class EmpController {
	@RequestMapping(path = "/getMessage", method = RequestMethod.GET)
	public ModelAndView getMessage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("../WEB-INF/views/messagePage.jsp");
		return modelAndView;
	}
}
