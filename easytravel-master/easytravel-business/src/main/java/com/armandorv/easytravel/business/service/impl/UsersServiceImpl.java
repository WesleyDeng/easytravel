package com.armandorv.easytravel.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.armandorv.easytravel.business.domain.User;
import com.armandorv.easytravel.business.exception.BusinessException;
import com.armandorv.easytravel.business.repository.UserRepository;
import com.armandorv.easytravel.business.service.UsersService;

@Service
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
class UsersServiceImpl implements UsersService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User getUserById(long id) throws BusinessException {
		return userRepository.findOne(id);
	}

	@Override
	public User getUserByUsername(String username) throws BusinessException{
		return userRepository.findByUsername(username);
	}

	@Override
	public Iterable<User> getAllUsers() throws BusinessException{
		return userRepository.findAll();
	}

	@Override
	public void createUser(User user) throws BusinessException{
		userRepository.save(user);
	}

	@Override
	public void deleteUser(long id) throws BusinessException{
		userRepository.delete(id);
	}

}