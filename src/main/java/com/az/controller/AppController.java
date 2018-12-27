package com.az.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.az.model.User;
import com.az.service.UserService;

import lombok.extern.java.Log;

@Log
@Controller
public class AppController {

	@Autowired
	private UserService userService;
	
	@Value("${homePage.welcomeMsg}")
	private String welcomeMessage;
	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		log.info("welcome second Method Call");
		model.put("message",this.welcomeMessage);
		return "home";
	}
	
	// Just for testing purpose
	@RequestMapping("/Az")
	public String welcome2(ModelMap model) {
		log.info("welcome second Method Call");
		model.put("message", this.welcomeMessage);
		log.info("welcome second Method End");
		return "home";
	}
	
	@ModelAttribute("userList")
	public List<User> fetchAllUsers(){
		return userService.getAllUsers();
	}
}
