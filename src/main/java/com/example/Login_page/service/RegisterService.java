package com.example.Login_page.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.example.Login_page.dto.User;
import com.example.Login_page.repository.userRepositoryy;

@Service
public class RegisterService {

	@Autowired
	userRepositoryy userRepository;

	public String setregister(String username, String password, String email, ModelMap map) {
		if (!username.equals("") && !password.equals("") ) {
		User user=new User();
		user.setName(username);
		user.setPassword(password);
		user.setEmail(email);
		userRepository.save(user);
			map.addAttribute("info", "Congratualtions, " + username + "!");
			return "login";
		} else {
			map.addAttribute("error", "Invalid username or password.");
			return "register";
		}
	}

}
