package com.covalense.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/deligate")
public class ReqeustDeligationController {

	@GetMapping("/getHomePage")
	public String getHomePage() {
		return "homePage";

	}
	
	@GetMapping("/forwardReq")
	public String forwardReq() {
		return "forward:/forms/getForm";
	}
	
	@GetMapping("/redirectReq")
	public String rediretReq() {
		return "redirect:https://www.google.com";
		
	}

}
