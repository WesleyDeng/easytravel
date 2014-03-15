
package com.armandorv.easytravel.usersws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.armandorv.easytravel.usersws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteUserResponse_QNAME = new QName("http://armandorv.com/easytravel/usersws", "deleteUserResponse");
    private final static QName _FindUser_QNAME = new QName("http://armandorv.com/easytravel/usersws", "findUser");
    private final static QName _DeleteUser_QNAME = new QName("http://armandorv.com/easytravel/usersws", "deleteUser");
    private final static QName _ListNFirstUsers_QNAME = new QName("http://armandorv.com/easytravel/usersws", "listNFirstUsers");
    private final static QName _FindUserResponse_QNAME = new QName("http://armandorv.com/easytravel/usersws", "findUserResponse");
    private final static QName _NewUser_QNAME = new QName("http://armandorv.com/easytravel/usersws", "newUser");
    private final static QName _DeleteUserByUsernameResponse_QNAME = new QName("http://armandorv.com/easytravel/usersws", "deleteUserByUsernameResponse");
    private final static QName _NewUserResponse_QNAME = new QName("http://armandorv.com/easytravel/usersws", "newUserResponse");
    private final static QName _FindUserByUsername_QNAME = new QName("http://armandorv.com/easytravel/usersws", "findUserByUsername");
    private final static QName _FindUserByUsernameResponse_QNAME = new QName("http://armandorv.com/easytravel/usersws", "findUserByUsernameResponse");
    private final static QName _DeleteUserByUsername_QNAME = new QName("http://armandorv.com/easytravel/usersws", "deleteUserByUsername");
    private final static QName _ListNFirstUsersResponse_QNAME = new QName("http://armandorv.com/easytravel/usersws", "listNFirstUsersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.armandorv.easytravel.usersws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link DeleteUserByUsernameResponse }
     * 
     */
    public DeleteUserByUsernameResponse createDeleteUserByUsernameResponse() {
        return new DeleteUserByUsernameResponse();
    }

    /**
     * Create an instance of {@link NewUserResponse }
     * 
     */
    public NewUserResponse createNewUserResponse() {
        return new NewUserResponse();
    }

    /**
     * Create an instance of {@link FindUserByUsername }
     * 
     */
    public FindUserByUsername createFindUserByUsername() {
        return new FindUserByUsername();
    }

    /**
     * Create an instance of {@link FindUser }
     * 
     */
    public FindUser createFindUser() {
        return new FindUser();
    }

    /**
     * Create an instance of {@link FindUserByUsernameResponse }
     * 
     */
    public FindUserByUsernameResponse createFindUserByUsernameResponse() {
        return new FindUserByUsernameResponse();
    }

    /**
     * Create an instance of {@link DeleteUserByUsername }
     * 
     */
    public DeleteUserByUsername createDeleteUserByUsername() {
        return new DeleteUserByUsername();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link ListNFirstUsers }
     * 
     */
    public ListNFirstUsers createListNFirstUsers() {
        return new ListNFirstUsers();
    }

    /**
     * Create an instance of {@link NewUser }
     * 
     */
    public NewUser createNewUser() {
        return new NewUser();
    }

    /**
     * Create an instance of {@link ListNFirstUsersResponse }
     * 
     */
    public ListNFirstUsersResponse createListNFirstUsersResponse() {
        return new ListNFirstUsersResponse();
    }

    /**
     * Create an instance of {@link FindUserResponse }
     * 
     */
    public FindUserResponse createFindUserResponse() {
        return new FindUserResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://armandorv.com/easytravel/usersws", name = "deleteUserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<DeleteUserResponse>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://armandorv.com/easytravel/usersws", name = "findUser")
    public JAXBElement<FindUser> createFindUser(FindUser value) {
        return new JAXBElement<FindUser>(_FindUser_QNAME, FindUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://armandorv.com/easytravel/usersws", name = "deleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListNFirstUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://armandorv.com/easytravel/usersws", name = "listNFirstUsers")
    public JAXBElement<ListNFirstUsers> createListNFirstUsers(ListNFirstUsers value) {
        return new JAXBElement<ListNFirstUsers>(_ListNFirstUsers_QNAME, ListNFirstUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://armandorv.com/easytravel/usersws", name = "findUserResponse")
    public JAXBElement<FindUserResponse> createFindUserResponse(FindUserResponse value) {
        return new JAXBElement<FindUserResponse>(_FindUserResponse_QNAME, FindUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://armandorv.com/easytravel/usersws", name = "newUser")
    public JAXBElement<NewUser> createNewUser(NewUser value) {
        return new JAXBElement<NewUser>(_NewUser_QNAME, NewUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserByUsernameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://armandorv.com/easytravel/usersws", name = "deleteUserByUsernameResponse")
    public JAXBElement<DeleteUserByUsernameResponse> createDeleteUserByUsernameResponse(DeleteUserByUsernameResponse value) {
        return new JAXBElement<DeleteUserByUsernameResponse>(_DeleteUserByUsernameResponse_QNAME, DeleteUserByUsernameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://armandorv.com/easytravel/usersws", name = "newUserResponse")
    public JAXBElement<NewUserResponse> createNewUserResponse(NewUserResponse value) {
        return new JAXBElement<NewUserResponse>(_NewUserResponse_QNAME, NewUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserByUsername }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://armandorv.com/easytravel/usersws", name = "findUserByUsername")
    public JAXBElement<FindUserByUsername> createFindUserByUsername(FindUserByUsername value) {
        return new JAXBElement<FindUserByUsername>(_FindUserByUsername_QNAME, FindUserByUsername.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserByUsernameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://armandorv.com/easytravel/usersws", name = "findUserByUsernameResponse")
    public JAXBElement<FindUserByUsernameResponse> createFindUserByUsernameResponse(FindUserByUsernameResponse value) {
        return new JAXBElement<FindUserByUsernameResponse>(_FindUserByUsernameResponse_QNAME, FindUserByUsernameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserByUsername }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://armandorv.com/easytravel/usersws", name = "deleteUserByUsername")
    public JAXBElement<DeleteUserByUsername> createDeleteUserByUsername(DeleteUserByUsername value) {
        return new JAXBElement<DeleteUserByUsername>(_DeleteUserByUsername_QNAME, DeleteUserByUsername.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListNFirstUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://armandorv.com/easytravel/usersws", name = "listNFirstUsersResponse")
    public JAXBElement<ListNFirstUsersResponse> createListNFirstUsersResponse(ListNFirstUsersResponse value) {
        return new JAXBElement<ListNFirstUsersResponse>(_ListNFirstUsersResponse_QNAME, ListNFirstUsersResponse.class, null, value);
    }

}
