
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AirlineInsightStruct complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AirlineInsightStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="layover" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="carrier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="opcarrier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flights_scheduled" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="flights_performed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="total_passengers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="total_seats" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="total_payload" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="total_mail" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="fare_min" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fare_median" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fare_max" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineInsightStruct", propOrder = {
    "origin",
    "layover",
    "destination",
    "carrier",
    "opcarrier",
    "flightsScheduled",
    "flightsPerformed",
    "totalPassengers",
    "totalSeats",
    "totalPayload",
    "totalMail",
    "percent",
    "fareMin",
    "fareMedian",
    "fareMax"
})
public class AirlineInsightStruct {

    @XmlElement(required = true)
    protected String origin;
    @XmlElement(required = true)
    protected String layover;
    @XmlElement(required = true)
    protected String destination;
    @XmlElement(required = true)
    protected String carrier;
    @XmlElement(required = true)
    protected String opcarrier;
    @XmlElement(name = "flights_scheduled")
    protected int flightsScheduled;
    @XmlElement(name = "flights_performed")
    protected int flightsPerformed;
    @XmlElement(name = "total_passengers")
    protected int totalPassengers;
    @XmlElement(name = "total_seats")
    protected int totalSeats;
    @XmlElement(name = "total_payload")
    protected int totalPayload;
    @XmlElement(name = "total_mail")
    protected int totalMail;
    protected float percent;
    @XmlElement(name = "fare_min", required = true)
    protected String fareMin;
    @XmlElement(name = "fare_median", required = true)
    protected String fareMedian;
    @XmlElement(name = "fare_max", required = true)
    protected String fareMax;

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
     * Obtiene el valor de la propiedad layover.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayover() {
        return layover;
    }

    /**
     * Define el valor de la propiedad layover.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayover(String value) {
        this.layover = value;
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
     * Obtiene el valor de la propiedad carrier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Define el valor de la propiedad carrier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Obtiene el valor de la propiedad opcarrier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcarrier() {
        return opcarrier;
    }

    /**
     * Define el valor de la propiedad opcarrier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcarrier(String value) {
        this.opcarrier = value;
    }

    /**
     * Obtiene el valor de la propiedad flightsScheduled.
     * 
     */
    public int getFlightsScheduled() {
        return flightsScheduled;
    }

    /**
     * Define el valor de la propiedad flightsScheduled.
     * 
     */
    public void setFlightsScheduled(int value) {
        this.flightsScheduled = value;
    }

    /**
     * Obtiene el valor de la propiedad flightsPerformed.
     * 
     */
    public int getFlightsPerformed() {
        return flightsPerformed;
    }

    /**
     * Define el valor de la propiedad flightsPerformed.
     * 
     */
    public void setFlightsPerformed(int value) {
        this.flightsPerformed = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPassengers.
     * 
     */
    public int getTotalPassengers() {
        return totalPassengers;
    }

    /**
     * Define el valor de la propiedad totalPassengers.
     * 
     */
    public void setTotalPassengers(int value) {
        this.totalPassengers = value;
    }

    /**
     * Obtiene el valor de la propiedad totalSeats.
     * 
     */
    public int getTotalSeats() {
        return totalSeats;
    }

    /**
     * Define el valor de la propiedad totalSeats.
     * 
     */
    public void setTotalSeats(int value) {
        this.totalSeats = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPayload.
     * 
     */
    public int getTotalPayload() {
        return totalPayload;
    }

    /**
     * Define el valor de la propiedad totalPayload.
     * 
     */
    public void setTotalPayload(int value) {
        this.totalPayload = value;
    }

    /**
     * Obtiene el valor de la propiedad totalMail.
     * 
     */
    public int getTotalMail() {
        return totalMail;
    }

    /**
     * Define el valor de la propiedad totalMail.
     * 
     */
    public void setTotalMail(int value) {
        this.totalMail = value;
    }

    /**
     * Obtiene el valor de la propiedad percent.
     * 
     */
    public float getPercent() {
        return percent;
    }

    /**
     * Define el valor de la propiedad percent.
     * 
     */
    public void setPercent(float value) {
        this.percent = value;
    }

    /**
     * Obtiene el valor de la propiedad fareMin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareMin() {
        return fareMin;
    }

    /**
     * Define el valor de la propiedad fareMin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareMin(String value) {
        this.fareMin = value;
    }

    /**
     * Obtiene el valor de la propiedad fareMedian.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareMedian() {
        return fareMedian;
    }

    /**
     * Define el valor de la propiedad fareMedian.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareMedian(String value) {
        this.fareMedian = value;
    }

    /**
     * Obtiene el valor de la propiedad fareMax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareMax() {
        return fareMax;
    }

    /**
     * Define el valor de la propiedad fareMax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareMax(String value) {
        this.fareMax = value;
    }

}
