package com.visa.prj.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class LoginController {
	@RequestMapping("login.do")
	public String doLogin(@RequestParam("email") String email, @RequestParam("pwd") String pws, Model m) {
		m.addAttribute("user", email);
		return "listProducts.do";
	}
	//Traditional way of coding still works
	/*
	@RequestMapping("login.do")
	public String doLogin(HttpServletRequest req) {
		HttpSession ses = req.getSession(true);
		ses.setAttribute("user", req.getParameter("email"));
		return "listProducts.do";
	}
	*/
}
