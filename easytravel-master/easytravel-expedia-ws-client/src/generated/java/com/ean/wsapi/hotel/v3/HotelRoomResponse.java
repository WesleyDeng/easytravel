
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HotelRoomResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HotelRoomResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cancellationPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomType" type="{http://v3.hotel.wsapi.ean.com/}RoomType" minOccurs="0"/>
 *         &lt;element name="supplierType" type="{http://v3.hotel.wsapi.ean.com/}SupplierType" minOccurs="0"/>
 *         &lt;element name="taxRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="guaranteeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="depositRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="immediateChargeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentAllotment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="propertyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoDetailText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BedTypes" type="{http://v3.hotel.wsapi.ean.com/}BedTypes" minOccurs="0"/>
 *         &lt;element name="CancelPolicyInfoList" type="{http://v3.hotel.wsapi.ean.com/}CancelPolicyInfoList" minOccurs="0"/>
 *         &lt;element name="smokingPreferences" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateOccupancyPerRoom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="quotedOccupancy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minGuestAge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RateInfo" type="{http://v3.hotel.wsapi.ean.com/}HotelRateInfo" minOccurs="0"/>
 *         &lt;element name="RateInfos" type="{http://v3.hotel.wsapi.ean.com/}RateInfos" minOccurs="0"/>
 *         &lt;element name="ValueAdds" type="{http://v3.hotel.wsapi.ean.com/}ValueAdds" minOccurs="0"/>
 *         &lt;element name="deepLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomImages" type="{http://v3.hotel.wsapi.ean.com/}RoomImages" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRoomResponse", propOrder = {
    "cancellationPolicy",
    "policy",
    "rateCode",
    "rateKey",
    "roomTypeCode",
    "rateDescription",
    "roomTypeDescription",
    "roomType",
    "supplierType",
    "taxRate",
    "otherInformation",
    "rateChange",
    "nonRefundable",
    "guaranteeRequired",
    "depositRequired",
    "immediateChargeRequired",
    "rateType",
    "currentAllotment",
    "propertyId",
    "promoId",
    "promoDescription",
    "promoType",
    "promoDetailText",
    "bedTypes",
    "cancelPolicyInfoList",
    "smokingPreferences",
    "rateOccupancyPerRoom",
    "quotedOccupancy",
    "minGuestAge",
    "rateInfo",
    "rateInfos",
    "valueAdds",
    "deepLink",
    "roomImages"
})
public class HotelRoomResponse {

    protected String cancellationPolicy;
    protected String policy;
    protected String rateCode;
    protected String rateKey;
    protected String roomTypeCode;
    protected String rateDescription;
    protected String roomTypeDescription;
    @XmlElement(name = "RoomType")
    protected RoomType roomType;
    protected SupplierType supplierType;
    protected String taxRate;
    protected String otherInformation;
    protected Boolean rateChange;
    protected Boolean nonRefundable;
    protected Boolean guaranteeRequired;
    protected Boolean depositRequired;
    protected Boolean immediateChargeRequired;
    protected String rateType;
    protected Integer currentAllotment;
    protected String propertyId;
    protected String promoId;
    protected String promoDescription;
    protected String promoType;
    protected String promoDetailText;
    @XmlElement(name = "BedTypes")
    protected BedTypes bedTypes;
    @XmlElement(name = "CancelPolicyInfoList")
    protected CancelPolicyInfoList cancelPolicyInfoList;
    protected String smokingPreferences;
    protected int rateOccupancyPerRoom;
    protected int quotedOccupancy;
    protected int minGuestAge;
    @XmlElement(name = "RateInfo")
    protected HotelRateInfo rateInfo;
    @XmlElement(name = "RateInfos")
    protected RateInfos rateInfos;
    @XmlElement(name = "ValueAdds")
    protected ValueAdds valueAdds;
    protected String deepLink;
    @XmlElement(name = "RoomImages")
    protected RoomImages roomImages;

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
     * Obtiene el valor de la propiedad policy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * Define el valor de la propiedad policy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicy(String value) {
        this.policy = value;
    }

    /**
     * Obtiene el valor de la propiedad rateCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Define el valor de la propiedad rateCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * Obtiene el valor de la propiedad rateKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateKey() {
        return rateKey;
    }

    /**
     * Define el valor de la propiedad rateKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateKey(String value) {
        this.rateKey = value;
    }

    /**
     * Obtiene el valor de la propiedad roomTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    /**
     * Define el valor de la propiedad roomTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeCode(String value) {
        this.roomTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad rateDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateDescription() {
        return rateDescription;
    }

    /**
     * Define el valor de la propiedad rateDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateDescription(String value) {
        this.rateDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad roomTypeDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeDescription() {
        return roomTypeDescription;
    }

    /**
     * Define el valor de la propiedad roomTypeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeDescription(String value) {
        this.roomTypeDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad roomType.
     * 
     * @return
     *     possible object is
     *     {@link RoomType }
     *     
     */
    public RoomType getRoomType() {
        return roomType;
    }

    /**
     * Define el valor de la propiedad roomType.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomType }
     *     
     */
    public void setRoomType(RoomType value) {
        this.roomType = value;
    }

