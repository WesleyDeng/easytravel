
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para delaysV2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="delaysV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departureGateDelayMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="departureRunwayDelayMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="arrivalGateDelayMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="arrivalRunwayDelayMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delaysV2", propOrder = {
    "departureGateDelayMinutes",
    "departureRunwayDelayMinutes",
    "arrivalGateDelayMinutes",
    "arrivalRunwayDelayMinutes"
})
public class DelaysV2 {

    protected Integer departureGateDelayMinutes;
    protected Integer departureRunwayDelayMinutes;
    protected Integer arrivalGateDelayMinutes;
    protected Integer arrivalRunwayDelayMinutes;

    /**
     * Obtiene el valor de la propiedad departureGateDelayMinutes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDepartureGateDelayMinutes() {
        return departureGateDelayMinutes;
    }

    /**
     * Define el valor de la propiedad departureGateDelayMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDepartureGateDelayMinutes(Integer value) {
        this.departureGateDelayMinutes = value;
    }

    /**
     * Obtiene el valor de la propiedad departureRunwayDelayMinutes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDepartureRunwayDelayMinutes() {
        return departureRunwayDelayMinutes;
    }

    /**
     * Define el valor de la propiedad departureRunwayDelayMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDepartureRunwayDelayMinutes(Integer value) {
        this.departureRunwayDelayMinutes = value;
    }

    /**
     * Obtiene el valor de la propiedad arrivalGateDelayMinutes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArrivalGateDelayMinutes() {
        return arrivalGateDelayMinutes;
    }

    /**
     * Define el valor de la propiedad arrivalGateDelayMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArrivalGateDelayMinutes(Integer value) {
        this.arrivalGateDelayMinutes = value;
    }

    /**
     * Obtiene el valor de la propiedad arrivalRunwayDelayMinutes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArrivalRunwayDelayMinutes() {
        return arrivalRunwayDelayMinutes;
    }

    /**
     * Define el valor de la propiedad arrivalRunwayDelayMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArrivalRunwayDelayMinutes(Integer value) {
        this.arrivalRunwayDelayMinutes = value;
    }

}
