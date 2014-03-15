package com.armandorv.easytravel.usersws;

import java.util.Collection;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import org.apache.cxf.annotations.Policies;
import org.apache.cxf.annotations.Policy;

import com.armandorv.easytravel.business.domain.User;
import com.armandorv.easytravel.usersws.exception.UsersWsException;

/**
 * SEI for the users web service, a ws intended for give remote management
 * functionality beyond the fire wall scope.
 * 
 * @author armandorv
 * 
 */
@WebService(name = "usersWebService", targetNamespace = "http://armandorv.com/easytravel/usersws")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
@Policies({
		@Policy(uri = "username-token-policy.xml", placement = Policy.Placement.BINDING),
		//@Policy(uri = "sing-encrypt-policy.xml", placement = Policy.Placement.BINDING) 
		})
public interface UsersWebService {

	/**
	 * Operation to enroll a new user in the system from any management
	 * application.
	 * 
	 * @param name
	 * @param lastname
	 * @param mail
	 * @param username
	 * @param password
	 * @throws UsersWsException
	 */
	@WebMethod(operationName = "newUser")
	public void newUser(@WebParam(name = "user") User user)
			throws UsersWsException;

	/**
	 * Operation to remove a user of the system.
	 * 
	 * @param userId
	 */
	@WebMethod(operationName = "deleteUser")
	public void deleteUser(@WebParam(name = "userId") long userId)
			throws UsersWsException;

	/**
	 * Operation to remove a user of the system.
	 * 
	 * @param username
	 */
	@WebMethod(operationName = "deleteUserByUsername")
	public void deleteUser(@WebParam(name = "username") String username)
			throws UsersWsException;

	/**
	 * Find a user by identifier.
	 * 
	 * @param id
	 * @return
	 */
	@WebMethod(operationName = "findUser")
	public User findUser(@WebParam(name = "id") long id)
			throws UsersWsException;

	/**
	 * Find a user by username.
	 * 
	 * @param username
	 * @return
	 */
	@WebMethod(operationName = "findUserByUsername")
	public User findUser(@WebParam(name = "username") String username)
			throws UsersWsException;

	/**
	 * List all users.
	 * 
	 * @param max
	 *            number of results.
	 * @return the max first users of the system.
	 */
	@WebMethod(operationName = "listNFirstUsers")
	public Collection<User> listUsers(@WebParam(name = "n") int max)
			throws UsersWsException;
}
