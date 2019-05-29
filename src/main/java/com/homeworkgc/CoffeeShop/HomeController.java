package com.homeworkgc.CoffeeShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.homeworkgc.CoffeeShop.model.AccountService;
import com.homeworkgc.CoffeeShop.model.UserAccount;

@Controller
public class HomeController {

	@Autowired
	AccountService accountService; 
	
	@RequestMapping("/")
	public String index() {
		return "home";
	}

	@RequestMapping("/reg-page")
	public ModelAndView signUp() {
		return new ModelAndView("reg-page");
	}

	@RequestMapping("/login-page")
	public ModelAndView loginPage() {
		return new ModelAndView("login-page");
	}

	@PostMapping("regform")
	public ModelAndView registerPage(UserAccount account) {
		
		return new ModelAndView("reg-confirmation", "acct", account.getFirstname());
	}
	
	@RequestMapping("/home")
	public String returnHome() {
		return "home";
	}
	
}
