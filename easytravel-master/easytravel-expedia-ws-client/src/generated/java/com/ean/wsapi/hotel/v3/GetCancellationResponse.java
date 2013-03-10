
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getCancellationResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getCancellationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelRoomCancellationResponse" type="{http://v3.hotel.wsapi.ean.com/}HotelRoomCancellationResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCancellationResponse", propOrder = {
    "hotelRoomCancellationResponse"
})
public class GetCancellationResponse {

    @XmlElement(name = "HotelRoomCancellationResponse")
    protected HotelRoomCancellationResponse hotelRoomCancellationResponse;

    /**
     * Obtiene el valor de la propiedad hotelRoomCancellationResponse.
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomCancellationResponse }
     *     
     */
    public HotelRoomCancellationResponse getHotelRoomCancellationResponse() {
        return hotelRoomCancellationResponse;
    }

    /**
     * Define el valor de la propiedad hotelRoomCancellationResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomCancellationResponse }
     *     
     */
    public void setHotelRoomCancellationResponse(HotelRoomCancellationResponse value) {
        this.hotelRoomCancellationResponse = value;
    }

}
