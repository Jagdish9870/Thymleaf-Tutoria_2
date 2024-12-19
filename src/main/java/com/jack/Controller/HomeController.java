package com.jack.Controller;


import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index( ) {
	
		return "index";
	}
	
	@GetMapping("/profile")
	public String profile() {
		
		
		
		return "profile";
	}
	@GetMapping("/about")
	public String about() {
		
		
		
		return "about";
	}
	
}
