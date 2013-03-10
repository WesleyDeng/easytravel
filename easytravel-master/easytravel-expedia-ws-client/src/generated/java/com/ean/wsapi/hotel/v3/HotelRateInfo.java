
package com.ean.wsapi.hotel.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HotelRateInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HotelRateInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomGroup" type="{http://v3.hotel.wsapi.ean.com/}RoomGroup" minOccurs="0"/>
 *         &lt;element name="ChargeableRateInfo" type="{http://v3.hotel.wsapi.ean.com/}baseRateInfo" minOccurs="0"/>
 *         &lt;element name="ConvertedRateInfo" type="{http://v3.hotel.wsapi.ean.com/}baseRateInfo" minOccurs="0"/>
 *         &lt;element name="confirmationNumbers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cancellationPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancelPolicyInfoList" type="{http://v3.hotel.wsapi.ean.com/}CancelPolicyInfoList" minOccurs="0"/>
 *         &lt;element name="nonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="online" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ratePlanType" type="{http://v3.hotel.wsapi.ean.com/}RatePlanType" minOccurs="0"/>
 *         &lt;element name="HotelFees" type="{http://v3.hotel.wsapi.ean.com/}HotelFees" minOccurs="0"/>
 *         &lt;element name="rateType" type="{http://v3.hotel.wsapi.ean.com/}RatePlanType" minOccurs="0"/>
 *         &lt;element name="promoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoDetailText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoType" type="{http://v3.hotel.wsapi.ean.com/}PromoType" minOccurs="0"/>
 *         &lt;element name="currentAllotment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="guaranteeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="depositRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="taxRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="priceBreakdown" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="promo" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="rateChange" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="pkgSavingsPercent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pkgSavingsAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRateInfo", propOrder = {
    "roomGroup",
    "chargeableRateInfo",
    "convertedRateInfo",
    "confirmationNumbers",
    "cancellationPolicy",
    "cancelPolicyInfoList",
    "nonRefundable",
    "online",
    "ratePlanType",
    "hotelFees",
    "rateType",
    "promoId",
    "promoDescription",
    "promoDetailText",
    "promoType",
    "currentAllotment",
    "guaranteeRequired",
    "depositRequired",
    "taxRate"
})
public class HotelRateInfo {

    @XmlElement(name = "RoomGroup")
    protected RoomGroup roomGroup;
    @XmlElement(name = "ChargeableRateInfo")
    protected BaseRateInfo chargeableRateInfo;
    @XmlElement(name = "ConvertedRateInfo")
    protected BaseRateInfo convertedRateInfo;
    protected List<String> confirmationNumbers;
    protected String cancellationPolicy;
    @XmlElement(name = "CancelPolicyInfoList")
    protected CancelPolicyInfoList cancelPolicyInfoList;
    protected Boolean nonRefundable;
    protected Boolean online;
    protected RatePlanType ratePlanType;
    @XmlElement(name = "HotelFees")
    protected HotelFees hotelFees;
    protected RatePlanType rateType;
    protected String promoId;
    protected String promoDescription;
    protected String promoDetailText;
    protected PromoType promoType;
    protected Integer currentAllotment;
    protected Boolean guaranteeRequired;
    protected Boolean depositRequired;
    protected String taxRate;
    @XmlAttribute(name = "priceBreakdown")
    protected Boolean priceBreakdown;
    @XmlAttribute(name = "promo")
    protected Boolean promo;
    @XmlAttribute(name = "rateChange")
    protected Boolean rateChange;
    @XmlAttribute(name = "pkgSavingsPercent")
    protected String pkgSavingsPercent;
    @XmlAttribute(name = "pkgSavingsAmount")
    protected String pkgSavingsAmount;

    /**
     * Obtiene el valor de la propiedad roomGroup.
     * 
     * @return
     *     possible object is
     *     {@link RoomGroup }
     *     
     */
    public RoomGroup getRoomGroup() {
        return roomGroup;
    }

