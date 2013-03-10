
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getRoomImage complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getRoomImage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelRoomImageRequest" type="{http://v3.hotel.wsapi.ean.com/}HotelRoomImageRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRoomImage", propOrder = {
    "hotelRoomImageRequest"
})
public class GetRoomImage {

    @XmlElement(name = "HotelRoomImageRequest")
    protected HotelRoomImageRequest hotelRoomImageRequest;

    /**
     * Obtiene el valor de la propiedad hotelRoomImageRequest.
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomImageRequest }
     *     
     */
    public HotelRoomImageRequest getHotelRoomImageRequest() {
        return hotelRoomImageRequest;
    }

    /**
     * Define el valor de la propiedad hotelRoomImageRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomImageRequest }
     *     
     */
    public void setHotelRoomImageRequest(HotelRoomImageRequest value) {
        this.hotelRoomImageRequest = value;
    }

}
