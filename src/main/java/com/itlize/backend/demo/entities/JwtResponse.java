package com.itlize.backend.demo.entities;


import java.io.Serializable;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;
	private String token;
	private User user;

	public JwtResponse(User user, String token) {
		this.user = user;
		this.token = token;
	}

	public JwtResponse() {
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
