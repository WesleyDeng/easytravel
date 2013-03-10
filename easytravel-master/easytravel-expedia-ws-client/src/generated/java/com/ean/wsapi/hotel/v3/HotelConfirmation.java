
package com.ean.wsapi.hotel.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HotelConfirmation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HotelConfirmation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="supplierId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="chainCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancellationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RateInfo" type="{http://v3.hotel.wsapi.ean.com/}HotelRateInfo" minOccurs="0"/>
 *         &lt;element name="RateInfos" type="{http://v3.hotel.wsapi.ean.com/}RateInfos" minOccurs="0"/>
 *         &lt;element name="numberOfAdults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfChildren" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cancellationPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="affiliateConfirmationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smokingPreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplierPropertyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CouponInformation" type="{http://v3.hotel.wsapi.ean.com/}CouponInformation" minOccurs="0"/>
 *         &lt;element name="ReservationGuest" type="{http://v3.hotel.wsapi.ean.com/}ReservationGuest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Hotel" type="{http://v3.hotel.wsapi.ean.com/}Hotel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConfirmationExtras" type="{http://v3.hotel.wsapi.ean.com/}ConfirmationExtras" minOccurs="0"/>
 *         &lt;element name="nights" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelConfirmation", propOrder = {
    "supplierId",
    "chainCode",
    "creditCardType",
    "arrivalDate",
    "departureDate",
    "confirmationNumber",
    "cancellationNumber",
    "rateInfo",
    "rateInfos",
    "numberOfAdults",
    "numberOfChildren",
    "cancellationPolicy",
    "affiliateConfirmationId",
    "smokingPreference",
    "supplierPropertyId",
    "roomTypeCode",
    "roomType",
    "rateCode",
    "rateType",
    "rateDescription",
    "roomDescription",
    "status",
    "nonRefundable",
    "locale",
    "couponInformation",
    "reservationGuest",
    "hotel",
    "confirmationExtras",
    "nights"
})
public class HotelConfirmation {

    protected long supplierId;
    protected String chainCode;
    protected String creditCardType;
    protected String arrivalDate;
    protected String departureDate;
    protected String confirmationNumber;
    protected String cancellationNumber;
    @XmlElement(name = "RateInfo")
    protected HotelRateInfo rateInfo;
    @XmlElement(name = "RateInfos")
    protected RateInfos rateInfos;
    protected int numberOfAdults;
    protected int numberOfChildren;
    protected String cancellationPolicy;
    protected String affiliateConfirmationId;
    protected String smokingPreference;
    protected String supplierPropertyId;
    protected String roomTypeCode;
    protected String roomType;
    protected String rateCode;
    protected String rateType;
    protected String rateDescription;
    protected String roomDescription;
    protected String status;
    protected Boolean nonRefundable;
    protected String locale;
    @XmlElement(name = "CouponInformation")
    protected CouponInformation couponInformation;
    @XmlElement(name = "ReservationGuest")
    protected List<ReservationGuest> reservationGuest;
    @XmlElement(name = "Hotel")
    protected List<Hotel> hotel;
    @XmlElement(name = "ConfirmationExtras")
    protected ConfirmationExtras confirmationExtras;
    protected Integer nights;

    /**
     * Obtiene el valor de la propiedad supplierId.
     * 
     */
    public long getSupplierId() {
        return supplierId;
    }

    /**
     * Define el valor de la propiedad supplierId.
     * 
     */
    public void setSupplierId(long value) {
        this.supplierId = value;
    }

    /**
     * Obtiene el valor de la propiedad chainCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainCode() {
        return chainCode;
    }

    /**
     * Define el valor de la propiedad chainCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainCode(String value) {
        this.chainCode = value;
    }

    /**
     * Obtiene el valor de la propiedad creditCardType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardType() {
        return creditCardType;
    }

    /**
     * Define el valor de la propiedad creditCardType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardType(String value) {
        this.creditCardType = value;
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
     * Obtiene el valor de la propiedad confirmationNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Define el valor de la propiedad confirmationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationNumber(String value) {
        this.confirmationNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad cancellationNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationNumber() {
        return cancellationNumber;
    }

    /**
     * Define el valor de la propiedad cancellationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationNumber(String value) {
        this.cancellationNumber = value;
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
     * Obtiene el valor de la propiedad numberOfAdults.
     * 
     */
    public int getNumberOfAdults() {
        return numberOfAdults;
    }

    /**
     * Define el valor de la propiedad numberOfAdults.
     * 
     */
    public void setNumberOfAdults(int value) {
        this.numberOfAdults = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfChildren.
     * 
     */
    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    /**
     * Define el valor de la propiedad numberOfChildren.
     * 
     */
    public void setNumberOfChildren(int value) {
        this.numberOfChildren = value;
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
     * Obtiene el valor de la propiedad smokingPreference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmokingPreference() {
        return smokingPreference;
    }

    /**
     * Define el valor de la propiedad smokingPreference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmokingPreference(String value) {
        this.smokingPreference = value;
    }

    /**
     * Obtiene el valor de la propiedad supplierPropertyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierPropertyId() {
        return supplierPropertyId;
    }

    /**
     * Define el valor de la propiedad supplierPropertyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierPropertyId(String value) {
        this.supplierPropertyId = value;
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
     * Obtiene el valor de la propiedad roomType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * Define el valor de la propiedad roomType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomType(String value) {
        this.roomType = value;
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
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     * Obtiene el valor de la propiedad locale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Define el valor de la propiedad locale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Obtiene el valor de la propiedad couponInformation.
     * 
     * @return
     *     possible object is
     *     {@link CouponInformation }
     *     
     */
    public CouponInformation getCouponInformation() {
        return couponInformation;
    }

    /**
     * Define el valor de la propiedad couponInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponInformation }
     *     
     */
    public void setCouponInformation(CouponInformation value) {
        this.couponInformation = value;
    }

    /**
     * Gets the value of the reservationGuest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservationGuest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservationGuest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationGuest }
     * 
     * 
     */
    public List<ReservationGuest> getReservationGuest() {
        if (reservationGuest == null) {
            reservationGuest = new ArrayList<ReservationGuest>();
        }
        return this.reservationGuest;
    }

    /**
     * Gets the value of the hotel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hotel }
     * 
     * 
     */
    public List<Hotel> getHotel() {
        if (hotel == null) {
            hotel = new ArrayList<Hotel>();
        }
        return this.hotel;
    }

    /**
     * Obtiene el valor de la propiedad confirmationExtras.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationExtras }
     *     
     */
    public ConfirmationExtras getConfirmationExtras() {
        return confirmationExtras;
    }

    /**
     * Define el valor de la propiedad confirmationExtras.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationExtras }
     *     
     */
    public void setConfirmationExtras(ConfirmationExtras value) {
        this.confirmationExtras = value;
    }

    /**
     * Obtiene el valor de la propiedad nights.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNights() {
        return nights;
    }

    /**
     * Define el valor de la propiedad nights.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNights(Integer value) {
        this.nights = value;
    }

}