    /**
     * Define el valor de la propiedad roomGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomGroup }
     *     
     */
    public void setRoomGroup(RoomGroup value) {
        this.roomGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad chargeableRateInfo.
     * 
     * @return
     *     possible object is
     *     {@link BaseRateInfo }
     *     
     */
    public BaseRateInfo getChargeableRateInfo() {
        return chargeableRateInfo;
    }

    /**
     * Define el valor de la propiedad chargeableRateInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRateInfo }
     *     
     */
    public void setChargeableRateInfo(BaseRateInfo value) {
        this.chargeableRateInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad convertedRateInfo.
     * 
     * @return
     *     possible object is
     *     {@link BaseRateInfo }
     *     
     */
    public BaseRateInfo getConvertedRateInfo() {
        return convertedRateInfo;
    }

    /**
     * Define el valor de la propiedad convertedRateInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRateInfo }
     *     
     */
    public void setConvertedRateInfo(BaseRateInfo value) {
        this.convertedRateInfo = value;
    }

    /**
     * Gets the value of the confirmationNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confirmationNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfirmationNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getConfirmationNumbers() {
        if (confirmationNumbers == null) {
            confirmationNumbers = new ArrayList<String>();
        }
        return this.confirmationNumbers;
    }

    /**
     * Obtiene el valor de la propiedad cancellationPolicy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationPolicy() {
        return cancellationPolicy;
    }

    /**
     * Define el valor de la propiedad cancellationPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationPolicy(String value) {
        this.cancellationPolicy = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelPolicyInfoList.
     * 
     * @return
     *     possible object is
     *     {@link CancelPolicyInfoList }
     *     
     */
    public CancelPolicyInfoList getCancelPolicyInfoList() {
        return cancelPolicyInfoList;
    }

    /**
     * Define el valor de la propiedad cancelPolicyInfoList.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPolicyInfoList }
     *     
     */
    public void setCancelPolicyInfoList(CancelPolicyInfoList value) {
        this.cancelPolicyInfoList = value;
    }

    /**
     * Obtiene el valor de la propiedad nonRefundable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonRefundable() {
        return nonRefundable;
    }

    /**
     * Define el valor de la propiedad nonRefundable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonRefundable(Boolean value) {
        this.nonRefundable = value;
    }

    /**
     * Obtiene el valor de la propiedad online.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnline() {
        return online;
    }

    /**
     * Define el valor de la propiedad online.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnline(Boolean value) {
        this.online = value;
    }

    /**
     * Obtiene el valor de la propiedad ratePlanType.
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType }
     *     
     */
    public RatePlanType getRatePlanType() {
        return ratePlanType;
    }

    /**
     * Define el valor de la propiedad ratePlanType.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType }
     *     
     */
    public void setRatePlanType(RatePlanType value) {
        this.ratePlanType = value;
    }

    /**
     * Obtiene el valor de la propiedad hotelFees.
     * 
     * @return
     *     possible object is
     *     {@link HotelFees }
     *     
     */
    public HotelFees getHotelFees() {
        return hotelFees;
    }

    /**
     * Define el valor de la propiedad hotelFees.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelFees }
     *     
     */
    public void setHotelFees(HotelFees value) {
        this.hotelFees = value;
    }

    /**
     * Obtiene el valor de la propiedad rateType.
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType }
     *     
     */
    public RatePlanType getRateType() {
        return rateType;
    }

    /**
     * Define el valor de la propiedad rateType.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType }
     *     
     */
    public void setRateType(RatePlanType value) {
        this.rateType = value;
    }

    /**
     * Obtiene el valor de la propiedad promoId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoId() {
        return promoId;
    }

    /**
     * Define el valor de la propiedad promoId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoId(String value) {
        this.promoId = value;
    }

    /**
     * Obtiene el valor de la propiedad promoDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoDescription() {
        return promoDescription;
    }

    /**
     * Define el valor de la propiedad promoDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoDescription(String value) {
        this.promoDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad promoDetailText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoDetailText() {
        return promoDetailText;
    }

    /**
     * Define el valor de la propiedad promoDetailText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoDetailText(String value) {
        this.promoDetailText = value;
    }

    /**
     * Obtiene el valor de la propiedad promoType.
     * 
     * @return
     *     possible object is
     *     {@link PromoType }
     *     
     */
    public PromoType getPromoType() {
        return promoType;
    }

    /**
     * Define el valor de la propiedad promoType.
     * 
     * @param value
     *     allowed object is
     *     {@link PromoType }
     *     
     */
    public void setPromoType(PromoType value) {
        this.promoType = value;
    }

    /**
     * Obtiene el valor de la propiedad currentAllotment.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentAllotment() {
        return currentAllotment;
    }

    /**
     * Define el valor de la propiedad currentAllotment.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentAllotment(Integer value) {
        this.currentAllotment = value;
    }

    /**
     * Obtiene el valor de la propiedad guaranteeRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteeRequired() {
        return guaranteeRequired;
    }

    /**
     * Define el valor de la propiedad guaranteeRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteeRequired(Boolean value) {
        this.guaranteeRequired = value;
    }

    /**
     * Obtiene el valor de la propiedad depositRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepositRequired() {
        return depositRequired;
    }

    /**
     * Define el valor de la propiedad depositRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepositRequired(Boolean value) {
        this.depositRequired = value;
    }

    /**
     * Obtiene el valor de la propiedad taxRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRate() {
        return taxRate;
    }

    /**
     * Define el valor de la propiedad taxRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRate(String value) {
        this.taxRate = value;
    }

    /**
     * Obtiene el valor de la propiedad priceBreakdown.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriceBreakdown() {
        return priceBreakdown;
    }

    /**
     * Define el valor de la propiedad priceBreakdown.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceBreakdown(Boolean value) {
        this.priceBreakdown = value;
    }

    /**
     * Obtiene el valor de la propiedad promo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromo() {
        return promo;
    }

    /**
     * Define el valor de la propiedad promo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromo(Boolean value) {
        this.promo = value;
    }

    /**
     * Obtiene el valor de la propiedad rateChange.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRateChange() {
        return rateChange;
    }

    /**
     * Define el valor de la propiedad rateChange.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRateChange(Boolean value) {
        this.rateChange = value;
    }

    /**
     * Obtiene el valor de la propiedad pkgSavingsPercent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkgSavingsPercent() {
        return pkgSavingsPercent;
    }

    /**
     * Define el valor de la propiedad pkgSavingsPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkgSavingsPercent(String value) {
        this.pkgSavingsPercent = value;
    }

    /**
     * Obtiene el valor de la propiedad pkgSavingsAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkgSavingsAmount() {
        return pkgSavingsAmount;
    }

    /**
     * Define el valor de la propiedad pkgSavingsAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkgSavingsAmount(String value) {
        this.pkgSavingsAmount = value;
    }

}
