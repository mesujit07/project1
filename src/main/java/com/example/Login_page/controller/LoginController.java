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
import com.example.Login_page.service.LoginService;
import com.example.Login_page.service.Resetservice;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@GetMapping("/login")
	public String loadHome(ModelMap map) {
		return "login.html";
	}

	@PostMapping("/login")
	public String handleLogin(@RequestParam String username, @RequestParam String password, ModelMap map) {
		return loginService.setlogin(username,password,map);
	}

}
