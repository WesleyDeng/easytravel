
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para airportV1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="airportV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fs" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="icao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeZoneRegionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="weatherZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="utcOffsetHours" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="elevationFeet" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="classification" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delayIndexUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weatherUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "airportV1", propOrder = {
    "fs",
    "iata",
    "icao",
    "faa",
    "name",
    "street1",
    "street2",
    "city",
    "cityCode",
    "district",
    "stateCode",
    "postalCode",
    "countryCode",
    "countryName",
    "regionName",
    "timeZoneRegionName",
    "weatherZone",
    "localTime",
    "utcOffsetHours",
    "latitude",
    "longitude",
    "elevationFeet",
    "classification",
    "active",
    "dateFrom",
    "dateTo",
    "delayIndexUrl",
    "weatherUrl"
})
public class AirportV1 {

    @XmlElement(required = true)
    protected String fs;
    protected String iata;
    protected String icao;
    protected String faa;
    protected String name;
    protected String street1;
    protected String street2;
    @XmlElement(required = true)
    protected String city;
    protected String cityCode;
    protected String district;
    protected String stateCode;
    protected String postalCode;
    @XmlElement(required = true)
    protected String countryCode;
    @XmlElement(required = true)
    protected String countryName;
    @XmlElement(required = true)
    protected String regionName;
    @XmlElement(required = true)
    protected String timeZoneRegionName;
    protected String weatherZone;
    @XmlElement(required = true)
    protected String localTime;
    protected double utcOffsetHours;
    protected double latitude;
    protected double longitude;
    protected Integer elevationFeet;
    protected int classification;
    protected boolean active;
    protected String dateFrom;
    protected String dateTo;
    protected String delayIndexUrl;
    protected String weatherUrl;

    /**
     * Obtiene el valor de la propiedad fs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFs() {
        return fs;
    }

    /**
     * Define el valor de la propiedad fs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFs(String value) {
        this.fs = value;
    }

    /**
     * Obtiene el valor de la propiedad iata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIata() {
        return iata;
    }

    /**
     * Define el valor de la propiedad iata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIata(String value) {
        this.iata = value;
    }

    /**
     * Obtiene el valor de la propiedad icao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcao() {
        return icao;
    }

    /**
     * Define el valor de la propiedad icao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcao(String value) {
        this.icao = value;
    }

    /**
     * Obtiene el valor de la propiedad faa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaa() {
        return faa;
    }

    /**
     * Define el valor de la propiedad faa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaa(String value) {
        this.faa = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad street1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet1() {
        return street1;
    }

    /**
     * Define el valor de la propiedad street1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet1(String value) {
        this.street1 = value;
    }

    /**
     * Obtiene el valor de la propiedad street2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet2() {
        return street2;
    }

    /**
     * Define el valor de la propiedad street2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet2(String value) {
        this.street2 = value;
    }

    /**
     * Obtiene el valor de la propiedad city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Define el valor de la propiedad city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Obtiene el valor de la propiedad cityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Define el valor de la propiedad cityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * Obtiene el valor de la propiedad district.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Define el valor de la propiedad district.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Obtiene el valor de la propiedad stateCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Define el valor de la propiedad stateCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Obtiene el valor de la propiedad postalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Define el valor de la propiedad postalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad countryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Define el valor de la propiedad countryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad countryName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Define el valor de la propiedad countryName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Obtiene el valor de la propiedad regionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * Define el valor de la propiedad regionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionName(String value) {
        this.regionName = value;
    }

    /**
     * Obtiene el valor de la propiedad timeZoneRegionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneRegionName() {
        return timeZoneRegionName;
    }

    /**
     * Define el valor de la propiedad timeZoneRegionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneRegionName(String value) {
        this.timeZoneRegionName = value;
    }

    /**
     * Obtiene el valor de la propiedad weatherZone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherZone() {
        return weatherZone;
    }

    /**
     * Define el valor de la propiedad weatherZone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherZone(String value) {
        this.weatherZone = value;
    }

    /**
     * Obtiene el valor de la propiedad localTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTime() {
        return localTime;
    }

    /**
     * Define el valor de la propiedad localTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTime(String value) {
        this.localTime = value;
    }

    /**
     * Obtiene el valor de la propiedad utcOffsetHours.
     * 
     */
    public double getUtcOffsetHours() {
        return utcOffsetHours;
    }

    /**
     * Define el valor de la propiedad utcOffsetHours.
     * 
     */
    public void setUtcOffsetHours(double value) {
        this.utcOffsetHours = value;
    }

    /**
     * Obtiene el valor de la propiedad latitude.
     * 
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Define el valor de la propiedad latitude.
     * 
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    /**
     * Obtiene el valor de la propiedad longitude.
     * 
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Define el valor de la propiedad longitude.
     * 
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    /**
     * Obtiene el valor de la propiedad elevationFeet.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getElevationFeet() {
        return elevationFeet;
    }

    /**
     * Define el valor de la propiedad elevationFeet.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setElevationFeet(Integer value) {
        this.elevationFeet = value;
    }

    /**
     * Obtiene el valor de la propiedad classification.
     * 
     */
    public int getClassification() {
        return classification;
    }

    /**
     * Define el valor de la propiedad classification.
     * 
     */
    public void setClassification(int value) {
        this.classification = value;
    }

    /**
     * Obtiene el valor de la propiedad active.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Define el valor de la propiedad active.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Obtiene el valor de la propiedad dateFrom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFrom() {
        return dateFrom;
    }

    /**
     * Define el valor de la propiedad dateFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFrom(String value) {
        this.dateFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad dateTo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTo() {
        return dateTo;
    }

    /**
     * Define el valor de la propiedad dateTo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTo(String value) {
        this.dateTo = value;
    }

    /**
     * Obtiene el valor de la propiedad delayIndexUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayIndexUrl() {
        return delayIndexUrl;
    }

    /**
     * Define el valor de la propiedad delayIndexUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayIndexUrl(String value) {
        this.delayIndexUrl = value;
    }

    /**
     * Obtiene el valor de la propiedad weatherUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherUrl() {
        return weatherUrl;
    }

    /**
     * Define el valor de la propiedad weatherUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherUrl(String value) {
        this.weatherUrl = value;
    }

}
