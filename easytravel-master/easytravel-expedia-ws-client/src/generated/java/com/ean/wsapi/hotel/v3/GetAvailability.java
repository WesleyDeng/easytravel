
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getAvailability complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getAvailability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelRoomAvailabilityRequest" type="{http://v3.hotel.wsapi.ean.com/}HotelRoomAvailabilityRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailability", propOrder = {
    "hotelRoomAvailabilityRequest"
})
public class GetAvailability {

    @XmlElement(name = "HotelRoomAvailabilityRequest")
    protected HotelRoomAvailabilityRequest hotelRoomAvailabilityRequest;

    /**
     * Obtiene el valor de la propiedad hotelRoomAvailabilityRequest.
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomAvailabilityRequest }
     *     
     */
    public HotelRoomAvailabilityRequest getHotelRoomAvailabilityRequest() {
        return hotelRoomAvailabilityRequest;
    }

    /**
     * Define el valor de la propiedad hotelRoomAvailabilityRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomAvailabilityRequest }
     *     
     */
    public void setHotelRoomAvailabilityRequest(HotelRoomAvailabilityRequest value) {
        this.hotelRoomAvailabilityRequest = value;
    }

}
