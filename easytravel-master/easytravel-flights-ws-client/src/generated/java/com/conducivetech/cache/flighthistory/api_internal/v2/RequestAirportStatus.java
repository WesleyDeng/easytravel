
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para requestAirportStatus complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="requestAirportStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestBase">
 *       &lt;sequence>
 *         &lt;element name="airport" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedAirportV1" minOccurs="0"/>
 *         &lt;element name="carrier" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedAirlineV1" minOccurs="0"/>
 *         &lt;element name="date" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedDate" minOccurs="0"/>
 *         &lt;element name="hourOfDay" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedInteger" minOccurs="0"/>
 *         &lt;element name="numHours" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedInteger" minOccurs="0"/>
 *         &lt;element name="utc" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestedBoolean" minOccurs="0"/>
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
@XmlType(name = "requestAirportStatus", propOrder = {
    "airport",
    "carrier",
    "date",
    "hourOfDay",
    "numHours",
    "utc",
    "codeType",
    "maxFlights",
    "extendedOptions"
})
public class RequestAirportStatus
    extends RequestBase
{

    protected RequestedAirportV1 airport;
    protected RequestedAirlineV1 carrier;
    protected RequestedDate date;
    protected RequestedInteger hourOfDay;
    protected RequestedInteger numHours;
    protected RequestedBoolean utc;
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
     * Obtiene el valor de la propiedad date.
     * 
     * @return
     *     possible object is
     *     {@link RequestedDate }
     *     
     */
    public RequestedDate getDate() {
        return date;
    }

    /**
     * Define el valor de la propiedad date.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedDate }
     *     
     */
    public void setDate(RequestedDate value) {
        this.date = value;
    }

    /**
     * Obtiene el valor de la propiedad hourOfDay.
     * 
     * @return
     *     possible object is
     *     {@link RequestedInteger }
     *     
     */
    public RequestedInteger getHourOfDay() {
        return hourOfDay;
    }

    /**
     * Define el valor de la propiedad hourOfDay.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedInteger }
     *     
     */
    public void setHourOfDay(RequestedInteger value) {
        this.hourOfDay = value;
    }

    /**
     * Obtiene el valor de la propiedad numHours.
     * 
     * @return
     *     possible object is
     *     {@link RequestedInteger }
     *     
     */
    public RequestedInteger getNumHours() {
        return numHours;
    }

    /**
     * Define el valor de la propiedad numHours.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedInteger }
     *     
     */
    public void setNumHours(RequestedInteger value) {
        this.numHours = value;
    }

    /**
     * Obtiene el valor de la propiedad utc.
     * 
     * @return
     *     possible object is
     *     {@link RequestedBoolean }
     *     
     */
    public RequestedBoolean getUtc() {
        return utc;
    }

    /**
     * Define el valor de la propiedad utc.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedBoolean }
     *     
     */
    public void setUtc(RequestedBoolean value) {
        this.utc = value;
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
