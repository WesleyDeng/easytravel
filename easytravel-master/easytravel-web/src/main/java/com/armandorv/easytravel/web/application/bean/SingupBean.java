package com.armandorv.easytravel.web.application.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.web.application.UsersBusinessDelegate;
import com.armandorv.easytravel.web.exception.PresentationException;
import com.armandorv.easytravel.web.util.FacesContextUtils;

@Component
@Scope("request")
public class SingupBean implements Serializable{
	
	private static final long serialVersionUID = 9042368689704691253L;

	private String name;

	private String lastname;

	private String username;

	private String email;

	private String password;

	private String confirmPassword;

	@Autowired
	private UsersBusinessDelegate usersBD;

	public String singup() {
		try {
			usersBD.singup(name, lastname, email, username, password);
			return "home";
		} catch (PresentationException e) {
			FacesContextUtils.addMessageError("Error", e.getMessage());
			return "singup";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}
