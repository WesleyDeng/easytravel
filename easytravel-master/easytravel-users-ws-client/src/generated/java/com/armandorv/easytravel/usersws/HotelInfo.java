
package com.armandorv.easytravel.usersws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para hotelInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="hotelInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="hotelRating" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="locationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lowRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hotelInfo", propOrder = {
    "city",
    "highRate",
    "hotelId",
    "hotelRating",
    "locationDescription",
    "lowRate",
    "name",
    "phoneNumber",
    "postalCode"
})
public class HotelInfo {

    protected String city;
    protected Float highRate;
    protected Long hotelId;
    protected Float hotelRating;
    protected String locationDescription;
    protected Float lowRate;
    protected String name;
    protected String phoneNumber;
    protected String postalCode;

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
     * Obtiene el valor de la propiedad highRate.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHighRate() {
        return highRate;
    }

    /**
     * Define el valor de la propiedad highRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHighRate(Float value) {
        this.highRate = value;
    }

    /**
     * Obtiene el valor de la propiedad hotelId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHotelId() {
        return hotelId;
    }

    /**
     * Define el valor de la propiedad hotelId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHotelId(Long value) {
        this.hotelId = value;
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
     * Obtiene el valor de la propiedad locationDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDescription() {
        return locationDescription;
    }

    /**
     * Define el valor de la propiedad locationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDescription(String value) {
        this.locationDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad lowRate.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLowRate() {
        return lowRate;
    }

    /**
     * Define el valor de la propiedad lowRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLowRate(Float value) {
        this.lowRate = value;
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
     * Obtiene el valor de la propiedad phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Define el valor de la propiedad phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
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

}
