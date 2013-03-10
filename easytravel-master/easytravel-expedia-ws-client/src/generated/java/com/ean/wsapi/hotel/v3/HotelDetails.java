
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HotelDetails complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HotelDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nativeCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfRooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberOfFloors" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="checkInTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkOutTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extraPersonCharge" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="propertyInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="areaInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propertyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guaranteePolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depositPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guaranteeCreditCardsAccepted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depositCreditCardsAccepted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="drivingDirections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkInInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelDetails", propOrder = {
    "nativeCurrencyCode",
    "numberOfRooms",
    "numberOfFloors",
    "checkInTime",
    "checkOutTime",
    "extraPersonCharge",
    "propertyInformation",
    "areaInformation",
    "propertyDescription",
    "hotelPolicy",
    "guaranteePolicy",
    "depositPolicy",
    "guaranteeCreditCardsAccepted",
    "depositCreditCardsAccepted",
    "roomInformation",
    "drivingDirections",
    "checkInInstructions"
})
public class HotelDetails {

    protected String nativeCurrencyCode;
    protected Integer numberOfRooms;
    protected Integer numberOfFloors;
    protected String checkInTime;
    protected String checkOutTime;
    protected Float extraPersonCharge;
    protected String propertyInformation;
    protected String areaInformation;
    protected String propertyDescription;
    protected String hotelPolicy;
    protected String guaranteePolicy;
    protected String depositPolicy;
    protected String guaranteeCreditCardsAccepted;
    protected String depositCreditCardsAccepted;
    protected String roomInformation;
    protected String drivingDirections;
    protected String checkInInstructions;

    /**
     * Obtiene el valor de la propiedad nativeCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeCurrencyCode() {
        return nativeCurrencyCode;
    }

    /**
     * Define el valor de la propiedad nativeCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeCurrencyCode(String value) {
        this.nativeCurrencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfRooms.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * Define el valor de la propiedad numberOfRooms.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRooms(Integer value) {
        this.numberOfRooms = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfFloors.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    /**
     * Define el valor de la propiedad numberOfFloors.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfFloors(Integer value) {
        this.numberOfFloors = value;
    }

    /**
     * Obtiene el valor de la propiedad checkInTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckInTime() {
        return checkInTime;
    }

    /**
     * Define el valor de la propiedad checkInTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckInTime(String value) {
        this.checkInTime = value;
    }

    /**
     * Obtiene el valor de la propiedad checkOutTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckOutTime() {
        return checkOutTime;
    }

    /**
     * Define el valor de la propiedad checkOutTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckOutTime(String value) {
        this.checkOutTime = value;
    }

    /**
     * Obtiene el valor de la propiedad extraPersonCharge.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getExtraPersonCharge() {
        return extraPersonCharge;
    }

    /**
     * Define el valor de la propiedad extraPersonCharge.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setExtraPersonCharge(Float value) {
        this.extraPersonCharge = value;
    }

    /**
     * Obtiene el valor de la propiedad propertyInformation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyInformation() {
        return propertyInformation;
    }

    /**
     * Define el valor de la propiedad propertyInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyInformation(String value) {
        this.propertyInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad areaInformation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaInformation() {
        return areaInformation;
    }

    /**
     * Define el valor de la propiedad areaInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaInformation(String value) {
        this.areaInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad propertyDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyDescription() {
        return propertyDescription;
    }

    /**
     * Define el valor de la propiedad propertyDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyDescription(String value) {
        this.propertyDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad hotelPolicy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelPolicy() {
        return hotelPolicy;
    }

    /**
     * Define el valor de la propiedad hotelPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelPolicy(String value) {
        this.hotelPolicy = value;
    }

    /**
     * Obtiene el valor de la propiedad guaranteePolicy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteePolicy() {
        return guaranteePolicy;
    }

    /**
     * Define el valor de la propiedad guaranteePolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteePolicy(String value) {
        this.guaranteePolicy = value;
    }

    /**
     * Obtiene el valor de la propiedad depositPolicy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositPolicy() {
        return depositPolicy;
    }

    /**
     * Define el valor de la propiedad depositPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositPolicy(String value) {
        this.depositPolicy = value;
    }

    /**
     * Obtiene el valor de la propiedad guaranteeCreditCardsAccepted.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeCreditCardsAccepted() {
        return guaranteeCreditCardsAccepted;
    }

    /**
     * Define el valor de la propiedad guaranteeCreditCardsAccepted.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeCreditCardsAccepted(String value) {
        this.guaranteeCreditCardsAccepted = value;
    }

    /**
     * Obtiene el valor de la propiedad depositCreditCardsAccepted.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositCreditCardsAccepted() {
        return depositCreditCardsAccepted;
    }

    /**
     * Define el valor de la propiedad depositCreditCardsAccepted.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositCreditCardsAccepted(String value) {
        this.depositCreditCardsAccepted = value;
    }

    /**
     * Obtiene el valor de la propiedad roomInformation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomInformation() {
        return roomInformation;
    }

    /**
     * Define el valor de la propiedad roomInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomInformation(String value) {
        this.roomInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad drivingDirections.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrivingDirections() {
        return drivingDirections;
    }

    /**
     * Define el valor de la propiedad drivingDirections.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrivingDirections(String value) {
        this.drivingDirections = value;
    }

    /**
     * Obtiene el valor de la propiedad checkInInstructions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckInInstructions() {
        return checkInInstructions;
    }

    /**
     * Define el valor de la propiedad checkInInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckInInstructions(String value) {
        this.checkInInstructions = value;
    }

}
