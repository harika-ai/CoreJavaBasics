package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("home")
	// @ResponseBody
	public String home(HttpServletRequest req, HttpServletResponse res) {
		HttpSession session = req.getSession();
		String name = req.getParameter("name");
		session.setAttribute("name", name);
		// instead of welcome.jsp as welcome because of properties file
		return "welcome";
	}

	@RequestMapping("homeSpring")
	// string as name it will work but different name
	public String homeSpring(@RequestParam("name") String myName, HttpSession session) {
		session.setAttribute("name", myName);
		// instead of welcome.jsp as welcome because of properties file
		return "welcome";
	}
	// Dispatchservlet required both data and view--data as model

	@RequestMapping("modelAndView")
	public ModelAndView modelAndView(@RequestParam("name") String myName) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", myName);
		mv.setViewName("welcome");
		return mv;
	}
	@RequestMapping("alien")
	public ModelAndView alien(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("welcome");
		return mv;
	}
}
