package com.app.postgres.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.postgres.entity.User;
import com.app.postgres.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;

	@PostMapping("/create")
	public ResponseEntity<String> createUser(@RequestBody User user) {
		service.addUser(user);
		String msg = "User created successfully";
		return ResponseEntity.ok(msg);
	}

	@GetMapping("/get")
	public ResponseEntity<List<User>> findAllUser() {
		List<User> user = service.getAllUser();
		return ResponseEntity.ok(user);
	}

}
