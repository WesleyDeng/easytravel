package com.armandorv.easytravel.web.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.business.domain.User;
import com.armandorv.easytravel.business.exception.BusinessException;
import com.armandorv.easytravel.business.service.UsersService;
import com.armandorv.easytravel.web.exception.PresentationException;

@Component
public class UsersBusinessDelegate {

	@Autowired
	private UsersService usersService;

	public boolean alreadyExist(String username) throws PresentationException {
		try {
			return usersService.getUserByUsername(username) != null;
		} catch (BusinessException e) {
			throw new PresentationException("Error calling for username.");
		}

	}

	public void singup(String name, String lastname, String email,
			String username, String password) throws PresentationException {

		try {
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			user.setMail(email);
			user.setName(name);
			user.setLastname(lastname);

			usersService.createUser(user);
		} catch (BusinessException e) {
			throw new PresentationException("error creating user " + username
					+ " :" + e.getMessage());
		}

	}

}
