package com.armandorv.easytravel.usersws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2013-05-08T08:05:02.608+02:00
 * Generated source version: 2.7.3
 * 
 */
@WebServiceClient(name = "UsersWebService", 
                  wsdlLocation = "http://users.easytravel.cloudfoundry.com/services/UsersWebService?wsdl",
                  targetNamespace = "http://armandorv.com/easytravel/usersws") 
public class UsersWebService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://armandorv.com/easytravel/usersws", "UsersWebService");
    public final static QName UsersWebService = new QName("http://armandorv.com/easytravel/usersws", "UsersWebService");
    static {
        URL url = null;
        try {
            url = new URL("http://users.easytravel.cloudfoundry.com/services/UsersWebService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(UsersWebService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://users.easytravel.cloudfoundry.com/services/UsersWebService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public UsersWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UsersWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UsersWebService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public UsersWebService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public UsersWebService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public UsersWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns UsersWebService
     */
    @WebEndpoint(name = "UsersWebService")
    public UsersWebService getUsersWebService() {
        return super.getPort(UsersWebService, UsersWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UsersWebService
     */
    @WebEndpoint(name = "UsersWebService")
    public UsersWebService getUsersWebService(WebServiceFeature... features) {
        return super.getPort(UsersWebService, UsersWebService.class, features);
    }

}