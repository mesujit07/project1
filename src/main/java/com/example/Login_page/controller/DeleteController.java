package com.example.Login_page.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Login_page.repository.userRepositoryy;
import com.example.Login_page.service.DeleteService;

@Controller
public class DeleteController {

	
	@Autowired
	DeleteService deleteService;
	@GetMapping("/delete/{id}")
	public String handleDelete(@PathVariable int id,ModelMap map)
	{
		deleteService.deleteRecord(id,map);
		return "display";
		
	}
}
