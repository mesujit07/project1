package com.example.Login_page.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import com.example.Login_page.dto.User;

@Controller
public interface userRepositoryy extends JpaRepository<User, Integer> {
	 User findByName(String username);
}
