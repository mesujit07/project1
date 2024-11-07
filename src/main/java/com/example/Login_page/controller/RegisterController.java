package com.example.Login_page.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Login_page.repository.userRepositoryy;
import com.example.Login_page.service.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	RegisterService registerService;
	
	@GetMapping("/register")
	public String loadregister(ModelMap map) {
		return "register.html";
	}
	
	
	
	@PostMapping("/register")
	public String handleRegister(@RequestParam String username, @RequestParam String password, ModelMap map,@RequestParam String email) {

		
		return registerService.setregister(username,password,email,map);
	}
}
