package com.armandorv.easytravel.usersws;

import java.util.ArrayList;
import java.util.Collection;

import javax.jws.WebService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.armandorv.easytravel.business.domain.User;
import com.armandorv.easytravel.business.exception.BusinessException;
import com.armandorv.easytravel.business.service.UsersService;
import com.armandorv.easytravel.usersws.exception.UserNotFoundException;
import com.armandorv.easytravel.usersws.exception.UsersWsException;

@WebService(endpointInterface = "com.armandorv.easytravel.usersws.UsersWebService", serviceName = "UsersWebService", portName = "UsersWebService", targetNamespace = "http://armandorv.com/easytravel/usersws")
public class UsersWebServiceImpl implements UsersWebService {

	private Logger log = Logger.getLogger(UsersWebServiceImpl.class);

	@Autowired
	private UsersService usersService;

	@Override
	public void newUser(User user) throws UsersWsException {
		try {
			usersService.createUser(user);

		} catch (BusinessException e) {
			log.error("Error creating user :" + e.getMessage());
			throw new UsersWsException("Error creating user :" + e.getMessage());
		}
	}

	@Override
	public void deleteUser(long userId) throws UsersWsException {
		try {
			usersService.deleteUser(userId);

		} catch (BusinessException e) {
			log.error("Error at deleteUser: userId = " + userId, e);
			throw new UsersWsException("Error at deleteUser: userId = "
					+ userId);
		}
	}

	@Override
	public void deleteUser(String username) throws UsersWsException {

		try {
			User user = usersService.getUserByUsername(username);

			if (user == null) {
				throw new UserNotFoundException("User " + username
						+ " not found");
			}
			usersService.deleteUser(user.getId());

		} catch (UserNotFoundException e) {
			throw e;
		} catch (BusinessException e) {
			log.error("Error at deleteUser: username = " + username, e);
			throw new UsersWsException("Error at deleteUser: username = "
					+ username);
		}

	}

	@Override
	public User findUser(long id) throws UsersWsException {
		try {
			return usersService.getUserById(id);
		} catch (BusinessException e) {
			log.error("Error at getUserById: id = " + id, e);
			throw new UsersWsException("Error at findUserById: id = " + id);
		}
	}

	@Override
	public User findUser(String username) throws UsersWsException {
		try {
			return usersService.getUserByUsername(username);
		} catch (BusinessException e) {
			log.error("Error at getUserByUsername: id = " + username, e);
			throw new UsersWsException(
					"Error at getUserByUsername: username = " + username);
		}
	}

	@Override
	public Collection<User> listUsers(int max) throws UsersWsException {
		try {
			return firstN(usersService.getAllUsers(), max);
		} catch (BusinessException e) {
			log.error("Error at getAllUsers.", e);
			throw new UsersWsException("Error at getAllUsers.");
		}
	}

	private Collection<User> firstN(Iterable<User> users, int max) {
		Collection<User> firstN = new ArrayList<>();
		int i = 0;
		
		for (User user : users) {
			if (i < max) {
				firstN.add(user);
				i++;
			}
		}
		return firstN;
	}

}