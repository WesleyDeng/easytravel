
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para airportTracks_dep complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="airportTracks_dep">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="appKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="airport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="carrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includeFlightPlan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="maxPositions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxPositionAgeMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxFlights" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="extendedOptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "airportTracks_dep", propOrder = {
    "appId",
    "appKey",
    "airport",
    "carrier",
    "includeFlightPlan",
    "maxPositions",
    "maxPositionAgeMinutes",
    "codeType",
    "maxFlights",
    "extendedOptions"
})
public class AirportTracksDep {

    @XmlElement(required = true)
    protected String appId;
    @XmlElement(required = true)
    protected String appKey;
    @XmlElement(required = true)
    protected String airport;
    protected String carrier;
    protected Boolean includeFlightPlan;
    protected Integer maxPositions;
    protected Integer maxPositionAgeMinutes;
    protected String codeType;
    protected Integer maxFlights;
    protected String extendedOptions;

    /**
     * Obtiene el valor de la propiedad appId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Define el valor de la propiedad appId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppId(String value) {
        this.appId = value;
    }

    /**
     * Obtiene el valor de la propiedad appKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppKey() {
        return appKey;
    }

    /**
     * Define el valor de la propiedad appKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppKey(String value) {
        this.appKey = value;
    }

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
     * Obtiene el valor de la propiedad carrier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Define el valor de la propiedad carrier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Obtiene el valor de la propiedad includeFlightPlan.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeFlightPlan() {
        return includeFlightPlan;
    }

    /**
     * Define el valor de la propiedad includeFlightPlan.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeFlightPlan(Boolean value) {
        this.includeFlightPlan = value;
    }

    /**
     * Obtiene el valor de la propiedad maxPositions.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPositions() {
        return maxPositions;
    }

    /**
     * Define el valor de la propiedad maxPositions.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxPositions(Integer value) {
        this.maxPositions = value;
    }

    /**
     * Obtiene el valor de la propiedad maxPositionAgeMinutes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPositionAgeMinutes() {
        return maxPositionAgeMinutes;
    }

    /**
     * Define el valor de la propiedad maxPositionAgeMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxPositionAgeMinutes(Integer value) {
        this.maxPositionAgeMinutes = value;
    }

    /**
     * Obtiene el valor de la propiedad codeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeType() {
        return codeType;
    }

    /**
     * Define el valor de la propiedad codeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeType(String value) {
        this.codeType = value;
    }

    /**
     * Obtiene el valor de la propiedad maxFlights.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxFlights() {
        return maxFlights;
    }

    /**
     * Define el valor de la propiedad maxFlights.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxFlights(Integer value) {
        this.maxFlights = value;
    }

    /**
     * Obtiene el valor de la propiedad extendedOptions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedOptions() {
        return extendedOptions;
    }

    /**
     * Define el valor de la propiedad extendedOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedOptions(String value) {
        this.extendedOptions = value;
    }

}
