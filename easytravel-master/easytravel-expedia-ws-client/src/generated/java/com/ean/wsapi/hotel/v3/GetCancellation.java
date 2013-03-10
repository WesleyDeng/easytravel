
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getCancellation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getCancellation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelRoomCancellationRequest" type="{http://v3.hotel.wsapi.ean.com/}HotelRoomCancellationRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCancellation", propOrder = {
    "hotelRoomCancellationRequest"
})
public class GetCancellation {

    @XmlElement(name = "HotelRoomCancellationRequest")
    protected HotelRoomCancellationRequest hotelRoomCancellationRequest;

    /**
     * Obtiene el valor de la propiedad hotelRoomCancellationRequest.
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomCancellationRequest }
     *     
     */
    public HotelRoomCancellationRequest getHotelRoomCancellationRequest() {
        return hotelRoomCancellationRequest;
    }

    /**
     * Define el valor de la propiedad hotelRoomCancellationRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomCancellationRequest }
     *     
     */
    public void setHotelRoomCancellationRequest(HotelRoomCancellationRequest value) {
        this.hotelRoomCancellationRequest = value;
    }

}
