package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
@RequestMapping("/users")
public class UserController {
	@GetMapping()
	public String getUsers(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit", defaultValue = "20") int limit,
			@RequestParam(value = "sort", defaultValue = "desc") String sort) {
		return "get users with page = " + page + " limit = " + limit + " sort " + sort;
	}

	@GetMapping(path = "/{userId}")
	public String getUserById(@PathVariable String userId) {
		return "get user by id = " + userId;
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> createUser(@Valid @RequestBody User userInput) {
		User user = new User(userInput.getFirstName(), userInput.getLastName(), userInput.getEmail(),
				userInput.getPassword());
		user.setId(User.idFirst++);
		return new ResponseEntity<>(user, HttpStatus.CREATED);
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
