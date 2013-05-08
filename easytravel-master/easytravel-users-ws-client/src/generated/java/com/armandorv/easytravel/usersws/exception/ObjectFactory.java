
package com.armandorv.easytravel.usersws.exception;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.armandorv.easytravel.usersws.exception package. 
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

    private final static QName _UsersWsException_QNAME = new QName("http://armandorv.com/easytravel/usersws/exception", "UsersWsException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.armandorv.easytravel.usersws.exception
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UsersWsException }
     * 
     */
    public UsersWsException createUsersWsException() {
        return new UsersWsException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsersWsException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://armandorv.com/easytravel/usersws/exception", name = "UsersWsException")
    public JAXBElement<UsersWsException> createUsersWsException(UsersWsException value) {
        return new JAXBElement<UsersWsException>(_UsersWsException_QNAME, UsersWsException.class, null, value);
    }

}
