package com.homeworkgc.CoffeeShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.homeworkgc.CoffeeShop.model.AccountService;

@Controller
public class HomeController {

	@Autowired
	AccountService accountService; 
	
	@Autowired
	AccountJDBCDao daoAccount;
	
	@Autowired
	InventoryJDBCDao daoInv;
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("home");
	}
	
	@RequestMapping("/home")
	public String returnHome() {
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
	
	@RequestMapping("/shop-page")
	public ModelAndView shopPage() {
		System.out.println(daoInv.findAllItems());
		return new ModelAndView("shop-page", "test", daoInv.findAllItems());
	}

	@PostMapping("regform")
	public ModelAndView registerPage(@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname, 
			@RequestParam("email")String email, @RequestParam("password") String password) {
		
		daoAccount.addAccount(firstname, lastname, email, password);
		return new ModelAndView("reg-confirmation", "acct", firstname);
	}
	
	
	
}
