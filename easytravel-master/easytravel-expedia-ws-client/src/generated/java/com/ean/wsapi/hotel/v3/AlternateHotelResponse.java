
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AlternateHotelResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AlternateHotelResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelInfo" type="{http://v3.hotel.wsapi.ean.com/}HotelInfo" minOccurs="0"/>
 *         &lt;element name="Amenities" type="{http://v3.hotel.wsapi.ean.com/}Amenities" minOccurs="0"/>
 *         &lt;element name="LowestRateInfo" type="{http://v3.hotel.wsapi.ean.com/}LowestRateInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternateHotelResponse", propOrder = {
    "hotelInfo",
    "amenities",
    "lowestRateInfo"
})
public class AlternateHotelResponse {

    @XmlElement(name = "HotelInfo")
    protected HotelInfo hotelInfo;
    @XmlElement(name = "Amenities")
    protected Amenities amenities;
    @XmlElement(name = "LowestRateInfo")
    protected LowestRateInfo lowestRateInfo;

    /**
     * Obtiene el valor de la propiedad hotelInfo.
     * 
     * @return
     *     possible object is
     *     {@link HotelInfo }
     *     
     */
    public HotelInfo getHotelInfo() {
        return hotelInfo;
    }

    /**
     * Define el valor de la propiedad hotelInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfo }
     *     
     */
    public void setHotelInfo(HotelInfo value) {
        this.hotelInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad amenities.
     * 
     * @return
     *     possible object is
     *     {@link Amenities }
     *     
     */
    public Amenities getAmenities() {
        return amenities;
    }

    /**
     * Define el valor de la propiedad amenities.
     * 
     * @param value
     *     allowed object is
     *     {@link Amenities }
     *     
     */
    public void setAmenities(Amenities value) {
        this.amenities = value;
    }

    /**
     * Obtiene el valor de la propiedad lowestRateInfo.
     * 
     * @return
     *     possible object is
     *     {@link LowestRateInfo }
     *     
     */
    public LowestRateInfo getLowestRateInfo() {
        return lowestRateInfo;
    }

    /**
     * Define el valor de la propiedad lowestRateInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link LowestRateInfo }
     *     
     */
    public void setLowestRateInfo(LowestRateInfo value) {
        this.lowestRateInfo = value;
    }

}
