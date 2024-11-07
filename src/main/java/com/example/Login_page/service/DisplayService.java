package com.example.Login_page.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Login_page.dto.User;
import com.example.Login_page.repository.userRepositoryy;

@Service
public class DisplayService {

	
	@Autowired
	userRepositoryy userRepositoryy;
	
	public List displayrecord() {
		List<User> user=userRepositoryy.findAll();
		return user;
		
		
	}
	
}
