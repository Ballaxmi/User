package com.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.model.Login;

public interface LoginRepository extends JpaRepository<Login, String> {

}