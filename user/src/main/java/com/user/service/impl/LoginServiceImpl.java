package com.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.Login;
import com.user.repo.LoginRepository;
import com.user.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
@Autowired
LoginRepository userrepo;

 @Override
public List<Login> getLoginData() {
return userrepo.findAll();

 }
}