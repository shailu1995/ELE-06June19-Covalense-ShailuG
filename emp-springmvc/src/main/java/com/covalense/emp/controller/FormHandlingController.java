package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.covalense.emp.dto.UserBean;

@Controller
@RequestMapping("/forms")
public class FormHandlingController {
	@GetMapping("/getForm")
	public String getForm() {
		return "myform";
	}// end of get form

	@PostMapping("/formSubmit")
	public String submitForm(HttpServletRequest req) {
		int userId = Integer.parseInt(req.getParameter("userId"));
		String pwd = req.getParameter("password");

		req.setAttribute("userId", userId);
		req.setAttribute("password", pwd);
		return "FormDataDisplay";
	}// end of submit form

	@PostMapping("./submitForm2")
	public String submitForm2(int userId, String password, ModelMap modelMap) {
		modelMap.addAttribute("userid", userId);
		modelMap.addAttribute("password", password);
		return "formDataDisplay";
	}

	@PostMapping("./submitForm3")
	public String submitForm3(UserBean userBean, ModelMap modelMap) {
		modelMap.addAttribute("userBean", userBean);
		return "formDataDisplay";
	}
	@PostMapping("./submitForm4")
	public String submitForm4(@RequestParam(name="userId") int uid,
			@RequestParam(name="password") String pwd,ModelMap modelMap) {
		modelMap.addAttribute("userid", uid);
		modelMap.addAttribute("password", pwd);
		return "formDataDisplay";
		
	}
	@PostMapping("/submitForm5")
	public String submitForm5(@RequestParam(name="userId") int uid,
			@RequestParam(name="password") String pwd,ModelMap modelMap) {
		modelMap.addAttribute("userid", uid);
		modelMap.addAttribute("password", pwd);
		return "formDataDisplayEL";
		
	}
	@PostMapping("/submitForm6")
	public String submitForm5(UserBean userBean,ModelMap modelMap) {
		modelMap.addAttribute("UserBean", userBean);
		return "formDataDisplayEL";
		
	}

}// end of class
