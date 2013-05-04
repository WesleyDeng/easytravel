package com.armandorv.easytravel.userswsclient;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.usersws.User;
import com.armandorv.easytravel.usersws.UsersWebService;
import com.armandorv.easytravel.usersws.UsersWsException;
import com.armandorv.easytravel.userswsclient.exception.UsersException;
import com.armandorv.easytravel.userswsclient.model.UserDetails;

@Component
public class UsersServiceImpl implements UsersService {

	private static Logger log = Logger.getLogger(UsersServiceImpl.class);

	@Autowired
	private UsersWebService usersWebService;

	@Override
	public List<UserDetails> getUsers(int n) throws UsersException {
		try {
			List<User> wsusers = usersWebService.listNFirstUsers(n);
			List<UserDetails> users = new ArrayList<>();

			for (User wsuser : wsusers) {
				users.add(new UserDetails(-1L, wsuser.getName(), wsuser
						.getLastname(), wsuser.getMail(), wsuser.getUsername(),
						wsuser.getPassword()));
			}

			return users;
		} catch (UsersWsException e) {
			log.error("Error getting users.");
			throw new UsersException("Error getting the users list.", e);
		}
	}

	@Override
	public void newUser(UserDetails user) throws UsersException {
		try {
			User wsuser = new User();
			wsuser.setName(user.getName());
			wsuser.setLastname(user.getLastname());
			wsuser.setMail(user.getMail());
			wsuser.setUsername(user.getUsername());
			wsuser.setPassword(user.getPassword());

			usersWebService.newUser(wsuser);
		} catch (UsersWsException e) {
			log.error("Error getting users.");
			throw new UsersException("Error getting the users list.", e);
		}
	}

	@Override
	public UserDetails getUser(long id) throws UsersException {
		try {
			User user = usersWebService.findUser(id);
			return new UserDetails(-1L, user.getName(), user.getLastname(),
					user.getMail(), user.getUsername(), user.getPassword());
		} catch (UsersWsException e) {
			log.error("Error getting users.");
			throw new UsersException("Error getting the users list.", e);
		}
	}

	@Override
	public UserDetails getUser(String username) throws UsersException {
		try {
			User user = usersWebService.findUserByUsername(username);
			return new UserDetails(-1L, user.getName(), user.getLastname(),
					user.getMail(), user.getUsername(), user.getPassword());
		} catch (UsersWsException e) {
			log.error("Error getting users.");
			throw new UsersException("Error getting the users list.", e);
		}
	}

	@Override
	public void deleteUser(long id) throws UsersException {
		try {
			usersWebService.deleteUser(id);
		} catch (UsersWsException e) {
			log.error("Error getting users.");
			throw new UsersException("Error getting the users list.", e);
		}
	}

	@Override
	public void deleteUser(String username) throws UsersException {
		try {
			usersWebService.deleteUserByUsername(username);
		} catch (UsersWsException e) {
			log.error("Error getting users.");
			throw new UsersException("Error getting the users list.", e);
		}
	}

}