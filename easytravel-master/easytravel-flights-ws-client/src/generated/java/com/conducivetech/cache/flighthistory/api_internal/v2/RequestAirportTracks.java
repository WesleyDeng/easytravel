
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para requestAirportTracks complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="requestAirportTracks">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestBase">
 *       &lt;sequence>
 *         &lt;element name="airport" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedAirportV1" minOccurs="0"/>
 *         &lt;element name="carrier" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedAirlineV1" minOccurs="0"/>
 *         &lt;element name="includeFlightPlan" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedBoolean" minOccurs="0"/>
 *         &lt;element name="maxPositions" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedInteger" minOccurs="0"/>
 *         &lt;element name="maxPositionAgeMinutes" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedInteger" minOccurs="0"/>
 *         &lt;element name="codeType" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedString" minOccurs="0"/>
 *         &lt;element name="maxFlights" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedInteger" minOccurs="0"/>
 *         &lt;element name="extendedOptions" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestAirportTracks", propOrder = {
    "airport",
    "carrier",
    "includeFlightPlan",
    "maxPositions",
    "maxPositionAgeMinutes",
    "codeType",
    "maxFlights",
    "extendedOptions"
})
public class RequestAirportTracks
    extends RequestBase
{

    protected RequestedAirportV1 airport;
    protected RequestedAirlineV1 carrier;
    protected RequestedBoolean includeFlightPlan;
    protected RequestedInteger maxPositions;
    protected RequestedInteger maxPositionAgeMinutes;
    protected RequestedString codeType;
    protected RequestedInteger maxFlights;
    protected RequestedString extendedOptions;

    /**
     * Obtiene el valor de la propiedad airport.
     * 
     * @return
     *     possible object is
     *     {@link RequestedAirportV1 }
     *     
     */
    public RequestedAirportV1 getAirport() {
        return airport;
    }

    /**
     * Define el valor de la propiedad airport.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedAirportV1 }
     *     
     */
    public void setAirport(RequestedAirportV1 value) {
        this.airport = value;
    }

    /**
     * Obtiene el valor de la propiedad carrier.
     * 
     * @return
     *     possible object is
     *     {@link RequestedAirlineV1 }
     *     
     */
    public RequestedAirlineV1 getCarrier() {
        return carrier;
    }

    /**
     * Define el valor de la propiedad carrier.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedAirlineV1 }
     *     
     */
    public void setCarrier(RequestedAirlineV1 value) {
        this.carrier = value;
    }

    /**
     * Obtiene el valor de la propiedad includeFlightPlan.
     * 
     * @return
     *     possible object is
     *     {@link RequestedBoolean }
     *     
     */
    public RequestedBoolean getIncludeFlightPlan() {
        return includeFlightPlan;
    }

    /**
     * Define el valor de la propiedad includeFlightPlan.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedBoolean }
     *     
     */
    public void setIncludeFlightPlan(RequestedBoolean value) {
        this.includeFlightPlan = value;
    }

    /**
     * Obtiene el valor de la propiedad maxPositions.
     * 
     * @return
     *     possible object is
     *     {@link RequestedInteger }
     *     
     */
    public RequestedInteger getMaxPositions() {
        return maxPositions;
    }

    /**
     * Define el valor de la propiedad maxPositions.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedInteger }
     *     
     */
    public void setMaxPositions(RequestedInteger value) {
        this.maxPositions = value;
    }

    /**
     * Obtiene el valor de la propiedad maxPositionAgeMinutes.
     * 
     * @return
     *     possible object is
     *     {@link RequestedInteger }
     *     
     */
    public RequestedInteger getMaxPositionAgeMinutes() {
        return maxPositionAgeMinutes;
    }

    /**
     * Define el valor de la propiedad maxPositionAgeMinutes.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedInteger }
     *     
     */
    public void setMaxPositionAgeMinutes(RequestedInteger value) {
        this.maxPositionAgeMinutes = value;
    }

    /**
     * Obtiene el valor de la propiedad codeType.
     * 
     * @return
     *     possible object is
     *     {@link RequestedString }
     *     
     */
    public RequestedString getCodeType() {
        return codeType;
    }

    /**
     * Define el valor de la propiedad codeType.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedString }
     *     
     */
    public void setCodeType(RequestedString value) {
        this.codeType = value;
    }

    /**
     * Obtiene el valor de la propiedad maxFlights.
     * 
     * @return
     *     possible object is
     *     {@link RequestedInteger }
     *     
     */
    public RequestedInteger getMaxFlights() {
        return maxFlights;
    }

    /**
     * Define el valor de la propiedad maxFlights.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedInteger }
     *     
     */
    public void setMaxFlights(RequestedInteger value) {
        this.maxFlights = value;
    }

    /**
     * Obtiene el valor de la propiedad extendedOptions.
     * 
     * @return
     *     possible object is
     *     {@link RequestedString }
     *     
     */
    public RequestedString getExtendedOptions() {
        return extendedOptions;
    }

    /**
     * Define el valor de la propiedad extendedOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedString }
     *     
     */
    public void setExtendedOptions(RequestedString value) {
        this.extendedOptions = value;
    }

}
