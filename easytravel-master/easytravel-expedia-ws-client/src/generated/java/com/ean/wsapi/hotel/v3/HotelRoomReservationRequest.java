
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HotelRoomReservationRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HotelRoomReservationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}HotelBaseRequest">
 *       &lt;sequence>
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="supplierType" type="{http://v3.hotel.wsapi.ean.com/}SupplierType"/>
 *         &lt;element name="rateKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="roomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="roomDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sendReservationEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="frequentGuestNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="affiliateConfirmationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="affiliateCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itineraryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="chargeableRate" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="specialInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomGroup" type="{http://v3.hotel.wsapi.ean.com/}RoomGroup"/>
 *         &lt;element name="rateType" type="{http://v3.hotel.wsapi.ean.com/}RatePlanType" minOccurs="0"/>
 *         &lt;element name="ReservationInfo" type="{http://v3.hotel.wsapi.ean.com/}reservationInfo"/>
 *         &lt;element name="AddressInfo" type="{http://v3.hotel.wsapi.ean.com/}addressInfo"/>
 *         &lt;element name="CouponData" type="{http://v3.hotel.wsapi.ean.com/}CouponData" minOccurs="0"/>
 *         &lt;element name="MultiRoomRes" type="{http://v3.hotel.wsapi.ean.com/}MultiRoomResType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRoomReservationRequest", propOrder = {
    "hotelId",
    "arrivalDate",
    "departureDate",
    "supplierType",
    "rateKey",
    "roomTypeCode",
    "roomDescription",
    "rateCode",
    "sendReservationEmail",
    "frequentGuestNumber",
    "affiliateConfirmationId",
    "affiliateCustomerId",
    "itineraryId",
    "chargeableRate",
    "specialInformation",
    "roomGroup",
    "rateType",
    "reservationInfo",
    "addressInfo",
    "couponData",
    "multiRoomRes"
})
public class HotelRoomReservationRequest
    extends HotelBaseRequest
{

    protected long hotelId;
    @XmlElement(required = true)
    protected String arrivalDate;
    @XmlElement(required = true)
    protected String departureDate;
    @XmlElement(required = true)
    protected SupplierType supplierType;
    @XmlElement(required = true)
    protected String rateKey;
    @XmlElement(required = true)
    protected String roomTypeCode;
    protected String roomDescription;
    @XmlElement(required = true)
    protected String rateCode;
    protected boolean sendReservationEmail;
    protected String frequentGuestNumber;
    protected String affiliateConfirmationId;
    protected String affiliateCustomerId;
    protected Long itineraryId;
    protected float chargeableRate;
    protected String specialInformation;
    @XmlElement(name = "RoomGroup", required = true)
    protected RoomGroup roomGroup;
    protected RatePlanType rateType;
    @XmlElement(name = "ReservationInfo", required = true)
    protected ReservationInfo reservationInfo;
    @XmlElement(name = "AddressInfo", required = true)
    protected AddressInfo addressInfo;
    @XmlElement(name = "CouponData")
    protected CouponData couponData;
    @XmlElement(name = "MultiRoomRes")
    protected MultiRoomResType multiRoomRes;

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
     * Obtiene el valor de la propiedad arrivalDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Define el valor de la propiedad arrivalDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalDate(String value) {
        this.arrivalDate = value;
    }

    /**
     * Obtiene el valor de la propiedad departureDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * Define el valor de la propiedad departureDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDate(String value) {
        this.departureDate = value;
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
     * Obtiene el valor de la propiedad roomDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomDescription() {
        return roomDescription;
    }

    /**
     * Define el valor de la propiedad roomDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomDescription(String value) {
        this.roomDescription = value;
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
     * Obtiene el valor de la propiedad sendReservationEmail.
     * 
     */
    public boolean isSendReservationEmail() {
        return sendReservationEmail;
    }

    /**
     * Define el valor de la propiedad sendReservationEmail.
     * 
     */
    public void setSendReservationEmail(boolean value) {
        this.sendReservationEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad frequentGuestNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequentGuestNumber() {
        return frequentGuestNumber;
    }

    /**
     * Define el valor de la propiedad frequentGuestNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequentGuestNumber(String value) {
        this.frequentGuestNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad affiliateConfirmationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliateConfirmationId() {
        return affiliateConfirmationId;
    }

    /**
     * Define el valor de la propiedad affiliateConfirmationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliateConfirmationId(String value) {
        this.affiliateConfirmationId = value;
    }

    /**
     * Obtiene el valor de la propiedad affiliateCustomerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliateCustomerId() {
        return affiliateCustomerId;
    }

    /**
     * Define el valor de la propiedad affiliateCustomerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliateCustomerId(String value) {
        this.affiliateCustomerId = value;
    }

    /**
     * Obtiene el valor de la propiedad itineraryId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItineraryId() {
        return itineraryId;
    }

    /**
     * Define el valor de la propiedad itineraryId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItineraryId(Long value) {
        this.itineraryId = value;
    }

    /**
     * Obtiene el valor de la propiedad chargeableRate.
     * 
     */
    public float getChargeableRate() {
        return chargeableRate;
    }

    /**
     * Define el valor de la propiedad chargeableRate.
     * 
     */
    public void setChargeableRate(float value) {
        this.chargeableRate = value;
    }

    /**
     * Obtiene el valor de la propiedad specialInformation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialInformation() {
        return specialInformation;
    }

    /**
     * Define el valor de la propiedad specialInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialInformation(String value) {
        this.specialInformation = value;
    }

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
     * Obtiene el valor de la propiedad reservationInfo.
     * 
     * @return
     *     possible object is
     *     {@link ReservationInfo }
     *     
     */
    public ReservationInfo getReservationInfo() {
        return reservationInfo;
    }

    /**
     * Define el valor de la propiedad reservationInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationInfo }
     *     
     */
    public void setReservationInfo(ReservationInfo value) {
        this.reservationInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad addressInfo.
     * 
     * @return
     *     possible object is
     *     {@link AddressInfo }
     *     
     */
    public AddressInfo getAddressInfo() {
        return addressInfo;
    }

    /**
     * Define el valor de la propiedad addressInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInfo }
     *     
     */
    public void setAddressInfo(AddressInfo value) {
        this.addressInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad couponData.
     * 
     * @return
     *     possible object is
     *     {@link CouponData }
     *     
     */
    public CouponData getCouponData() {
        return couponData;
    }

    /**
     * Define el valor de la propiedad couponData.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponData }
     *     
     */
    public void setCouponData(CouponData value) {
        this.couponData = value;
    }

    /**
     * Obtiene el valor de la propiedad multiRoomRes.
     * 
     * @return
     *     possible object is
     *     {@link MultiRoomResType }
     *     
     */
    public MultiRoomResType getMultiRoomRes() {
        return multiRoomRes;
    }

    /**
     * Define el valor de la propiedad multiRoomRes.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiRoomResType }
     *     
     */
    public void setMultiRoomRes(MultiRoomResType value) {
        this.multiRoomRes = value;
    }

}
