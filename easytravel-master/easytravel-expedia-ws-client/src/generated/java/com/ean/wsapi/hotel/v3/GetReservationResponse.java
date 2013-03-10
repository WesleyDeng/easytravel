
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getReservationResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getReservationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelRoomReservationResponse" type="{http://v3.hotel.wsapi.ean.com/}HotelRoomReservationResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReservationResponse", propOrder = {
    "hotelRoomReservationResponse"
})
public class GetReservationResponse {

    @XmlElement(name = "HotelRoomReservationResponse")
    protected HotelRoomReservationResponse hotelRoomReservationResponse;

    /**
     * Obtiene el valor de la propiedad hotelRoomReservationResponse.
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomReservationResponse }
     *     
     */
    public HotelRoomReservationResponse getHotelRoomReservationResponse() {
        return hotelRoomReservationResponse;
    }

    /**
     * Define el valor de la propiedad hotelRoomReservationResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomReservationResponse }
     *     
     */
    public void setHotelRoomReservationResponse(HotelRoomReservationResponse value) {
        this.hotelRoomReservationResponse = value;
    }

}
