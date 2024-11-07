package com.example.Login_page.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Login_page.service.DisplayService;

import ch.qos.logback.core.model.Model;

@Controller
public class DisplayController {

	@Autowired
	DisplayService displayService;
	
	@GetMapping("/display")
	public String handleDisplay(ModelMap map)
	{
		map.addAttribute("users",displayService.displayrecord());
		return "display";
	}

	
}
