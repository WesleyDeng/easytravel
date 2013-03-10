
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MetarExRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MetarExRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "MetarExRequest", propOrder = {
    "airport",
    "startTime",
    "howMany",
    "offset"
})
public class MetarExRequest {

    @XmlElement(required = true)
    protected String airport;
    protected int startTime;
    protected int howMany;
    protected int offset;

    /**
     * Obtiene el valor de la propiedad airport.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirport() {
        return airport;
    }

    /**
     * Define el valor de la propiedad airport.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirport(String value) {
        this.airport = value;
    }

    /**
     * Obtiene el valor de la propiedad startTime.
     * 
     */
    public int getStartTime() {
        return startTime;
    }

    /**
     * Define el valor de la propiedad startTime.
     * 
     */
    public void setStartTime(int value) {
        this.startTime = value;
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
