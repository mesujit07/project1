package com.example.Login_page.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.example.Login_page.dto.User;
import com.example.Login_page.repository.userRepositoryy;

@Service
public class LoginService {

	@Autowired
	userRepositoryy userRepository;

	public String setlogin(String username, String password, ModelMap map) {
		User user = userRepository.findByName(username);

		if (user != null && user.getPassword().equals(password)) {
			map.addAttribute("message", "Welcome to BCITS, " + username + "!");
			return "welcome";
		} else {

			map.addAttribute("error", "Invalid username or password.");
			return "login";
		}
	}

	
}
