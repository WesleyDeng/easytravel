
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RoutesBetweenAirportsExRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RoutesBetweenAirportsExRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="howMany" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxDepartureAge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maxFileAge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutesBetweenAirportsExRequest", propOrder = {
    "origin",
    "destination",
    "howMany",
    "offset",
    "maxDepartureAge",
    "maxFileAge"
})
public class RoutesBetweenAirportsExRequest {

    @XmlElement(required = true)
    protected String origin;
    @XmlElement(required = true)
    protected String destination;
    protected int howMany;
    protected int offset;
    @XmlElement(required = true)
    protected String maxDepartureAge;
    @XmlElement(required = true)
    protected String maxFileAge;

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

    /**
     * Obtiene el valor de la propiedad maxDepartureAge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxDepartureAge() {
        return maxDepartureAge;
    }

    /**
     * Define el valor de la propiedad maxDepartureAge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDepartureAge(String value) {
        this.maxDepartureAge = value;
    }

    /**
     * Obtiene el valor de la propiedad maxFileAge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxFileAge() {
        return maxFileAge;
    }

    /**
     * Define el valor de la propiedad maxFileAge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxFileAge(String value) {
        this.maxFileAge = value;
    }

}