    /**
     * Obtiene el valor de la propiedad supplierType.
     * 
     * @return
     *     possible object is
     *     {@link SupplierType }
     *     
     */
    public SupplierType getSupplierType() {
        return supplierType;
    }

    /**
     * Define el valor de la propiedad supplierType.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierType }
     *     
     */
    public void setSupplierType(SupplierType value) {
        this.supplierType = value;
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
     * Obtiene el valor de la propiedad otherInformation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherInformation() {
        return otherInformation;
    }

    /**
     * Define el valor de la propiedad otherInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherInformation(String value) {
        this.otherInformation = value;
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
     * Obtiene el valor de la propiedad immediateChargeRequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImmediateChargeRequired() {
        return immediateChargeRequired;
    }

    /**
     * Define el valor de la propiedad immediateChargeRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImmediateChargeRequired(Boolean value) {
        this.immediateChargeRequired = value;
    }

    /**
     * Obtiene el valor de la propiedad rateType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateType() {
        return rateType;
    }

    /**
     * Define el valor de la propiedad rateType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateType(String value) {
        this.rateType = value;
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
     * Obtiene el valor de la propiedad propertyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyId() {
        return propertyId;
    }

    /**
     * Define el valor de la propiedad propertyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyId(String value) {
        this.propertyId = value;
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
     * Obtiene el valor de la propiedad promoType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoType() {
        return promoType;
    }

    /**
     * Define el valor de la propiedad promoType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoType(String value) {
        this.promoType = value;
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
     * Obtiene el valor de la propiedad bedTypes.
     * 
     * @return
     *     possible object is
     *     {@link BedTypes }
     *     
     */
    public BedTypes getBedTypes() {
        return bedTypes;
    }

    /**
     * Define el valor de la propiedad bedTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link BedTypes }
     *     
     */
    public void setBedTypes(BedTypes value) {
        this.bedTypes = value;
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
     * Obtiene el valor de la propiedad smokingPreferences.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmokingPreferences() {
        return smokingPreferences;
    }

    /**
     * Define el valor de la propiedad smokingPreferences.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmokingPreferences(String value) {
        this.smokingPreferences = value;
    }

    /**
     * Obtiene el valor de la propiedad rateOccupancyPerRoom.
     * 
     */
    public int getRateOccupancyPerRoom() {
        return rateOccupancyPerRoom;
    }

    /**
     * Define el valor de la propiedad rateOccupancyPerRoom.
     * 
     */
    public void setRateOccupancyPerRoom(int value) {
        this.rateOccupancyPerRoom = value;
    }

    /**
     * Obtiene el valor de la propiedad quotedOccupancy.
     * 
     */
    public int getQuotedOccupancy() {
        return quotedOccupancy;
    }

    /**
     * Define el valor de la propiedad quotedOccupancy.
     * 
     */
    public void setQuotedOccupancy(int value) {
        this.quotedOccupancy = value;
    }

    /**
     * Obtiene el valor de la propiedad minGuestAge.
     * 
     */
    public int getMinGuestAge() {
        return minGuestAge;
    }

    /**
     * Define el valor de la propiedad minGuestAge.
     * 
     */
    public void setMinGuestAge(int value) {
        this.minGuestAge = value;
    }

    /**
     * Obtiene el valor de la propiedad rateInfo.
     * 
     * @return
     *     possible object is
     *     {@link HotelRateInfo }
     *     
     */
    public HotelRateInfo getRateInfo() {
        return rateInfo;
    }

    /**
     * Define el valor de la propiedad rateInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRateInfo }
     *     
     */
    public void setRateInfo(HotelRateInfo value) {
        this.rateInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad rateInfos.
     * 
     * @return
     *     possible object is
     *     {@link RateInfos }
     *     
     */
    public RateInfos getRateInfos() {
        return rateInfos;
    }

    /**
     * Define el valor de la propiedad rateInfos.
     * 
     * @param value
     *     allowed object is
     *     {@link RateInfos }
     *     
     */
    public void setRateInfos(RateInfos value) {
        this.rateInfos = value;
    }

    /**
     * Obtiene el valor de la propiedad valueAdds.
     * 
     * @return
     *     possible object is
     *     {@link ValueAdds }
     *     
     */
    public ValueAdds getValueAdds() {
        return valueAdds;
    }

    /**
     * Define el valor de la propiedad valueAdds.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueAdds }
     *     
     */
    public void setValueAdds(ValueAdds value) {
        this.valueAdds = value;
    }

    /**
     * Obtiene el valor de la propiedad deepLink.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeepLink() {
        return deepLink;
    }

    /**
     * Define el valor de la propiedad deepLink.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeepLink(String value) {
        this.deepLink = value;
    }

    /**
     * Obtiene el valor de la propiedad roomImages.
     * 
     * @return
     *     possible object is
     *     {@link RoomImages }
     *     
     */
    public RoomImages getRoomImages() {
        return roomImages;
    }

    /**
     * Define el valor de la propiedad roomImages.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomImages }
     *     
     */
    public void setRoomImages(RoomImages value) {
        this.roomImages = value;
    }

}
