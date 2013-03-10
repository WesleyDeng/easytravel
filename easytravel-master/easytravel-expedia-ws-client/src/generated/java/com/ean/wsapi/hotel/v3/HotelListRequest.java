
package com.ean.wsapi.hotel.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HotelListRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HotelListRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}HotelBaseRequest">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelIdList" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="searchRadius" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="searchRadiusUnit" type="{http://v3.hotel.wsapi.ean.com/}SearchRadiusUnitType" minOccurs="0"/>
 *         &lt;element name="sort" type="{http://v3.hotel.wsapi.ean.com/}SortType" minOccurs="0"/>
 *         &lt;element name="propertyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amenities" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="minStarRating" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="maxStarRating" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="minTripAdvisorRating" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="maxTripAdvisorRating" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="minRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="propertyCategory" type="{http://v3.hotel.wsapi.ean.com/}PropertyCategory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="supplierType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfBedRooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberOfResults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxRatePlanCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomGroup" type="{http://v3.hotel.wsapi.ean.com/}RoomGroup" minOccurs="0"/>
 *         &lt;element name="rateType" type="{http://v3.hotel.wsapi.ean.com/}RatePlanType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cacheLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cacheKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="options" type="{http://v3.hotel.wsapi.ean.com/}hotelListOption" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="multiRoomAvail" type="{http://v3.hotel.wsapi.ean.com/}MultiRoomAvailType" minOccurs="0"/>
 *         &lt;element name="merchantScoringSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoringAlgorithmId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ignoreMmOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supplierCacheTolerance" type="{http://v3.hotel.wsapi.ean.com/}SupplierCacheTolerance" minOccurs="0"/>
 *         &lt;element name="datelessSupplierSort" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includeDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelListRequest", propOrder = {
    "address",
    "city",
    "stateProvinceCode",
    "postalCode",
    "countryCode",
    "destinationId",
    "destinationString",
    "hotelIdList",
    "latitude",
    "longitude",
    "searchRadius",
    "searchRadiusUnit",
    "sort",
    "propertyName",
    "amenities",
    "minStarRating",
    "maxStarRating",
    "minTripAdvisorRating",
    "maxTripAdvisorRating",
    "minRate",
    "maxRate",
    "propertyCategory",
    "supplierType",
    "numberOfBedRooms",
    "numberOfResults",
    "maxRatePlanCount",
    "arrivalDate",
    "departureDate",
    "roomGroup",
    "rateType",
    "cacheLocation",
    "cacheKey",
    "options",
    "multiRoomAvail",
    "merchantScoringSource",
    "scoringAlgorithmId",
    "ignoreMmOverrides",
    "supplierCacheTolerance",
    "datelessSupplierSort",
    "includeDetails"
})
public class HotelListRequest
    extends HotelBaseRequest
{

    protected String address;
    protected String city;
    protected String stateProvinceCode;
    protected String postalCode;
    protected String countryCode;
    protected String destinationId;
    protected String destinationString;
    @XmlElement(type = Long.class)
    protected List<Long> hotelIdList;
    protected Float latitude;
    protected Float longitude;
    protected Integer searchRadius;
    protected SearchRadiusUnitType searchRadiusUnit;
    protected SortType sort;
    protected String propertyName;
    @XmlElement(type = Integer.class)
    protected List<Integer> amenities;
    protected Float minStarRating;
    protected Float maxStarRating;
    protected Float minTripAdvisorRating;
    protected Float maxTripAdvisorRating;
    protected Integer minRate;
    protected Integer maxRate;
    protected List<String> propertyCategory;
    protected String supplierType;
    protected Integer numberOfBedRooms;
    protected Integer numberOfResults;
    protected Integer maxRatePlanCount;
    protected String arrivalDate;
    protected String departureDate;
    @XmlElement(name = "RoomGroup")
    protected RoomGroup roomGroup;
    protected List<RatePlanType> rateType;
    protected String cacheLocation;
    protected String cacheKey;
    protected List<HotelListOption> options;
    protected MultiRoomAvailType multiRoomAvail;
    protected String merchantScoringSource;
    protected Integer scoringAlgorithmId;
    protected Boolean ignoreMmOverrides;
    protected SupplierCacheTolerance supplierCacheTolerance;
    protected Boolean datelessSupplierSort;
    protected Boolean includeDetails;

    /**
     * Obtiene el valor de la propiedad address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Define el valor de la propiedad address.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
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
     * Obtiene el valor de la propiedad destinationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationId() {
        return destinationId;
    }

    /**
     * Define el valor de la propiedad destinationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationId(String value) {
        this.destinationId = value;
    }

    /**
     * Obtiene el valor de la propiedad destinationString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationString() {
        return destinationString;
    }

    /**
     * Define el valor de la propiedad destinationString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationString(String value) {
        this.destinationString = value;
    }

    /**
     * Gets the value of the hotelIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getHotelIdList() {
        if (hotelIdList == null) {
            hotelIdList = new ArrayList<Long>();
        }
        return this.hotelIdList;
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
     * Obtiene el valor de la propiedad searchRadius.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSearchRadius() {
        return searchRadius;
    }

    /**
     * Define el valor de la propiedad searchRadius.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSearchRadius(Integer value) {
        this.searchRadius = value;
    }

    /**
     * Obtiene el valor de la propiedad searchRadiusUnit.
     * 
     * @return
     *     possible object is
     *     {@link SearchRadiusUnitType }
     *     
     */
    public SearchRadiusUnitType getSearchRadiusUnit() {
        return searchRadiusUnit;
    }

    /**
     * Define el valor de la propiedad searchRadiusUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchRadiusUnitType }
     *     
     */
    public void setSearchRadiusUnit(SearchRadiusUnitType value) {
        this.searchRadiusUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad sort.
     * 
     * @return
     *     possible object is
     *     {@link SortType }
     *     
     */
    public SortType getSort() {
        return sort;
    }

    /**
     * Define el valor de la propiedad sort.
     * 
     * @param value
     *     allowed object is
     *     {@link SortType }
     *     
     */
    public void setSort(SortType value) {
        this.sort = value;
    }

    /**
     * Obtiene el valor de la propiedad propertyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Define el valor de la propiedad propertyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyName(String value) {
        this.propertyName = value;
    }

    /**
     * Gets the value of the amenities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amenities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmenities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getAmenities() {
        if (amenities == null) {
            amenities = new ArrayList<Integer>();
        }
        return this.amenities;
    }

    /**
     * Obtiene el valor de la propiedad minStarRating.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinStarRating() {
        return minStarRating;
    }

    /**
     * Define el valor de la propiedad minStarRating.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinStarRating(Float value) {
        this.minStarRating = value;
    }

    /**
     * Obtiene el valor de la propiedad maxStarRating.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxStarRating() {
        return maxStarRating;
    }

    /**
     * Define el valor de la propiedad maxStarRating.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxStarRating(Float value) {
        this.maxStarRating = value;
    }

    /**
     * Obtiene el valor de la propiedad minTripAdvisorRating.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinTripAdvisorRating() {
        return minTripAdvisorRating;
    }

    /**
     * Define el valor de la propiedad minTripAdvisorRating.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinTripAdvisorRating(Float value) {
        this.minTripAdvisorRating = value;
    }

    /**
     * Obtiene el valor de la propiedad maxTripAdvisorRating.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxTripAdvisorRating() {
        return maxTripAdvisorRating;
    }

    /**
     * Define el valor de la propiedad maxTripAdvisorRating.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxTripAdvisorRating(Float value) {
        this.maxTripAdvisorRating = value;
    }

    /**
     * Obtiene el valor de la propiedad minRate.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinRate() {
        return minRate;
    }

    /**
     * Define el valor de la propiedad minRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinRate(Integer value) {
        this.minRate = value;
    }

    /**
     * Obtiene el valor de la propiedad maxRate.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRate() {
        return maxRate;
    }

    /**
     * Define el valor de la propiedad maxRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRate(Integer value) {
        this.maxRate = value;
    }

    /**
     * Gets the value of the propertyCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPropertyCategory() {
        if (propertyCategory == null) {
            propertyCategory = new ArrayList<String>();
        }
        return this.propertyCategory;
    }

    /**
     * Obtiene el valor de la propiedad supplierType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierType() {
        return supplierType;
    }

    /**
     * Define el valor de la propiedad supplierType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierType(String value) {
        this.supplierType = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfBedRooms.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfBedRooms() {
        return numberOfBedRooms;
    }

    /**
     * Define el valor de la propiedad numberOfBedRooms.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfBedRooms(Integer value) {
        this.numberOfBedRooms = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfResults.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfResults() {
        return numberOfResults;
    }

    /**
     * Define el valor de la propiedad numberOfResults.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfResults(Integer value) {
        this.numberOfResults = value;
    }

    /**
     * Obtiene el valor de la propiedad maxRatePlanCount.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRatePlanCount() {
        return maxRatePlanCount;
    }

    /**
     * Define el valor de la propiedad maxRatePlanCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRatePlanCount(Integer value) {
        this.maxRatePlanCount = value;
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
     * Gets the value of the rateType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatePlanType }
     * 
     * 
     */
    public List<RatePlanType> getRateType() {
        if (rateType == null) {
            rateType = new ArrayList<RatePlanType>();
        }
        return this.rateType;
    }

    /**
     * Obtiene el valor de la propiedad cacheLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCacheLocation() {
        return cacheLocation;
    }

    /**
     * Define el valor de la propiedad cacheLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCacheLocation(String value) {
        this.cacheLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad cacheKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCacheKey() {
        return cacheKey;
    }

    /**
     * Define el valor de la propiedad cacheKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCacheKey(String value) {
        this.cacheKey = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the options property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelListOption }
     * 
     * 
     */
    public List<HotelListOption> getOptions() {
        if (options == null) {
            options = new ArrayList<HotelListOption>();
        }
        return this.options;
    }

    /**
     * Obtiene el valor de la propiedad multiRoomAvail.
     * 
     * @return
     *     possible object is
     *     {@link MultiRoomAvailType }
     *     
     */
    public MultiRoomAvailType getMultiRoomAvail() {
        return multiRoomAvail;
    }

    /**
     * Define el valor de la propiedad multiRoomAvail.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiRoomAvailType }
     *     
     */
    public void setMultiRoomAvail(MultiRoomAvailType value) {
        this.multiRoomAvail = value;
    }

    /**
     * Obtiene el valor de la propiedad merchantScoringSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantScoringSource() {
        return merchantScoringSource;
    }

    /**
     * Define el valor de la propiedad merchantScoringSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantScoringSource(String value) {
        this.merchantScoringSource = value;
    }

    /**
     * Obtiene el valor de la propiedad scoringAlgorithmId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScoringAlgorithmId() {
        return scoringAlgorithmId;
    }

    /**
     * Define el valor de la propiedad scoringAlgorithmId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScoringAlgorithmId(Integer value) {
        this.scoringAlgorithmId = value;
    }

    /**
     * Obtiene el valor de la propiedad ignoreMmOverrides.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreMmOverrides() {
        return ignoreMmOverrides;
    }

    /**
     * Define el valor de la propiedad ignoreMmOverrides.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreMmOverrides(Boolean value) {
        this.ignoreMmOverrides = value;
    }

    /**
     * Obtiene el valor de la propiedad supplierCacheTolerance.
     * 
     * @return
     *     possible object is
     *     {@link SupplierCacheTolerance }
     *     
     */
    public SupplierCacheTolerance getSupplierCacheTolerance() {
        return supplierCacheTolerance;
    }

    /**
     * Define el valor de la propiedad supplierCacheTolerance.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierCacheTolerance }
     *     
     */
    public void setSupplierCacheTolerance(SupplierCacheTolerance value) {
        this.supplierCacheTolerance = value;
    }

    /**
     * Obtiene el valor de la propiedad datelessSupplierSort.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDatelessSupplierSort() {
        return datelessSupplierSort;
    }

    /**
     * Define el valor de la propiedad datelessSupplierSort.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDatelessSupplierSort(Boolean value) {
        this.datelessSupplierSort = value;
    }

    /**
     * Obtiene el valor de la propiedad includeDetails.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeDetails() {
        return includeDetails;
    }

    /**
     * Define el valor de la propiedad includeDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeDetails(Boolean value) {
        this.includeDetails = value;
    }

}
