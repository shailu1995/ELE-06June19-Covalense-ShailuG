package com.covalense.emp.controller;

import static com.covalense.emp.common.EmpConstants.PROPS_EMP;
import static com.covalense.emp.common.EmpConstants.VIEW_LOGINPAGE;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.covalense.emp.bean.EmployeeInfoBean;
import com.covalense.emp.dto.EmployeeDAO;

@Controller
@RequestMapping("/login")
@PropertySource(PROPS_EMP)
public class LoginController {

	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;

	@GetMapping("/loginPage")
	public String loginPage() {
		return VIEW_LOGINPAGE;
	}

	@PostMapping("/submit")
	public String authenticate(ModelMap modelMap, HttpServletRequest req, int id, String password,
			@Value("${invalide}") String msg, @Value("${dbInteractionType}") String dbInteractionType) {

		//EmployeeDAO infoBean = EmployeeDAOFactoryNew.getInstance(dbInteractionType);
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);

		if (bean != null && bean.getPassword().equals(password)) {
			HttpSession httpSession = req.getSession(true);
			httpSession.setAttribute("msg", "successfully loged in!!!");
			httpSession.setAttribute("bean", bean);
			return "homePage";
		} else {
			modelMap.addAttribute("invalide", msg);
			return VIEW_LOGINPAGE;
		}
	}

	@GetMapping("/Logout")
	public String logout(HttpServletRequest req, ModelMap modelMap,@Value("${logout}")String msg) {
		modelMap.addAttribute("logout", msg);
		return VIEW_LOGINPAGE;
	}

	// validateSession()

	@GetMapping("/validate")
	public String validateSession(HttpSession session, ModelMap modelMap, @RequestParam String url) {
		if (session.isNew()) {
			modelMap.addAttribute("msg", "please login!!");
			session.invalidate();
			return VIEW_LOGINPAGE;
		}
		return url;
	}

	/*
	 * @GetMapping("/validate") public String validateSession2(HttpServletRequest
	 * request, ModelMap modelMap, @RequestParam String url) { if
	 * (request.getSession(false) == null) { modelMap.addAttribute("msg",
	 * "please login!!"); return "loginPage"; } return url; }
	 */

	@GetMapping("/validate1")
	public String validateSession4Post(HttpSession session, ModelMap modelMap, @RequestParam String url) {
		return validateSession(session, modelMap, url);
	}
}
