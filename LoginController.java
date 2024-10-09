package com.klef.spring_controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String loginPage() {
		return "auth/login.html";
		
	}
	
	@GetMapping("/about")
	public String about() {
		return "auth/about.html";
	}	
	
	@GetMapping("/signup")
	public String SignupPage() {
		return "auth/signup.html";
	}
	
	@GetMapping("/contact")
	public String Contact() {
		return "auth/contact.html";
	}
	@GetMapping("/payment")
	public String Payment() {
		return "auth/payment.html";
	}
	@GetMapping("/doner")
	public String Doner() {
		return "auth/doner.html";
	}
	
}
