package com.user.test.repositories;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserRepositoryBean implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("username")
	private String username;
	
	@JsonProperty("password")
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserRepositoryBean(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public UserRepositoryBean() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	

}
