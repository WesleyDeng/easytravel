
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RoomType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RoomType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descriptionLong" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomAmenities" type="{http://v3.hotel.wsapi.ean.com/}RoomAmenities" minOccurs="0"/>
 *         &lt;element name="roomImages" type="{http://v3.hotel.wsapi.ean.com/}HotelImages" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="roomTypeId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="roomCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomType", propOrder = {
    "description",
    "descriptionLong",
    "roomAmenities",
    "roomImages"
})
public class RoomType {

    protected String description;
    protected String descriptionLong;
    protected RoomAmenities roomAmenities;
    protected HotelImages roomImages;
    @XmlAttribute(name = "roomTypeId", required = true)
    protected long roomTypeId;
    @XmlAttribute(name = "roomCode")
    protected String roomCode;

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad descriptionLong.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionLong() {
        return descriptionLong;
    }

    /**
     * Define el valor de la propiedad descriptionLong.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionLong(String value) {
        this.descriptionLong = value;
    }

    /**
     * Obtiene el valor de la propiedad roomAmenities.
     * 
     * @return
     *     possible object is
     *     {@link RoomAmenities }
     *     
     */
    public RoomAmenities getRoomAmenities() {
        return roomAmenities;
    }

    /**
     * Define el valor de la propiedad roomAmenities.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomAmenities }
     *     
     */
    public void setRoomAmenities(RoomAmenities value) {
        this.roomAmenities = value;
    }

    /**
     * Obtiene el valor de la propiedad roomImages.
     * 
     * @return
     *     possible object is
     *     {@link HotelImages }
     *     
     */
    public HotelImages getRoomImages() {
        return roomImages;
    }

    /**
     * Define el valor de la propiedad roomImages.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelImages }
     *     
     */
    public void setRoomImages(HotelImages value) {
        this.roomImages = value;
    }

    /**
     * Obtiene el valor de la propiedad roomTypeId.
     * 
     */
    public long getRoomTypeId() {
        return roomTypeId;
    }

    /**
     * Define el valor de la propiedad roomTypeId.
     * 
     */
    public void setRoomTypeId(long value) {
        this.roomTypeId = value;
    }

    /**
     * Obtiene el valor de la propiedad roomCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomCode() {
        return roomCode;
    }

    /**
     * Define el valor de la propiedad roomCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomCode(String value) {
        this.roomCode = value;
    }

}
