package com.example.demo.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class User {
	private int id;
	@NotNull(message = "FirstName cannot be nulled")	
	private String firstName;
	@NotNull(message = "LastName cannot be nulled")
	private String lastName;
	@NotNull(message = "Email cannot be nulled")
	@Email
	private String email;
	@NotNull(message = "Password cannot be nulled")
	private String password;

	public static int idFirst = 0;

	public User(String firstName, String lastName, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
