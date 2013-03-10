
package com.ean.wsapi.hotel.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HotelRoomAvailabilityResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HotelRoomAvailabilityResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelStateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfRoomsRequested" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="checkInInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tripAdvisorRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tripAdvisorReviewCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tripAdvisorRatingUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CouponInformationResponse" type="{http://v3.hotel.wsapi.ean.com/}CouponInformationResponse" minOccurs="0"/>
 *         &lt;element name="HotelRoomResponse" type="{http://v3.hotel.wsapi.ean.com/}HotelRoomResponse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HotelDetails" type="{http://v3.hotel.wsapi.ean.com/}HotelDetails" minOccurs="0"/>
 *         &lt;element name="PropertyAmenities" type="{http://v3.hotel.wsapi.ean.com/}PropertyAmenities" minOccurs="0"/>
 *         &lt;element name="HotelImages" type="{http://v3.hotel.wsapi.ean.com/}HotelImages" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRoomAvailabilityResponse", propOrder = {
    "hotelId",
    "arrivalDate",
    "departureDate",
    "hotelName",
    "hotelAddress",
    "hotelCity",
    "hotelStateProvince",
    "hotelCountry",
    "numberOfRoomsRequested",
    "checkInInstructions",
    "tripAdvisorRating",
    "tripAdvisorReviewCount",
    "tripAdvisorRatingUrl",
    "rateKey",
    "couponInformationResponse",
    "hotelRoomResponse",
    "hotelDetails",
    "propertyAmenities",
    "hotelImages"
})
public class HotelRoomAvailabilityResponse
    extends BaseResponse
{

    protected long hotelId;
    protected String arrivalDate;
    protected String departureDate;
    protected String hotelName;
    protected String hotelAddress;
    protected String hotelCity;
    protected String hotelStateProvince;
    protected String hotelCountry;
    protected Integer numberOfRoomsRequested;
    protected String checkInInstructions;
    protected String tripAdvisorRating;
    protected Integer tripAdvisorReviewCount;
    protected String tripAdvisorRatingUrl;
    protected String rateKey;
    @XmlElement(name = "CouponInformationResponse")
    protected CouponInformationResponse couponInformationResponse;
    @XmlElement(name = "HotelRoomResponse")
    protected List<HotelRoomResponse> hotelRoomResponse;
    @XmlElement(name = "HotelDetails")
    protected HotelDetails hotelDetails;
    @XmlElement(name = "PropertyAmenities")
    protected PropertyAmenities propertyAmenities;
    @XmlElement(name = "HotelImages")
    protected HotelImages hotelImages;
    @XmlAttribute(name = "size", required = true)
    protected int size;

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
     * Obtiene el valor de la propiedad hotelStateProvince.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelStateProvince() {
        return hotelStateProvince;
    }

    /**
     * Define el valor de la propiedad hotelStateProvince.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelStateProvince(String value) {
        this.hotelStateProvince = value;
    }

    /**
     * Obtiene el valor de la propiedad hotelCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCountry() {
        return hotelCountry;
    }

    /**
     * Define el valor de la propiedad hotelCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCountry(String value) {
        this.hotelCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfRoomsRequested.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRoomsRequested() {
        return numberOfRoomsRequested;
    }

    /**
     * Define el valor de la propiedad numberOfRoomsRequested.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRoomsRequested(Integer value) {
        this.numberOfRoomsRequested = value;
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
     * Gets the value of the hotelRoomResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelRoomResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelRoomResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelRoomResponse }
     * 
     * 
     */
    public List<HotelRoomResponse> getHotelRoomResponse() {
        if (hotelRoomResponse == null) {
            hotelRoomResponse = new ArrayList<HotelRoomResponse>();
        }
        return this.hotelRoomResponse;
    }

    /**
     * Obtiene el valor de la propiedad hotelDetails.
     * 
     * @return
     *     possible object is
     *     {@link HotelDetails }
     *     
     */
    public HotelDetails getHotelDetails() {
        return hotelDetails;
    }

    /**
     * Define el valor de la propiedad hotelDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelDetails }
     *     
     */
    public void setHotelDetails(HotelDetails value) {
        this.hotelDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad propertyAmenities.
     * 
     * @return
     *     possible object is
     *     {@link PropertyAmenities }
     *     
     */
    public PropertyAmenities getPropertyAmenities() {
        return propertyAmenities;
    }

    /**
     * Define el valor de la propiedad propertyAmenities.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyAmenities }
     *     
     */
    public void setPropertyAmenities(PropertyAmenities value) {
        this.propertyAmenities = value;
    }

    /**
     * Obtiene el valor de la propiedad hotelImages.
     * 
     * @return
     *     possible object is
     *     {@link HotelImages }
     *     
     */
    public HotelImages getHotelImages() {
        return hotelImages;
    }

    /**
     * Define el valor de la propiedad hotelImages.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelImages }
     *     
     */
    public void setHotelImages(HotelImages value) {
        this.hotelImages = value;
    }

    /**
     * Obtiene el valor de la propiedad size.
     * 
     */
    public int getSize() {
        return size;
    }

    /**
     * Define el valor de la propiedad size.
     * 
     */
    public void setSize(int value) {
        this.size = value;
    }

}
