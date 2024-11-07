package com.example.Login_page.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.example.Login_page.dto.User;
import com.example.Login_page.repository.userRepositoryy;

@Service
public class Resetservice {

	@Autowired
	userRepositoryy userRepository;
	
	public String resetPassword(String username, String password, ModelMap map) {
		
		  User user = userRepository.findByName(username);
	        if (user != null) {
	            user.setPassword(password);
	            userRepository.save(user); 
	            map.addAttribute("info", "Password updated successfully!");
	            return "login";
	    
	        } else {
	            map.addAttribute("error", "User not found.");
	            return "login"; 
	        }
	        
	}

	
}
