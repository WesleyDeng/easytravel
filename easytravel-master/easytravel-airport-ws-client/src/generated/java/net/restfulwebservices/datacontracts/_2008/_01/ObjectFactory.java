
package net.restfulwebservices.datacontracts._2008._01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.restfulwebservices.datacontracts._2008._01 package. 
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

    private final static QName _Airport_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "Airport");
    private final static QName _AirportCountry_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "Country");
    private final static QName _AirportLatitudeSeconds_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "LatitudeSeconds");
    private final static QName _AirportCity_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "City");
    private final static QName _AirportLongitudeDirection_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "LongitudeDirection");
    private final static QName _AirportLongitudeDegrees_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "LongitudeDegrees");
    private final static QName _AirportIata_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "Iata");
    private final static QName _AirportLatitudeDirection_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "LatitudeDirection");
    private final static QName _AirportLatitudeMinutes_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "LatitudeMinutes");
    private final static QName _AirportLongitudeSeconds_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "LongitudeSeconds");
    private final static QName _AirportAirportName_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "AirportName");
    private final static QName _AirportLongitudeMinutes_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "LongitudeMinutes");
    private final static QName _AirportAltitude_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "Altitude");
    private final static QName _AirportIcao_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "Icao");
    private final static QName _AirportLatitudeDegrees_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "LatitudeDegrees");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.restfulwebservices.datacontracts._2008._01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Airport }
     * 
     */
    public Airport createAirport() {
        return new Airport();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Airport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "Airport")
    public JAXBElement<Airport> createAirport(Airport value) {
        return new JAXBElement<Airport>(_Airport_QNAME, Airport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "Country", scope = Airport.class)
    public JAXBElement<String> createAirportCountry(String value) {
        return new JAXBElement<String>(_AirportCountry_QNAME, String.class, Airport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "LatitudeSeconds", scope = Airport.class)
    public JAXBElement<Integer> createAirportLatitudeSeconds(Integer value) {
        return new JAXBElement<Integer>(_AirportLatitudeSeconds_QNAME, Integer.class, Airport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "City", scope = Airport.class)
    public JAXBElement<String> createAirportCity(String value) {
        return new JAXBElement<String>(_AirportCity_QNAME, String.class, Airport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "LongitudeDirection", scope = Airport.class)
    public JAXBElement<String> createAirportLongitudeDirection(String value) {
        return new JAXBElement<String>(_AirportLongitudeDirection_QNAME, String.class, Airport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "LongitudeDegrees", scope = Airport.class)
    public JAXBElement<Integer> createAirportLongitudeDegrees(Integer value) {
        return new JAXBElement<Integer>(_AirportLongitudeDegrees_QNAME, Integer.class, Airport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "Iata", scope = Airport.class)
    public JAXBElement<String> createAirportIata(String value) {
        return new JAXBElement<String>(_AirportIata_QNAME, String.class, Airport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "LatitudeDirection", scope = Airport.class)
    public JAXBElement<String> createAirportLatitudeDirection(String value) {
        return new JAXBElement<String>(_AirportLatitudeDirection_QNAME, String.class, Airport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "LatitudeMinutes", scope = Airport.class)
    public JAXBElement<Integer> createAirportLatitudeMinutes(Integer value) {
        return new JAXBElement<Integer>(_AirportLatitudeMinutes_QNAME, Integer.class, Airport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "LongitudeSeconds", scope = Airport.class)
    public JAXBElement<Integer> createAirportLongitudeSeconds(Integer value) {
        return new JAXBElement<Integer>(_AirportLongitudeSeconds_QNAME, Integer.class, Airport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "AirportName", scope = Airport.class)
    public JAXBElement<String> createAirportAirportName(String value) {
        return new JAXBElement<String>(_AirportAirportName_QNAME, String.class, Airport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "LongitudeMinutes", scope = Airport.class)
    public JAXBElement<Integer> createAirportLongitudeMinutes(Integer value) {
        return new JAXBElement<Integer>(_AirportLongitudeMinutes_QNAME, Integer.class, Airport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "Altitude", scope = Airport.class)
    public JAXBElement<String> createAirportAltitude(String value) {
        return new JAXBElement<String>(_AirportAltitude_QNAME, String.class, Airport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "Icao", scope = Airport.class)
    public JAXBElement<String> createAirportIcao(String value) {
        return new JAXBElement<String>(_AirportIcao_QNAME, String.class, Airport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "LatitudeDegrees", scope = Airport.class)
    public JAXBElement<Integer> createAirportLatitudeDegrees(Integer value) {
        return new JAXBElement<Integer>(_AirportLatitudeDegrees_QNAME, Integer.class, Airport.class, value);
    }

}
