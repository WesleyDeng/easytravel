
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para requestedAirportV1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="requestedAirportV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="airport" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}airportV1" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestedAirportV1", propOrder = {
    "requestedCode",
    "fsCode",
    "airport",
    "error"
})
public class RequestedAirportV1 {

    protected String requestedCode;
    protected String fsCode;
    protected AirportV1 airport;
    protected String error;

    /**
     * Obtiene el valor de la propiedad requestedCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedCode() {
        return requestedCode;
    }

    /**
     * Define el valor de la propiedad requestedCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedCode(String value) {
        this.requestedCode = value;
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
     * Obtiene el valor de la propiedad airport.
     * 
     * @return
     *     possible object is
     *     {@link AirportV1 }
     *     
     */
    public AirportV1 getAirport() {
        return airport;
    }

    /**
     * Define el valor de la propiedad airport.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportV1 }
     *     
     */
    public void setAirport(AirportV1 value) {
        this.airport = value;
    }

    /**
     * Obtiene el valor de la propiedad error.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Define el valor de la propiedad error.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

}
