
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AirlineFlightSchedulesRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AirlineFlightSchedulesRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="airline" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flightno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="howMany" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineFlightSchedulesRequest", propOrder = {
    "startDate",
    "endDate",
    "origin",
    "destination",
    "airline",
    "flightno",
    "howMany",
    "offset"
})
public class AirlineFlightSchedulesRequest {

    protected int startDate;
    protected int endDate;
    @XmlElement(required = true)
    protected String origin;
    @XmlElement(required = true)
    protected String destination;
    @XmlElement(required = true)
    protected String airline;
    @XmlElement(required = true)
    protected String flightno;
    protected int howMany;
    protected int offset;

    /**
     * Obtiene el valor de la propiedad startDate.
     * 
     */
    public int getStartDate() {
        return startDate;
    }

    /**
     * Define el valor de la propiedad startDate.
     * 
     */
    public void setStartDate(int value) {
        this.startDate = value;
    }

    /**
     * Obtiene el valor de la propiedad endDate.
     * 
     */
    public int getEndDate() {
        return endDate;
    }

    /**
     * Define el valor de la propiedad endDate.
     * 
     */
    public void setEndDate(int value) {
        this.endDate = value;
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
     * Obtiene el valor de la propiedad airline.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirline() {
        return airline;
    }

    /**
     * Define el valor de la propiedad airline.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirline(String value) {
        this.airline = value;
    }

    /**
     * Obtiene el valor de la propiedad flightno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightno() {
        return flightno;
    }

    /**
     * Define el valor de la propiedad flightno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightno(String value) {
        this.flightno = value;
    }

    /**
     * Obtiene el valor de la propiedad howMany.
     * 
     */
    public int getHowMany() {
        return howMany;
    }

    /**
     * Define el valor de la propiedad howMany.
     * 
     */
    public void setHowMany(int value) {
        this.howMany = value;
    }

    /**
     * Obtiene el valor de la propiedad offset.
     * 
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Define el valor de la propiedad offset.
     * 
     */
    public void setOffset(int value) {
        this.offset = value;
    }

}
