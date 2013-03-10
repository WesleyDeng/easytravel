
package com.ean.wsapi.hotel.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HotelRoomReservationResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HotelRoomReservationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="itineraryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="confirmationNumbers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RateInfo" type="{http://v3.hotel.wsapi.ean.com/}HotelRateInfo" minOccurs="0"/>
 *         &lt;element name="processedWithConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="errorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelReplyText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplierType" type="{http://v3.hotel.wsapi.ean.com/}SupplierType" minOccurs="0"/>
 *         &lt;element name="reservationStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="existingItinerary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="numberOfRoomsBooked" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RoomGroup" type="{http://v3.hotel.wsapi.ean.com/}RoomGroup" minOccurs="0"/>
 *         &lt;element name="drivingDirections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkInInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelStateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tripAdvisorRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tripAdvisorReviewCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tripAdvisorRatingUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancellationPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancelPolicyInfoList" type="{http://v3.hotel.wsapi.ean.com/}CancelPolicyInfoList" minOccurs="0"/>
 *         &lt;element name="nonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rateOccupancyPerRoom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CouponInformationResponse" type="{http://v3.hotel.wsapi.ean.com/}CouponInformationResponse" minOccurs="0"/>
 *         &lt;element name="RateInfos" type="{http://v3.hotel.wsapi.ean.com/}RateInfos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRoomReservationResponse", propOrder = {
    "itineraryId",
    "confirmationNumbers",
    "rateInfo",
    "processedWithConfirmation",
    "errorText",
    "hotelReplyText",
    "supplierType",
    "reservationStatusCode",
    "existingItinerary",
    "numberOfRoomsBooked",
    "roomGroup",
    "drivingDirections",
    "checkInInstructions",
    "arrivalDate",
    "departureDate",
    "hotelName",
    "hotelAddress",
    "hotelCity",
    "hotelStateProvinceCode",
    "hotelPostalCode",
    "hotelCountryCode",
    "roomDescription",
    "tripAdvisorRating",
    "tripAdvisorReviewCount",
    "tripAdvisorRatingUrl",
    "cancellationPolicy",
    "cancelPolicyInfoList",
    "nonRefundable",
    "rateOccupancyPerRoom",
    "couponInformationResponse",
    "rateInfos"
})
public class HotelRoomReservationResponse
    extends BaseResponse
{

    protected Long itineraryId;
    protected List<String> confirmationNumbers;
    @XmlElement(name = "RateInfo")
    protected HotelRateInfo rateInfo;
    protected Boolean processedWithConfirmation;
    protected String errorText;
    protected String hotelReplyText;
    protected SupplierType supplierType;
    protected String reservationStatusCode;
    protected Boolean existingItinerary;
    protected Integer numberOfRoomsBooked;
    @XmlElement(name = "RoomGroup")
    protected RoomGroup roomGroup;
    protected String drivingDirections;
    protected String checkInInstructions;
    protected String arrivalDate;
    protected String departureDate;
    protected String hotelName;
    protected String hotelAddress;
    protected String hotelCity;
    protected String hotelStateProvinceCode;
    protected String hotelPostalCode;
    protected String hotelCountryCode;
    protected String roomDescription;
    protected String tripAdvisorRating;
    protected Integer tripAdvisorReviewCount;
    protected String tripAdvisorRatingUrl;
    protected String cancellationPolicy;
    @XmlElement(name = "CancelPolicyInfoList")
    protected CancelPolicyInfoList cancelPolicyInfoList;
    protected Boolean nonRefundable;
    protected Integer rateOccupancyPerRoom;
    @XmlElement(name = "CouponInformationResponse")
    protected CouponInformationResponse couponInformationResponse;
    @XmlElement(name = "RateInfos")
    protected RateInfos rateInfos;

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
     * Obtiene el valor de la propiedad processedWithConfirmation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessedWithConfirmation() {
        return processedWithConfirmation;
    }

    /**
     * Define el valor de la propiedad processedWithConfirmation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessedWithConfirmation(Boolean value) {
        this.processedWithConfirmation = value;
    }

    /**
     * Obtiene el valor de la propiedad errorText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * Define el valor de la propiedad errorText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorText(String value) {
        this.errorText = value;
    }

    /**
     * Obtiene el valor de la propiedad hotelReplyText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelReplyText() {
        return hotelReplyText;
    }

    /**
     * Define el valor de la propiedad hotelReplyText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelReplyText(String value) {
        this.hotelReplyText = value;
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
     * Obtiene el valor de la propiedad reservationStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationStatusCode() {
        return reservationStatusCode;
    }

    /**
     * Define el valor de la propiedad reservationStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationStatusCode(String value) {
        this.reservationStatusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad existingItinerary.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExistingItinerary() {
        return existingItinerary;
    }

    /**
     * Define el valor de la propiedad existingItinerary.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExistingItinerary(Boolean value) {
        this.existingItinerary = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfRoomsBooked.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRoomsBooked() {
        return numberOfRoomsBooked;
    }

    /**
     * Define el valor de la propiedad numberOfRoomsBooked.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRoomsBooked(Integer value) {
        this.numberOfRoomsBooked = value;
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
     * Obtiene el valor de la propiedad hotelName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * Define el valor de la propiedad hotelName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * Obtiene el valor de la propiedad hotelAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelAddress() {
        return hotelAddress;
    }

    /**
     * Define el valor de la propiedad hotelAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelAddress(String value) {
        this.hotelAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad hotelCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCity() {
        return hotelCity;
    }

    /**
     * Define el valor de la propiedad hotelCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCity(String value) {
        this.hotelCity = value;
    }

    /**
     * Obtiene el valor de la propiedad hotelStateProvinceCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelStateProvinceCode() {
        return hotelStateProvinceCode;
    }

    /**
     * Define el valor de la propiedad hotelStateProvinceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelStateProvinceCode(String value) {
        this.hotelStateProvinceCode = value;
    }

    /**
     * Obtiene el valor de la propiedad hotelPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelPostalCode() {
        return hotelPostalCode;
    }

    /**
     * Define el valor de la propiedad hotelPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelPostalCode(String value) {
        this.hotelPostalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad hotelCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCountryCode() {
        return hotelCountryCode;
    }

    /**
     * Define el valor de la propiedad hotelCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCountryCode(String value) {
        this.hotelCountryCode = value;
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
     * Obtiene el valor de la propiedad tripAdvisorRating.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripAdvisorRating() {
        return tripAdvisorRating;
    }

    /**
     * Define el valor de la propiedad tripAdvisorRating.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripAdvisorRating(String value) {
        this.tripAdvisorRating = value;
    }

    /**
     * Obtiene el valor de la propiedad tripAdvisorReviewCount.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTripAdvisorReviewCount() {
        return tripAdvisorReviewCount;
    }

    /**
     * Define el valor de la propiedad tripAdvisorReviewCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTripAdvisorReviewCount(Integer value) {
        this.tripAdvisorReviewCount = value;
    }

    /**
     * Obtiene el valor de la propiedad tripAdvisorRatingUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripAdvisorRatingUrl() {
        return tripAdvisorRatingUrl;
    }

    /**
     * Define el valor de la propiedad tripAdvisorRatingUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripAdvisorRatingUrl(String value) {
        this.tripAdvisorRatingUrl = value;
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
     * Obtiene el valor de la propiedad rateOccupancyPerRoom.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRateOccupancyPerRoom() {
        return rateOccupancyPerRoom;
    }

    /**
     * Define el valor de la propiedad rateOccupancyPerRoom.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRateOccupancyPerRoom(Integer value) {
        this.rateOccupancyPerRoom = value;
    }

    /**
     * Obtiene el valor de la propiedad couponInformationResponse.
     * 
     * @return
     *     possible object is
     *     {@link CouponInformationResponse }
     *     
     */
    public CouponInformationResponse getCouponInformationResponse() {
        return couponInformationResponse;
    }

    /**
     * Define el valor de la propiedad couponInformationResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponInformationResponse }
     *     
     */
    public void setCouponInformationResponse(CouponInformationResponse value) {
        this.couponInformationResponse = value;
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

}
