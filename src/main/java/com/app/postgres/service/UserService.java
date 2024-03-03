package com.app.postgres.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.postgres.entity.User;
import com.app.postgres.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public ResponseEntity<String> addUser(User user) {
		try {
			userRepository.save(user);
		} catch (Exception e) {
			throw new RuntimeException("User not created");
		}
		return null;
	}
	public List<User> getAllUser() {
		try {
			return userRepository.findAll();
		} catch (Exception e) {
			throw new RuntimeException("User not found");
		}
		
	}

}
