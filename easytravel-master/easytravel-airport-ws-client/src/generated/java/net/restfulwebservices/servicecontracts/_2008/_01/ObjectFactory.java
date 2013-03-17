
package net.restfulwebservices.servicecontracts._2008._01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import net.restfulwebservices.datacontracts._2008._01.Airport;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.restfulwebservices.servicecontracts._2008._01 package. 
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

    private final static QName _GetDetailsByCityRequest_QNAME = new QName("http://www.restfulwebservices.net/ServiceContracts/2008/01", "request");
    private final static QName _GetDetailsByAirportNameResponseGetDetailsByAirportNameResult_QNAME = new QName("http://www.restfulwebservices.net/ServiceContracts/2008/01", "GetDetailsByAirportNameResult");
    private final static QName _GetDetailsByIATACodeResponseGetDetailsByIATACodeResult_QNAME = new QName("http://www.restfulwebservices.net/ServiceContracts/2008/01", "GetDetailsByIATACodeResult");
    private final static QName _GetDetailsByICAOCodeResponseGetDetailsByICAOCodeResult_QNAME = new QName("http://www.restfulwebservices.net/ServiceContracts/2008/01", "GetDetailsByICAOCodeResult");
    private final static QName _GetDetailsByCityResponseGetDetailsByCityResult_QNAME = new QName("http://www.restfulwebservices.net/ServiceContracts/2008/01", "GetDetailsByCityResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.restfulwebservices.servicecontracts._2008._01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDetailsByICAOCodeResponse }
     * 
     */
    public GetDetailsByICAOCodeResponse createGetDetailsByICAOCodeResponse() {
        return new GetDetailsByICAOCodeResponse();
    }

    /**
     * Create an instance of {@link GetDetailsByAirportName }
     * 
     */
    public GetDetailsByAirportName createGetDetailsByAirportName() {
        return new GetDetailsByAirportName();
    }

    /**
     * Create an instance of {@link GetDetailsByICAOCode }
     * 
     */
    public GetDetailsByICAOCode createGetDetailsByICAOCode() {
        return new GetDetailsByICAOCode();
    }

    /**
     * Create an instance of {@link GetDetailsByIATACode }
     * 
     */
    public GetDetailsByIATACode createGetDetailsByIATACode() {
        return new GetDetailsByIATACode();
    }

    /**
     * Create an instance of {@link GetDetailsByIATACodeResponse }
     * 
     */
    public GetDetailsByIATACodeResponse createGetDetailsByIATACodeResponse() {
        return new GetDetailsByIATACodeResponse();
    }

    /**
     * Create an instance of {@link GetDetailsByAirportNameResponse }
     * 
     */
    public GetDetailsByAirportNameResponse createGetDetailsByAirportNameResponse() {
        return new GetDetailsByAirportNameResponse();
    }

    /**
     * Create an instance of {@link GetDetailsByCityResponse }
     * 
     */
    public GetDetailsByCityResponse createGetDetailsByCityResponse() {
        return new GetDetailsByCityResponse();
    }

    /**
     * Create an instance of {@link GetDetailsByCity }
     * 
     */
    public GetDetailsByCity createGetDetailsByCity() {
        return new GetDetailsByCity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", name = "request", scope = GetDetailsByCity.class)
    public JAXBElement<String> createGetDetailsByCityRequest(String value) {
        return new JAXBElement<String>(_GetDetailsByCityRequest_QNAME, String.class, GetDetailsByCity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", name = "request", scope = GetDetailsByAirportName.class)
    public JAXBElement<String> createGetDetailsByAirportNameRequest(String value) {
        return new JAXBElement<String>(_GetDetailsByCityRequest_QNAME, String.class, GetDetailsByAirportName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Airport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", name = "GetDetailsByAirportNameResult", scope = GetDetailsByAirportNameResponse.class)
    public JAXBElement<Airport> createGetDetailsByAirportNameResponseGetDetailsByAirportNameResult(Airport value) {
        return new JAXBElement<Airport>(_GetDetailsByAirportNameResponseGetDetailsByAirportNameResult_QNAME, Airport.class, GetDetailsByAirportNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", name = "request", scope = GetDetailsByIATACode.class)
    public JAXBElement<String> createGetDetailsByIATACodeRequest(String value) {
        return new JAXBElement<String>(_GetDetailsByCityRequest_QNAME, String.class, GetDetailsByIATACode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", name = "request", scope = GetDetailsByICAOCode.class)
    public JAXBElement<String> createGetDetailsByICAOCodeRequest(String value) {
        return new JAXBElement<String>(_GetDetailsByCityRequest_QNAME, String.class, GetDetailsByICAOCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Airport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", name = "GetDetailsByIATACodeResult", scope = GetDetailsByIATACodeResponse.class)
    public JAXBElement<Airport> createGetDetailsByIATACodeResponseGetDetailsByIATACodeResult(Airport value) {
        return new JAXBElement<Airport>(_GetDetailsByIATACodeResponseGetDetailsByIATACodeResult_QNAME, Airport.class, GetDetailsByIATACodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Airport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", name = "GetDetailsByICAOCodeResult", scope = GetDetailsByICAOCodeResponse.class)
    public JAXBElement<Airport> createGetDetailsByICAOCodeResponseGetDetailsByICAOCodeResult(Airport value) {
        return new JAXBElement<Airport>(_GetDetailsByICAOCodeResponseGetDetailsByICAOCodeResult_QNAME, Airport.class, GetDetailsByICAOCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Airport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", name = "GetDetailsByCityResult", scope = GetDetailsByCityResponse.class)
    public JAXBElement<Airport> createGetDetailsByCityResponseGetDetailsByCityResult(Airport value) {
        return new JAXBElement<Airport>(_GetDetailsByCityResponseGetDetailsByCityResult_QNAME, Airport.class, GetDetailsByCityResponse.class, value);
    }

}
