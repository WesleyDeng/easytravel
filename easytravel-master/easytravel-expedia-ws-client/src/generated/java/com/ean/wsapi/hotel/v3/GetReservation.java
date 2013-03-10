
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getReservation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getReservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelRoomReservationRequest" type="{http://v3.hotel.wsapi.ean.com/}HotelRoomReservationRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReservation", propOrder = {
    "hotelRoomReservationRequest"
})
public class GetReservation {

    @XmlElement(name = "HotelRoomReservationRequest")
    protected HotelRoomReservationRequest hotelRoomReservationRequest;

    /**
     * Obtiene el valor de la propiedad hotelRoomReservationRequest.
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomReservationRequest }
     *     
     */
    public HotelRoomReservationRequest getHotelRoomReservationRequest() {
        return hotelRoomReservationRequest;
    }

    /**
     * Define el valor de la propiedad hotelRoomReservationRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomReservationRequest }
     *     
     */
    public void setHotelRoomReservationRequest(HotelRoomReservationRequest value) {
        this.hotelRoomReservationRequest = value;
    }

}
