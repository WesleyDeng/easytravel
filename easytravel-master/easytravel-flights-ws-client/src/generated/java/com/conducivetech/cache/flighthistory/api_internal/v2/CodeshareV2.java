
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para codeshareV2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="codeshareV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carrier" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}airlineV1" minOccurs="0"/>
 *         &lt;element name="fsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relationship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "codeshareV2", propOrder = {
    "carrier",
    "fsCode",
    "flightNumber",
    "relationship"
})
public class CodeshareV2 {

    protected AirlineV1 carrier;
    protected String fsCode;
    protected String flightNumber;
    protected String relationship;

    /**
     * Obtiene el valor de la propiedad carrier.
     * 
     * @return
     *     possible object is
     *     {@link AirlineV1 }
     *     
     */
    public AirlineV1 getCarrier() {
        return carrier;
    }

    /**
     * Define el valor de la propiedad carrier.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineV1 }
     *     
     */
    public void setCarrier(AirlineV1 value) {
        this.carrier = value;
    }

    /**
     * Obtiene el valor de la propiedad fsCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsCode() {
        return fsCode;
    }

    /**
     * Define el valor de la propiedad fsCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsCode(String value) {
        this.fsCode = value;
    }

    /**
     * Obtiene el valor de la propiedad flightNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Define el valor de la propiedad flightNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad relationship.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * Define el valor de la propiedad relationship.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationship(String value) {
        this.relationship = value;
    }

}
