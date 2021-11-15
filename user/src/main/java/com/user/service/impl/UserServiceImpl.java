package com.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.Signup;
import com.user.repo.UserRepository;
import com.user.service.UserService;
@Service
public class UserServiceImpl implements UserService {
@Autowired
UserRepository userrepo;

 @Override
public List<Signup> getSignupData() {
return userrepo.findAll();

 }

}