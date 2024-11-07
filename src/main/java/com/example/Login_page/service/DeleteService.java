package com.example.Login_page.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.example.Login_page.dto.User;
import com.example.Login_page.repository.userRepositoryy;

@Service
public class DeleteService {

	
	@Autowired 
	userRepositoryy userRepositoryy;
	
	public void deleteRecord(int id,ModelMap map) {
		map.addAttribute("delete", "successfully deleted");
		userRepositoryy.deleteById(id);
	    List<User> users = userRepositoryy.findAll(); 
	    map.addAttribute("users", users);
	}

}
