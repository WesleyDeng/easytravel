
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getAvailabilityResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getAvailabilityResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelRoomAvailabilityResponse" type="{http://v3.hotel.wsapi.ean.com/}HotelRoomAvailabilityResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailabilityResponse", propOrder = {
    "hotelRoomAvailabilityResponse"
})
public class GetAvailabilityResponse {

    @XmlElement(name = "HotelRoomAvailabilityResponse")
    protected HotelRoomAvailabilityResponse hotelRoomAvailabilityResponse;

    /**
     * Obtiene el valor de la propiedad hotelRoomAvailabilityResponse.
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomAvailabilityResponse }
     *     
     */
    public HotelRoomAvailabilityResponse getHotelRoomAvailabilityResponse() {
        return hotelRoomAvailabilityResponse;
    }

    /**
     * Define el valor de la propiedad hotelRoomAvailabilityResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomAvailabilityResponse }
     *     
     */
    public void setHotelRoomAvailabilityResponse(HotelRoomAvailabilityResponse value) {
        this.hotelRoomAvailabilityResponse = value;
    }

}
