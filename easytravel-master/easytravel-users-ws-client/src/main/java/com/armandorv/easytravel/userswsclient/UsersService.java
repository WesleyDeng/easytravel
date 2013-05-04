package com.armandorv.easytravel.userswsclient;

import java.util.List;

import com.armandorv.easytravel.userswsclient.exception.UsersException;
import com.armandorv.easytravel.userswsclient.model.UserDetails;

public interface UsersService {

	List<UserDetails> getUsers(int n) throws UsersException;

	void newUser(UserDetails user) throws UsersException;

	UserDetails getUser(long id) throws UsersException;

	UserDetails getUser(String password) throws UsersException;

	void deleteUser(long id) throws UsersException;

	void deleteUser(String password) throws UsersException;
}