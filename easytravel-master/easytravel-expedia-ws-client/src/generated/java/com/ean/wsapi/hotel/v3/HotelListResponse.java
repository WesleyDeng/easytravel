
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HotelListResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HotelListResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="numberOfRoomsRequested" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="moreResultsAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cacheKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cacheLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cachedSupplierResponse" type="{http://v3.hotel.wsapi.ean.com/}CachedSupplierResponse" minOccurs="0"/>
 *         &lt;element name="HotelList" type="{http://v3.hotel.wsapi.ean.com/}HotelList" minOccurs="0"/>
 *         &lt;element name="LocationInfos" type="{http://v3.hotel.wsapi.ean.com/}LocationInfos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelListResponse", propOrder = {
    "numberOfRoomsRequested",
    "moreResultsAvailable",
    "cacheKey",
    "cacheLocation",
    "cachedSupplierResponse",
    "hotelList",
    "locationInfos"
})
public class HotelListResponse
    extends BaseResponse
{

    protected Integer numberOfRoomsRequested;
    protected Boolean moreResultsAvailable;
    protected String cacheKey;
    protected String cacheLocation;
    protected CachedSupplierResponse cachedSupplierResponse;
    @XmlElement(name = "HotelList")
    protected HotelList hotelList;
    @XmlElement(name = "LocationInfos")
    protected LocationInfos locationInfos;

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
     * Obtiene el valor de la propiedad moreResultsAvailable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreResultsAvailable() {
        return moreResultsAvailable;
    }

    /**
     * Define el valor de la propiedad moreResultsAvailable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoreResultsAvailable(Boolean value) {
        this.moreResultsAvailable = value;
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
     * Obtiene el valor de la propiedad cachedSupplierResponse.
     * 
     * @return
     *     possible object is
     *     {@link CachedSupplierResponse }
     *     
     */
    public CachedSupplierResponse getCachedSupplierResponse() {
        return cachedSupplierResponse;
    }

    /**
     * Define el valor de la propiedad cachedSupplierResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link CachedSupplierResponse }
     *     
     */
    public void setCachedSupplierResponse(CachedSupplierResponse value) {
        this.cachedSupplierResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad hotelList.
     * 
     * @return
     *     possible object is
     *     {@link HotelList }
     *     
     */
    public HotelList getHotelList() {
        return hotelList;
    }

    /**
     * Define el valor de la propiedad hotelList.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelList }
     *     
     */
    public void setHotelList(HotelList value) {
        this.hotelList = value;
    }

    /**
     * Obtiene el valor de la propiedad locationInfos.
     * 
     * @return
     *     possible object is
     *     {@link LocationInfos }
     *     
     */
    public LocationInfos getLocationInfos() {
        return locationInfos;
    }

    /**
     * Define el valor de la propiedad locationInfos.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationInfos }
     *     
     */
    public void setLocationInfos(LocationInfos value) {
        this.locationInfos = value;
    }

}
