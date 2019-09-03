package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	@GetMapping
	public String getUsers() {
		return "get users";
	}

	@GetMapping(path = "/{userId}")
	public String getUserById(@PathVariable String userId) {
		return "get user by id = " + userId;
	}

	@PostMapping
	public String createUser() {
		return " create user";
	}

	@PutMapping
	public String updateUser() {
		return " update user";
	}

	@DeleteMapping
	public String deleteUser() {
		return " delete user";
	}

}
