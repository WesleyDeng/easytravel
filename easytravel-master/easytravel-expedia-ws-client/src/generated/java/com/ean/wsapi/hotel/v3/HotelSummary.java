
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HotelSummary complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HotelSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="airportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplierType" type="{http://v3.hotel.wsapi.ean.com/}SupplierType" minOccurs="0"/>
 *         &lt;element name="propertyCategory" type="{http://v3.hotel.wsapi.ean.com/}PropertyCategory" minOccurs="0"/>
 *         &lt;element name="hotelRating" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="confidenceRating" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="amenityMask" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tripAdvisorRating" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="tripAdvisorReviewCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tripAdvisorRatingUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="lowRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="rateCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="proximityDistance" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="proximityUnit" type="{http://v3.hotel.wsapi.ean.com/}SearchRadiusUnitType" minOccurs="0"/>
 *         &lt;element name="hotelInDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="thumbNailUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deepLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomRateDetailsList" type="{http://v3.hotel.wsapi.ean.com/}RoomRateDetailsList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="order" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ubsScore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelSummary", propOrder = {
    "hotelId",
    "name",
    "address1",
    "address2",
    "address3",
    "phoneNumber",
    "city",
    "stateProvinceCode",
    "postalCode",
    "countryCode",
    "airportCode",
    "supplierType",
    "propertyCategory",
    "hotelRating",
    "confidenceRating",
    "amenityMask",
    "tripAdvisorRating",
    "tripAdvisorReviewCount",
    "tripAdvisorRatingUrl",
    "locationDescription",
    "shortDescription",
    "highRate",
    "lowRate",
    "rateCurrencyCode",
    "latitude",
    "longitude",
    "proximityDistance",
    "proximityUnit",
    "hotelInDestination",
    "thumbNailUrl",
    "deepLink",
    "roomRateDetailsList"
})
public class HotelSummary {

    protected Long hotelId;
    protected String name;
    protected String address1;
    protected String address2;
    protected String address3;
    protected String phoneNumber;
    protected String city;
    protected String stateProvinceCode;
    protected String postalCode;
    protected String countryCode;
    protected String airportCode;
    protected SupplierType supplierType;
    protected String propertyCategory;
    protected Float hotelRating;
    protected Integer confidenceRating;
    protected Long amenityMask;
    protected Float tripAdvisorRating;
    protected Integer tripAdvisorReviewCount;
    protected String tripAdvisorRatingUrl;
    protected String locationDescription;
    protected String shortDescription;
    protected Float highRate;
    protected Float lowRate;
    protected String rateCurrencyCode;
    protected Float latitude;
    protected Float longitude;
    protected Float proximityDistance;
    protected SearchRadiusUnitType proximityUnit;
    protected Boolean hotelInDestination;
    protected String thumbNailUrl;
    protected String deepLink;
    @XmlElement(name = "RoomRateDetailsList")
    protected RoomRateDetailsList roomRateDetailsList;
    @XmlAttribute(name = "order", required = true)
    protected int order;
    @XmlAttribute(name = "ubsScore")
    protected String ubsScore;

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
     * Obtiene el valor de la propiedad airportCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportCode() {
        return airportCode;
    }

    /**
     * Define el valor de la propiedad airportCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportCode(String value) {
        this.airportCode = value;
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
     * Obtiene el valor de la propiedad propertyCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyCategory() {
        return propertyCategory;
    }

    /**
     * Define el valor de la propiedad propertyCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyCategory(String value) {
        this.propertyCategory = value;
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
     * Obtiene el valor de la propiedad confidenceRating.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConfidenceRating() {
        return confidenceRating;
    }

    /**
     * Define el valor de la propiedad confidenceRating.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConfidenceRating(Integer value) {
        this.confidenceRating = value;
    }

    /**
     * Obtiene el valor de la propiedad amenityMask.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmenityMask() {
        return amenityMask;
    }

    /**
     * Define el valor de la propiedad amenityMask.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmenityMask(Long value) {
        this.amenityMask = value;
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
     * Obtiene el valor de la propiedad shortDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Define el valor de la propiedad shortDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
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
     * Obtiene el valor de la propiedad rateCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCurrencyCode() {
        return rateCurrencyCode;
    }

    /**
     * Define el valor de la propiedad rateCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCurrencyCode(String value) {
        this.rateCurrencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad latitude.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * Define el valor de la propiedad latitude.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLatitude(Float value) {
        this.latitude = value;
    }

    /**
     * Obtiene el valor de la propiedad longitude.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * Define el valor de la propiedad longitude.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLongitude(Float value) {
        this.longitude = value;
    }

    /**
     * Obtiene el valor de la propiedad proximityDistance.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getProximityDistance() {
        return proximityDistance;
    }

    /**
     * Define el valor de la propiedad proximityDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setProximityDistance(Float value) {
        this.proximityDistance = value;
    }

    /**
     * Obtiene el valor de la propiedad proximityUnit.
     * 
     * @return
     *     possible object is
     *     {@link SearchRadiusUnitType }
     *     
     */
    public SearchRadiusUnitType getProximityUnit() {
        return proximityUnit;
    }

    /**
     * Define el valor de la propiedad proximityUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchRadiusUnitType }
     *     
     */
    public void setProximityUnit(SearchRadiusUnitType value) {
        this.proximityUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad hotelInDestination.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHotelInDestination() {
        return hotelInDestination;
    }

    /**
     * Define el valor de la propiedad hotelInDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHotelInDestination(Boolean value) {
        this.hotelInDestination = value;
    }

    /**
     * Obtiene el valor de la propiedad thumbNailUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbNailUrl() {
        return thumbNailUrl;
    }

    /**
     * Define el valor de la propiedad thumbNailUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbNailUrl(String value) {
        this.thumbNailUrl = value;
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
     * Obtiene el valor de la propiedad roomRateDetailsList.
     * 
     * @return
     *     possible object is
     *     {@link RoomRateDetailsList }
     *     
     */
    public RoomRateDetailsList getRoomRateDetailsList() {
        return roomRateDetailsList;
    }

    /**
     * Define el valor de la propiedad roomRateDetailsList.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomRateDetailsList }
     *     
     */
    public void setRoomRateDetailsList(RoomRateDetailsList value) {
        this.roomRateDetailsList = value;
    }

    /**
     * Obtiene el valor de la propiedad order.
     * 
     */
    public int getOrder() {
        return order;
    }

    /**
     * Define el valor de la propiedad order.
     * 
     */
    public void setOrder(int value) {
        this.order = value;
    }

    /**
     * Obtiene el valor de la propiedad ubsScore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbsScore() {
        return ubsScore;
    }

    /**
     * Define el valor de la propiedad ubsScore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbsScore(String value) {
        this.ubsScore = value;
    }

}
