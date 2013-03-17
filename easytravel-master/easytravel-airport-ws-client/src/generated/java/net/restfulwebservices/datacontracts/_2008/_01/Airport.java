
package net.restfulwebservices.datacontracts._2008._01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Airport complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Airport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Altitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Iata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Icao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LatitudeDegrees" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LatitudeDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LatitudeMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LatitudeSeconds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LongitudeDegrees" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LongitudeDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LongitudeMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LongitudeSeconds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Airport", propOrder = {
    "airportName",
    "altitude",
    "city",
    "country",
    "iata",
    "icao",
    "latitudeDegrees",
    "latitudeDirection",
    "latitudeMinutes",
    "latitudeSeconds",
    "longitudeDegrees",
    "longitudeDirection",
    "longitudeMinutes",
    "longitudeSeconds"
})
public class Airport {

    @XmlElementRef(name = "AirportName", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airportName;
    @XmlElementRef(name = "Altitude", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> altitude;
    @XmlElementRef(name = "City", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "Country", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> country;
    @XmlElementRef(name = "Iata", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iata;
    @XmlElementRef(name = "Icao", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> icao;
    @XmlElementRef(name = "LatitudeDegrees", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> latitudeDegrees;
    @XmlElementRef(name = "LatitudeDirection", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> latitudeDirection;
    @XmlElementRef(name = "LatitudeMinutes", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> latitudeMinutes;
    @XmlElementRef(name = "LatitudeSeconds", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> latitudeSeconds;
    @XmlElementRef(name = "LongitudeDegrees", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> longitudeDegrees;
    @XmlElementRef(name = "LongitudeDirection", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> longitudeDirection;
    @XmlElementRef(name = "LongitudeMinutes", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> longitudeMinutes;
    @XmlElementRef(name = "LongitudeSeconds", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> longitudeSeconds;

    /**
     * Obtiene el valor de la propiedad airportName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirportName() {
        return airportName;
    }

    /**
     * Define el valor de la propiedad airportName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirportName(JAXBElement<String> value) {
        this.airportName = value;
    }

    /**
     * Obtiene el valor de la propiedad altitude.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAltitude() {
        return altitude;
    }

    /**
     * Define el valor de la propiedad altitude.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAltitude(JAXBElement<String> value) {
        this.altitude = value;
    }

    /**
     * Obtiene el valor de la propiedad city.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Define el valor de la propiedad city.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = value;
    }

    /**
     * Obtiene el valor de la propiedad country.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountry(JAXBElement<String> value) {
        this.country = value;
    }

    /**
     * Obtiene el valor de la propiedad iata.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIata() {
        return iata;
    }

    /**
     * Define el valor de la propiedad iata.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIata(JAXBElement<String> value) {
        this.iata = value;
    }

    /**
     * Obtiene el valor de la propiedad icao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIcao() {
        return icao;
    }

    /**
     * Define el valor de la propiedad icao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIcao(JAXBElement<String> value) {
        this.icao = value;
    }

    /**
     * Obtiene el valor de la propiedad latitudeDegrees.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLatitudeDegrees() {
        return latitudeDegrees;
    }

    /**
     * Define el valor de la propiedad latitudeDegrees.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLatitudeDegrees(JAXBElement<Integer> value) {
        this.latitudeDegrees = value;
    }

    /**
     * Obtiene el valor de la propiedad latitudeDirection.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLatitudeDirection() {
        return latitudeDirection;
    }

    /**
     * Define el valor de la propiedad latitudeDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLatitudeDirection(JAXBElement<String> value) {
        this.latitudeDirection = value;
    }

    /**
     * Obtiene el valor de la propiedad latitudeMinutes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLatitudeMinutes() {
        return latitudeMinutes;
    }

    /**
     * Define el valor de la propiedad latitudeMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLatitudeMinutes(JAXBElement<Integer> value) {
        this.latitudeMinutes = value;
    }

    /**
     * Obtiene el valor de la propiedad latitudeSeconds.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLatitudeSeconds() {
        return latitudeSeconds;
    }

    /**
     * Define el valor de la propiedad latitudeSeconds.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLatitudeSeconds(JAXBElement<Integer> value) {
        this.latitudeSeconds = value;
    }

    /**
     * Obtiene el valor de la propiedad longitudeDegrees.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLongitudeDegrees() {
        return longitudeDegrees;
    }

    /**
     * Define el valor de la propiedad longitudeDegrees.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLongitudeDegrees(JAXBElement<Integer> value) {
        this.longitudeDegrees = value;
    }

    /**
     * Obtiene el valor de la propiedad longitudeDirection.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLongitudeDirection() {
        return longitudeDirection;
    }

    /**
     * Define el valor de la propiedad longitudeDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLongitudeDirection(JAXBElement<String> value) {
        this.longitudeDirection = value;
    }

    /**
     * Obtiene el valor de la propiedad longitudeMinutes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLongitudeMinutes() {
        return longitudeMinutes;
    }

    /**
     * Define el valor de la propiedad longitudeMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLongitudeMinutes(JAXBElement<Integer> value) {
        this.longitudeMinutes = value;
    }

    /**
     * Obtiene el valor de la propiedad longitudeSeconds.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLongitudeSeconds() {
        return longitudeSeconds;
    }

    /**
     * Define el valor de la propiedad longitudeSeconds.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLongitudeSeconds(JAXBElement<Integer> value) {
        this.longitudeSeconds = value;
    }

}
