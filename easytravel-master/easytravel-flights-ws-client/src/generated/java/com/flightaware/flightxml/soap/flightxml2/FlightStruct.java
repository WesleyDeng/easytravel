
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FlightStruct complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FlightStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ident" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aircrafttype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filed_ete" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filed_time" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="filed_departuretime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="filed_airspeed_kts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="filed_airspeed_mach" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filed_altitude" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="route" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actualdeparturetime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="estimatedarrivaltime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="actualarrivaltime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="diverted" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinationCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightStruct", propOrder = {
    "ident",
    "aircrafttype",
    "filedEte",
    "filedTime",
    "filedDeparturetime",
    "filedAirspeedKts",
    "filedAirspeedMach",
    "filedAltitude",
    "route",
    "actualdeparturetime",
    "estimatedarrivaltime",
    "actualarrivaltime",
    "diverted",
    "origin",
    "destination",
    "originName",
    "originCity",
    "destinationName",
    "destinationCity"
})
public class FlightStruct {

    @XmlElement(required = true)
    protected String ident;
    @XmlElement(required = true)
    protected String aircrafttype;
    @XmlElement(name = "filed_ete", required = true)
    protected String filedEte;
    @XmlElement(name = "filed_time")
    protected int filedTime;
    @XmlElement(name = "filed_departuretime")
    protected int filedDeparturetime;
    @XmlElement(name = "filed_airspeed_kts")
    protected int filedAirspeedKts;
    @XmlElement(name = "filed_airspeed_mach", required = true)
    protected String filedAirspeedMach;
    @XmlElement(name = "filed_altitude")
    protected int filedAltitude;
    @XmlElement(required = true)
    protected String route;
    protected int actualdeparturetime;
    protected int estimatedarrivaltime;
    protected int actualarrivaltime;
    @XmlElement(required = true)
    protected String diverted;
    @XmlElement(required = true)
    protected String origin;
    @XmlElement(required = true)
    protected String destination;
    @XmlElement(required = true)
    protected String originName;
    @XmlElement(required = true)
    protected String originCity;
    @XmlElement(required = true)
    protected String destinationName;
    @XmlElement(required = true)
    protected String destinationCity;

    /**
     * Obtiene el valor de la propiedad ident.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdent() {
        return ident;
    }

    /**
     * Define el valor de la propiedad ident.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdent(String value) {
        this.ident = value;
    }

    /**
     * Obtiene el valor de la propiedad aircrafttype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircrafttype() {
        return aircrafttype;
    }

    /**
     * Define el valor de la propiedad aircrafttype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircrafttype(String value) {
        this.aircrafttype = value;
    }

    /**
     * Obtiene el valor de la propiedad filedEte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiledEte() {
        return filedEte;
    }

    /**
     * Define el valor de la propiedad filedEte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiledEte(String value) {
        this.filedEte = value;
    }

    /**
     * Obtiene el valor de la propiedad filedTime.
     * 
     */
    public int getFiledTime() {
        return filedTime;
    }

    /**
     * Define el valor de la propiedad filedTime.
     * 
     */
    public void setFiledTime(int value) {
        this.filedTime = value;
    }

    /**
     * Obtiene el valor de la propiedad filedDeparturetime.
     * 
     */
    public int getFiledDeparturetime() {
        return filedDeparturetime;
    }

    /**
     * Define el valor de la propiedad filedDeparturetime.
     * 
     */
    public void setFiledDeparturetime(int value) {
        this.filedDeparturetime = value;
    }

    /**
     * Obtiene el valor de la propiedad filedAirspeedKts.
     * 
     */
    public int getFiledAirspeedKts() {
        return filedAirspeedKts;
    }

    /**
     * Define el valor de la propiedad filedAirspeedKts.
     * 
     */
    public void setFiledAirspeedKts(int value) {
        this.filedAirspeedKts = value;
    }

    /**
     * Obtiene el valor de la propiedad filedAirspeedMach.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiledAirspeedMach() {
        return filedAirspeedMach;
    }

    /**
     * Define el valor de la propiedad filedAirspeedMach.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiledAirspeedMach(String value) {
        this.filedAirspeedMach = value;
    }

    /**
     * Obtiene el valor de la propiedad filedAltitude.
     * 
     */
    public int getFiledAltitude() {
        return filedAltitude;
    }

    /**
     * Define el valor de la propiedad filedAltitude.
     * 
     */
    public void setFiledAltitude(int value) {
        this.filedAltitude = value;
    }

    /**
     * Obtiene el valor de la propiedad route.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * Define el valor de la propiedad route.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    /**
     * Obtiene el valor de la propiedad actualdeparturetime.
     * 
     */
    public int getActualdeparturetime() {
        return actualdeparturetime;
    }

    /**
     * Define el valor de la propiedad actualdeparturetime.
     * 
     */
    public void setActualdeparturetime(int value) {
        this.actualdeparturetime = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedarrivaltime.
     * 
     */
    public int getEstimatedarrivaltime() {
        return estimatedarrivaltime;
    }

    /**
     * Define el valor de la propiedad estimatedarrivaltime.
     * 
     */
    public void setEstimatedarrivaltime(int value) {
        this.estimatedarrivaltime = value;
    }

    /**
     * Obtiene el valor de la propiedad actualarrivaltime.
     * 
     */
    public int getActualarrivaltime() {
        return actualarrivaltime;
    }

    /**
     * Define el valor de la propiedad actualarrivaltime.
     * 
     */
    public void setActualarrivaltime(int value) {
        this.actualarrivaltime = value;
    }

    /**
     * Obtiene el valor de la propiedad diverted.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiverted() {
        return diverted;
    }

    /**
     * Define el valor de la propiedad diverted.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiverted(String value) {
        this.diverted = value;
    }

    /**
     * Obtiene el valor de la propiedad origin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Define el valor de la propiedad origin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Obtiene el valor de la propiedad destination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Define el valor de la propiedad destination.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Obtiene el valor de la propiedad originName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginName() {
        return originName;
    }

    /**
     * Define el valor de la propiedad originName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginName(String value) {
        this.originName = value;
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

    /**
     * Obtiene el valor de la propiedad destinationName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationName() {
        return destinationName;
    }

    /**
     * Define el valor de la propiedad destinationName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationName(String value) {
        this.destinationName = value;
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

}
