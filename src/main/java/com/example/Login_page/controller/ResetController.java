package com.example.Login_page.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Login_page.repository.userRepositoryy;
import com.example.Login_page.service.Resetservice;

@Controller
public class ResetController {

	@Autowired
	Resetservice resetservice;

	@GetMapping("/reset")
	public String loadreset(ModelMap map) {
		return "reset.html";
	}
	
	
	
	@PostMapping("/reset")
	public String handleReset(@RequestParam String username, @RequestParam String password, ModelMap map) {    
	  return resetservice.resetPassword(username,password,map);
	}
}
