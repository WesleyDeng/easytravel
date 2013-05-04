package com.armandorv.easytravel.business.service;

import com.armandorv.easytravel.business.domain.User;
import com.armandorv.easytravel.business.exception.BusinessException;

public interface UsersService {

	User getUserById(long id) throws BusinessException;

	User getUserByUsername(String username) throws BusinessException;

	Iterable<User> getAllUsers() throws BusinessException;

	void createUser(User user) throws BusinessException;

	void deleteUser(long id) throws BusinessException;

}
