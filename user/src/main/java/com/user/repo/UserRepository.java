package com.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.model.Signup;

public interface UserRepository extends JpaRepository<Signup, String> {

}