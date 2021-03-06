
package com.ean.wsapi.hotel.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HotelRoomAvailabilityRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HotelRoomAvailabilityRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}HotelBaseRequest">
 *       &lt;sequence>
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numberOfBedRooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="supplierType" type="{http://v3.hotel.wsapi.ean.com/}SupplierType" minOccurs="0"/>
 *         &lt;element name="rateKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomGroup" type="{http://v3.hotel.wsapi.ean.com/}RoomGroup"/>
 *         &lt;element name="rateType" type="{http://v3.hotel.wsapi.ean.com/}RatePlanType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includeRoomImages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CouponData" type="{http://v3.hotel.wsapi.ean.com/}CouponData" minOccurs="0"/>
 *         &lt;element name="includeDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="multiRoomAvail" type="{http://v3.hotel.wsapi.ean.com/}MultiRoomAvailType" minOccurs="0"/>
 *         &lt;element name="options" type="{http://v3.hotel.wsapi.ean.com/}hotelAvailOption" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRoomAvailabilityRequest", propOrder = {
    "hotelId",
    "arrivalDate",
    "departureDate",
    "numberOfBedRooms",
    "supplierType",
    "rateKey",
    "roomGroup",
    "rateType",
    "rateCode",
    "roomTypeCode",
    "includeRoomImages",
    "couponData",
    "includeDetails",
    "multiRoomAvail",
    "options"
})
public class HotelRoomAvailabilityRequest
    extends HotelBaseRequest
{

    protected long hotelId;
    @XmlElement(required = true)
    protected String arrivalDate;
    @XmlElement(required = true)
    protected String departureDate;
    protected Integer numberOfBedRooms;
    protected SupplierType supplierType;
    protected String rateKey;
    @XmlElement(name = "RoomGroup", required = true)
    protected RoomGroup roomGroup;
    protected List<RatePlanType> rateType;
    protected String rateCode;
    protected String roomTypeCode;
    protected Boolean includeRoomImages;
    @XmlElement(name = "CouponData")
    protected CouponData couponData;
    protected Boolean includeDetails;
    protected MultiRoomAvailType multiRoomAvail;
    protected List<HotelAvailOption> options;

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
     * Obtiene el valor de la propiedad includeRoomImages.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeRoomImages() {
        return includeRoomImages;
    }

    /**
     * Define el valor de la propiedad includeRoomImages.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeRoomImages(Boolean value) {
        this.includeRoomImages = value;
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
     * {@link HotelAvailOption }
     * 
     * 
     */
    public List<HotelAvailOption> getOptions() {
        if (options == null) {
            options = new ArrayList<HotelAvailOption>();
        }
        return this.options;
    }

}
