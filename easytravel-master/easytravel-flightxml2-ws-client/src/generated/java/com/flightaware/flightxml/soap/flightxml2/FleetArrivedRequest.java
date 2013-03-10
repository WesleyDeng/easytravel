
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FleetArrivedRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FleetArrivedRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fleet" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "FleetArrivedRequest", propOrder = {
    "fleet",
    "howMany",
    "offset"
})
public class FleetArrivedRequest {

    @XmlElement(required = true)
    protected String fleet;
    protected int howMany;
    protected int offset;

    /**
     * Obtiene el valor de la propiedad fleet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFleet() {
        return fleet;
    }

    /**
     * Define el valor de la propiedad fleet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFleet(String value) {
        this.fleet = value;
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
