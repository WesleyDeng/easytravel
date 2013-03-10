
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HotelInformationResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HotelInformationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="HotelSummary" type="{http://v3.hotel.wsapi.ean.com/}HotelSummary" minOccurs="0"/>
 *         &lt;element name="HotelDetails" type="{http://v3.hotel.wsapi.ean.com/}HotelDetails" minOccurs="0"/>
 *         &lt;element name="Suppliers" type="{http://v3.hotel.wsapi.ean.com/}Suppliers" minOccurs="0"/>
 *         &lt;element name="RoomTypes" type="{http://v3.hotel.wsapi.ean.com/}RoomTypes" minOccurs="0"/>
 *         &lt;element name="PropertyAmenities" type="{http://v3.hotel.wsapi.ean.com/}PropertyAmenities" minOccurs="0"/>
 *         &lt;element name="HotelImages" type="{http://v3.hotel.wsapi.ean.com/}HotelImages" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="hotelId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelInformationResponse", propOrder = {
    "hotelSummary",
    "hotelDetails",
    "suppliers",
    "roomTypes",
    "propertyAmenities",
    "hotelImages"
})
public class HotelInformationResponse
    extends BaseResponse
{

    @XmlElement(name = "HotelSummary")
    protected HotelSummary hotelSummary;
    @XmlElement(name = "HotelDetails")
    protected HotelDetails hotelDetails;
    @XmlElement(name = "Suppliers")
    protected Suppliers suppliers;
    @XmlElement(name = "RoomTypes")
    protected RoomTypes roomTypes;
    @XmlElement(name = "PropertyAmenities")
    protected PropertyAmenities propertyAmenities;
    @XmlElement(name = "HotelImages")
    protected HotelImages hotelImages;
    @XmlAttribute(name = "hotelId")
    protected Long hotelId;

    /**
     * Obtiene el valor de la propiedad hotelSummary.
     * 
     * @return
     *     possible object is
     *     {@link HotelSummary }
     *     
     */
    public HotelSummary getHotelSummary() {
        return hotelSummary;
    }

    /**
     * Define el valor de la propiedad hotelSummary.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelSummary }
     *     
     */
    public void setHotelSummary(HotelSummary value) {
        this.hotelSummary = value;
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
     * Obtiene el valor de la propiedad suppliers.
     * 
     * @return
     *     possible object is
     *     {@link Suppliers }
     *     
     */
    public Suppliers getSuppliers() {
        return suppliers;
    }

    /**
     * Define el valor de la propiedad suppliers.
     * 
     * @param value
     *     allowed object is
     *     {@link Suppliers }
     *     
     */
    public void setSuppliers(Suppliers value) {
        this.suppliers = value;
    }

    /**
     * Obtiene el valor de la propiedad roomTypes.
     * 
     * @return
     *     possible object is
     *     {@link RoomTypes }
     *     
     */
    public RoomTypes getRoomTypes() {
        return roomTypes;
    }

    /**
     * Define el valor de la propiedad roomTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomTypes }
     *     
     */
    public void setRoomTypes(RoomTypes value) {
        this.roomTypes = value;
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

}
