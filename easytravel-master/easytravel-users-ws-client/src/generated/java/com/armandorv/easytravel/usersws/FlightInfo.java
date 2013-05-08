
package com.armandorv.easytravel.usersws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para flightInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="flightInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="departureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="destinationAirportICAO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationAirportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flightId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originAirportICAO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originAirportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightInfo", propOrder = {
    "arrivalTime",
    "departureTime",
    "destinationAirportICAO",
    "destinationAirportName",
    "destinationCity",
    "flightId",
    "originAirportICAO",
    "originAirportName",
    "originCity"
})
public class FlightInfo {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureTime;
    protected String destinationAirportICAO;
    protected String destinationAirportName;
    protected String destinationCity;
    protected String flightId;
    protected String originAirportICAO;
    protected String originAirportName;
    protected String originCity;

    /**
     * Obtiene el valor de la propiedad arrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Define el valor de la propiedad arrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalTime(XMLGregorianCalendar value) {
        this.arrivalTime = value;
    }

    /**
     * Obtiene el valor de la propiedad departureTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureTime() {
        return departureTime;
    }

    /**
     * Define el valor de la propiedad departureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureTime(XMLGregorianCalendar value) {
        this.departureTime = value;
    }

    /**
     * Obtiene el valor de la propiedad destinationAirportICAO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationAirportICAO() {
        return destinationAirportICAO;
    }

    /**
     * Define el valor de la propiedad destinationAirportICAO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationAirportICAO(String value) {
        this.destinationAirportICAO = value;
    }

    /**
     * Obtiene el valor de la propiedad destinationAirportName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationAirportName() {
        return destinationAirportName;
    }

    /**
     * Define el valor de la propiedad destinationAirportName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationAirportName(String value) {
        this.destinationAirportName = value;
    }

    /**
     * Obtiene el valor de la propiedad destinationCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCity() {
        return destinationCity;
    }

    /**
     * Define el valor de la propiedad destinationCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCity(String value) {
        this.destinationCity = value;
    }

    /**
     * Obtiene el valor de la propiedad flightId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightId() {
        return flightId;
    }

    /**
     * Define el valor de la propiedad flightId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightId(String value) {
        this.flightId = value;
    }

    /**
     * Obtiene el valor de la propiedad originAirportICAO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginAirportICAO() {
        return originAirportICAO;
    }

    /**
     * Define el valor de la propiedad originAirportICAO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginAirportICAO(String value) {
        this.originAirportICAO = value;
    }

    /**
     * Obtiene el valor de la propiedad originAirportName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginAirportName() {
        return originAirportName;
    }

    /**
     * Define el valor de la propiedad originAirportName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginAirportName(String value) {
        this.originAirportName = value;
    }

    /**
     * Obtiene el valor de la propiedad originCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCity() {
        return originCity;
    }

    /**
     * Define el valor de la propiedad originCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCity(String value) {
        this.originCity = value;
    }

}
