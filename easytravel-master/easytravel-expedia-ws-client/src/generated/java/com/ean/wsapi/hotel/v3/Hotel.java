
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Hotel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Hotel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="coordinateAccuracyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lowRate" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="highRate" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="confidence" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="hotelRating" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="tripAdvisorRating" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="market" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="superRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hotel", propOrder = {
    "hotelId",
    "statusCode",
    "name",
    "address1",
    "address2",
    "address3",
    "city",
    "stateProvinceCode",
    "countryCode",
    "postalCode",
    "phone",
    "fax",
    "latitude",
    "longitude",
    "coordinateAccuracyCode",
    "lowRate",
    "highRate",
    "confidence",
    "hotelRating",
    "tripAdvisorRating",
    "market",
    "region",
    "superRegion",
    "theme"
})
public class Hotel {

    protected long hotelId;
    protected String statusCode;
    protected String name;
    protected String address1;
    protected String address2;
    protected String address3;
    protected String city;
    protected String stateProvinceCode;
    protected String countryCode;
    protected String postalCode;
    protected String phone;
    protected String fax;
    protected float latitude;
    protected float longitude;
    protected String coordinateAccuracyCode;
    protected float lowRate;
    protected float highRate;
    protected long confidence;
    protected Float hotelRating;
    protected Float tripAdvisorRating;
    protected String market;
    protected String region;
    protected String superRegion;
    protected String theme;

    /**
     * Obtiene el valor de la propiedad hotelId.
     * 
     */
    public long getHotelId() {
        return hotelId;
    }

    /**
     * Define el valor de la propiedad hotelId.
     * 
     */
    public void setHotelId(long value) {
        this.hotelId = value;
    }

    /**
     * Obtiene el valor de la propiedad statusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Define el valor de la propiedad statusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
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
     * Obtiene el valor de la propiedad address1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Define el valor de la propiedad address1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Obtiene el valor de la propiedad address2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Define el valor de la propiedad address2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Obtiene el valor de la propiedad address3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * Define el valor de la propiedad address3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3(String value) {
        this.address3 = value;
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
     * Obtiene el valor de la propiedad stateProvinceCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProvinceCode() {
        return stateProvinceCode;
    }

    /**
     * Define el valor de la propiedad stateProvinceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProvinceCode(String value) {
        this.stateProvinceCode = value;
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
     * Obtiene el valor de la propiedad phone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Define el valor de la propiedad phone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Obtiene el valor de la propiedad fax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Define el valor de la propiedad fax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Obtiene el valor de la propiedad latitude.
     * 
     */
    public float getLatitude() {
        return latitude;
    }

    /**
     * Define el valor de la propiedad latitude.
     * 
     */
    public void setLatitude(float value) {
        this.latitude = value;
    }

    /**
     * Obtiene el valor de la propiedad longitude.
     * 
     */
    public float getLongitude() {
        return longitude;
    }

    /**
     * Define el valor de la propiedad longitude.
     * 
     */
    public void setLongitude(float value) {
        this.longitude = value;
    }

    /**
     * Obtiene el valor de la propiedad coordinateAccuracyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordinateAccuracyCode() {
        return coordinateAccuracyCode;
    }

    /**
     * Define el valor de la propiedad coordinateAccuracyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinateAccuracyCode(String value) {
        this.coordinateAccuracyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad lowRate.
     * 
     */
    public float getLowRate() {
        return lowRate;
    }

    /**
     * Define el valor de la propiedad lowRate.
     * 
     */
    public void setLowRate(float value) {
        this.lowRate = value;
    }

    /**
     * Obtiene el valor de la propiedad highRate.
     * 
     */
    public float getHighRate() {
        return highRate;
    }

    /**
     * Define el valor de la propiedad highRate.
     * 
     */
    public void setHighRate(float value) {
        this.highRate = value;
    }

    /**
     * Obtiene el valor de la propiedad confidence.
     * 
     */
    public long getConfidence() {
        return confidence;
    }

    /**
     * Define el valor de la propiedad confidence.
     * 
     */
    public void setConfidence(long value) {
        this.confidence = value;
    }

    /**
     * Obtiene el valor de la propiedad hotelRating.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHotelRating() {
        return hotelRating;
    }

    /**
     * Define el valor de la propiedad hotelRating.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHotelRating(Float value) {
        this.hotelRating = value;
    }

    /**
     * Obtiene el valor de la propiedad tripAdvisorRating.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTripAdvisorRating() {
        return tripAdvisorRating;
    }

    /**
     * Define el valor de la propiedad tripAdvisorRating.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTripAdvisorRating(Float value) {
        this.tripAdvisorRating = value;
    }

    /**
     * Obtiene el valor de la propiedad market.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarket() {
        return market;
    }

    /**
     * Define el valor de la propiedad market.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarket(String value) {
        this.market = value;
    }

    /**
     * Obtiene el valor de la propiedad region.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Define el valor de la propiedad region.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Obtiene el valor de la propiedad superRegion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperRegion() {
        return superRegion;
    }

    /**
     * Define el valor de la propiedad superRegion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperRegion(String value) {
        this.superRegion = value;
    }

    /**
     * Obtiene el valor de la propiedad theme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheme() {
        return theme;
    }

    /**
     * Define el valor de la propiedad theme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheme(String value) {
        this.theme = value;
    }

}
