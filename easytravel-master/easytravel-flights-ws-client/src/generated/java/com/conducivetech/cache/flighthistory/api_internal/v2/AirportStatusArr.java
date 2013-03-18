
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para airportStatus_arr complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="airportStatus_arr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="appKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="airport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hourOfDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="utc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="numHours" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="carrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "airportStatus_arr", propOrder = {
    "appId",
    "appKey",
    "airport",
    "year",
    "month",
    "day",
    "hourOfDay",
    "utc",
    "numHours",
    "carrier",
    "codeType",
    "maxFlights",
    "extendedOptions"
})
public class AirportStatusArr {

    @XmlElement(required = true)
    protected String appId;
    @XmlElement(required = true)
    protected String appKey;
    @XmlElement(required = true)
    protected String airport;
    protected int year;
    protected int month;
    protected int day;
    protected Integer hourOfDay;
    protected Boolean utc;
    protected Integer numHours;
    protected String carrier;
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
     * Obtiene el valor de la propiedad year.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Define el valor de la propiedad year.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Obtiene el valor de la propiedad month.
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Define el valor de la propiedad month.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * Obtiene el valor de la propiedad day.
     * 
     */
    public int getDay() {
        return day;
    }

    /**
     * Define el valor de la propiedad day.
     * 
     */
    public void setDay(int value) {
        this.day = value;
    }

    /**
     * Obtiene el valor de la propiedad hourOfDay.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHourOfDay() {
        return hourOfDay;
    }

    /**
     * Define el valor de la propiedad hourOfDay.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHourOfDay(Integer value) {
        this.hourOfDay = value;
    }

    /**
     * Obtiene el valor de la propiedad utc.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUtc() {
        return utc;
    }

    /**
     * Define el valor de la propiedad utc.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUtc(Boolean value) {
        this.utc = value;
    }

    /**
     * Obtiene el valor de la propiedad numHours.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumHours() {
        return numHours;
    }

    /**
     * Define el valor de la propiedad numHours.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumHours(Integer value) {
        this.numHours = value;
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
