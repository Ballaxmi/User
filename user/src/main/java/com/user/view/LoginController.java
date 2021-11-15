package com.user.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.Login;

import com.user.service.LoginService;
import com.user.service.UserService;
@RestController
	public class LoginController {
	@Autowired
	LoginService userservice;

	 @RequestMapping({ "/", "/login" })
	public List<Login> getLoginData() {
	return userservice.getLoginData();
	}

	}