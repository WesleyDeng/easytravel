
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para downlineFlightV2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="downlineFlightV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arrivalAirport" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}airportV1" minOccurs="0"/>
 *         &lt;element name="fsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flightId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downlineFlightV2", propOrder = {
    "arrivalAirport",
    "fsCode",
    "flightId"
})
public class DownlineFlightV2 {

    protected AirportV1 arrivalAirport;
    protected String fsCode;
    protected Long flightId;

    /**
     * Obtiene el valor de la propiedad arrivalAirport.
     * 
     * @return
     *     possible object is
     *     {@link AirportV1 }
     *     
     */
    public AirportV1 getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * Define el valor de la propiedad arrivalAirport.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportV1 }
     *     
     */
    public void setArrivalAirport(AirportV1 value) {
        this.arrivalAirport = value;
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
     * Obtiene el valor de la propiedad flightId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFlightId() {
        return flightId;
    }

    /**
     * Define el valor de la propiedad flightId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFlightId(Long value) {
        this.flightId = value;
    }

}
