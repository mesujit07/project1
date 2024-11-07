package com.example.Login_page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.Login_page.dto.AppProperties;
import com.example.Login_page.dto.DBProperties;

@Component
public class Runner implements CommandLineRunner{

	@Autowired
	AppProperties appProperties;
	@Autowired
	DBProperties dbProperties;
	


	@Override
	public void run(String... args) throws Exception {
		System.out.println("*****************App properties***************");
		System.out.println("App name:"+appProperties.getUsername());
		System.out.println("App password:"+appProperties.getPassword());
		System.out.println("App email:"+appProperties.getEmail());
		System.out.println("App id:"+appProperties.getId());
		
		System.out.println("*****************DB properties***************");
		System.out.println("DB Name:"+dbProperties.getUsername());
		System.out.println("DB password:"+dbProperties.getPassword());
		
	}

	
}
