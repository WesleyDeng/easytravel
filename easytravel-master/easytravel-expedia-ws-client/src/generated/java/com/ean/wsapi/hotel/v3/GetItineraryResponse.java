
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getItineraryResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getItineraryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelItineraryResponse" type="{http://v3.hotel.wsapi.ean.com/}HotelItineraryResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getItineraryResponse", propOrder = {
    "hotelItineraryResponse"
})
public class GetItineraryResponse {

    @XmlElement(name = "HotelItineraryResponse")
    protected HotelItineraryResponse hotelItineraryResponse;

    /**
     * Obtiene el valor de la propiedad hotelItineraryResponse.
     * 
     * @return
     *     possible object is
     *     {@link HotelItineraryResponse }
     *     
     */
    public HotelItineraryResponse getHotelItineraryResponse() {
        return hotelItineraryResponse;
    }

    /**
     * Define el valor de la propiedad hotelItineraryResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelItineraryResponse }
     *     
     */
    public void setHotelItineraryResponse(HotelItineraryResponse value) {
        this.hotelItineraryResponse = value;
    }

}
