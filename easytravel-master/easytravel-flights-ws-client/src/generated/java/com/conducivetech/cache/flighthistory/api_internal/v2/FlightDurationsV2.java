
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para flightDurationsV2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="flightDurationsV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scheduledBlockMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="blockMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="scheduledAirMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="airMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="scheduledTaxiOutMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="taxiOutMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="scheduledTaxiInMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="taxiInMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightDurationsV2", propOrder = {
    "scheduledBlockMinutes",
    "blockMinutes",
    "scheduledAirMinutes",
    "airMinutes",
    "scheduledTaxiOutMinutes",
    "taxiOutMinutes",
    "scheduledTaxiInMinutes",
    "taxiInMinutes"
})
public class FlightDurationsV2 {

    protected Integer scheduledBlockMinutes;
    protected Integer blockMinutes;
    protected Integer scheduledAirMinutes;
    protected Integer airMinutes;
    protected Integer scheduledTaxiOutMinutes;
    protected Integer taxiOutMinutes;
    protected Integer scheduledTaxiInMinutes;
    protected Integer taxiInMinutes;

    /**
     * Obtiene el valor de la propiedad scheduledBlockMinutes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScheduledBlockMinutes() {
        return scheduledBlockMinutes;
    }

    /**
     * Define el valor de la propiedad scheduledBlockMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScheduledBlockMinutes(Integer value) {
        this.scheduledBlockMinutes = value;
    }

    /**
     * Obtiene el valor de la propiedad blockMinutes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBlockMinutes() {
        return blockMinutes;
    }

    /**
     * Define el valor de la propiedad blockMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBlockMinutes(Integer value) {
        this.blockMinutes = value;
    }

    /**
     * Obtiene el valor de la propiedad scheduledAirMinutes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScheduledAirMinutes() {
        return scheduledAirMinutes;
    }

    /**
     * Define el valor de la propiedad scheduledAirMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScheduledAirMinutes(Integer value) {
        this.scheduledAirMinutes = value;
    }

    /**
     * Obtiene el valor de la propiedad airMinutes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAirMinutes() {
        return airMinutes;
    }

    /**
     * Define el valor de la propiedad airMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAirMinutes(Integer value) {
        this.airMinutes = value;
    }

    /**
     * Obtiene el valor de la propiedad scheduledTaxiOutMinutes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScheduledTaxiOutMinutes() {
        return scheduledTaxiOutMinutes;
    }

    /**
     * Define el valor de la propiedad scheduledTaxiOutMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScheduledTaxiOutMinutes(Integer value) {
        this.scheduledTaxiOutMinutes = value;
    }

    /**
     * Obtiene el valor de la propiedad taxiOutMinutes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaxiOutMinutes() {
        return taxiOutMinutes;
    }

    /**
     * Define el valor de la propiedad taxiOutMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaxiOutMinutes(Integer value) {
        this.taxiOutMinutes = value;
    }

    /**
     * Obtiene el valor de la propiedad scheduledTaxiInMinutes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScheduledTaxiInMinutes() {
        return scheduledTaxiInMinutes;
    }

    /**
     * Define el valor de la propiedad scheduledTaxiInMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScheduledTaxiInMinutes(Integer value) {
        this.scheduledTaxiInMinutes = value;
    }

    /**
     * Obtiene el valor de la propiedad taxiInMinutes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaxiInMinutes() {
        return taxiInMinutes;
    }

    /**
     * Define el valor de la propiedad taxiInMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaxiInMinutes(Integer value) {
        this.taxiInMinutes = value;
    }

}
