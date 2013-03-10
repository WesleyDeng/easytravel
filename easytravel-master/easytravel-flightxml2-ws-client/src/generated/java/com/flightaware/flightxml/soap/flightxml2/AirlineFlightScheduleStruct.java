
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AirlineFlightScheduleStruct complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AirlineFlightScheduleStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ident" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actual_ident" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="departuretime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arrivaltime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aircrafttype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="meal_service" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seats_cabin_first" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="seats_cabin_business" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="seats_cabin_coach" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineFlightScheduleStruct", propOrder = {
    "ident",
    "actualIdent",
    "departuretime",
    "arrivaltime",
    "origin",
    "destination",
    "aircrafttype",
    "mealService",
    "seatsCabinFirst",
    "seatsCabinBusiness",
    "seatsCabinCoach"
})
public class AirlineFlightScheduleStruct {

    @XmlElement(required = true)
    protected String ident;
    @XmlElement(name = "actual_ident", required = true)
    protected String actualIdent;
    protected int departuretime;
    protected int arrivaltime;
    @XmlElement(required = true)
    protected String origin;
    @XmlElement(required = true)
    protected String destination;
    @XmlElement(required = true)
    protected String aircrafttype;
    @XmlElement(name = "meal_service", required = true)
    protected String mealService;
    @XmlElement(name = "seats_cabin_first")
    protected int seatsCabinFirst;
    @XmlElement(name = "seats_cabin_business")
    protected int seatsCabinBusiness;
    @XmlElement(name = "seats_cabin_coach")
    protected int seatsCabinCoach;

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
     * Obtiene el valor de la propiedad actualIdent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualIdent() {
        return actualIdent;
    }

    /**
     * Define el valor de la propiedad actualIdent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualIdent(String value) {
        this.actualIdent = value;
    }

    /**
     * Obtiene el valor de la propiedad departuretime.
     * 
     */
    public int getDeparturetime() {
        return departuretime;
    }

    /**
     * Define el valor de la propiedad departuretime.
     * 
     */
    public void setDeparturetime(int value) {
        this.departuretime = value;
    }

    /**
     * Obtiene el valor de la propiedad arrivaltime.
     * 
     */
    public int getArrivaltime() {
        return arrivaltime;
    }

    /**
     * Define el valor de la propiedad arrivaltime.
     * 
     */
    public void setArrivaltime(int value) {
        this.arrivaltime = value;
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
     * Obtiene el valor de la propiedad mealService.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealService() {
        return mealService;
    }

    /**
     * Define el valor de la propiedad mealService.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealService(String value) {
        this.mealService = value;
    }

    /**
     * Obtiene el valor de la propiedad seatsCabinFirst.
     * 
     */
    public int getSeatsCabinFirst() {
        return seatsCabinFirst;
    }

    /**
     * Define el valor de la propiedad seatsCabinFirst.
     * 
     */
    public void setSeatsCabinFirst(int value) {
        this.seatsCabinFirst = value;
    }

    /**
     * Obtiene el valor de la propiedad seatsCabinBusiness.
     * 
     */
    public int getSeatsCabinBusiness() {
        return seatsCabinBusiness;
    }

    /**
     * Define el valor de la propiedad seatsCabinBusiness.
     * 
     */
    public void setSeatsCabinBusiness(int value) {
        this.seatsCabinBusiness = value;
    }

    /**
     * Obtiene el valor de la propiedad seatsCabinCoach.
     * 
     */
    public int getSeatsCabinCoach() {
        return seatsCabinCoach;
    }

    /**
     * Define el valor de la propiedad seatsCabinCoach.
     * 
     */
    public void setSeatsCabinCoach(int value) {
        this.seatsCabinCoach = value;
    }

}
