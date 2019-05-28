package com.homeworkgc.CoffeeShop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("home");

		return mv;
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
	public ModelAndView registerPage(
			@RequestParam("firstname") String firstname, 
			@RequestParam("lastname") String lastname, @RequestParam("gender") String gender,
			@RequestParam("phone") String phone, @RequestParam("email") String email,
			@RequestParam("pass") String password, @RequestParam("street") String street,
			@RequestParam("city") String city, @RequestParam("state") String state,
			@RequestParam("zip") String zip) {

		UserAccount account = new UserAccount(firstname, lastname, gender, phone, email, 
				password, street, city, state, zip);

		return new ModelAndView("reg-confirmation", "acct", account.getFirstName());
	}
}
