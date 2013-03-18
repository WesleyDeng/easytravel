
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para requestedAirlineV1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="requestedAirlineV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="airline" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}airlineV1" minOccurs="0"/>
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
@XmlType(name = "requestedAirlineV1", propOrder = {
    "requestedCode",
    "fsCode",
    "airline",
    "error"
})
public class RequestedAirlineV1 {

    protected String requestedCode;
    protected String fsCode;
    protected AirlineV1 airline;
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
     * Obtiene el valor de la propiedad airline.
     * 
     * @return
     *     possible object is
     *     {@link AirlineV1 }
     *     
     */
    public AirlineV1 getAirline() {
        return airline;
    }

    /**
     * Define el valor de la propiedad airline.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineV1 }
     *     
     */
    public void setAirline(AirlineV1 value) {
        this.airline = value;
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
