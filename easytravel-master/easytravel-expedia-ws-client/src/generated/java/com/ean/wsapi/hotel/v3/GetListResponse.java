
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getListResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelListResponse" type="{http://v3.hotel.wsapi.ean.com/}HotelListResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getListResponse", propOrder = {
    "hotelListResponse"
})
public class GetListResponse {

    @XmlElement(name = "HotelListResponse")
    protected HotelListResponse hotelListResponse;

    /**
     * Obtiene el valor de la propiedad hotelListResponse.
     * 
     * @return
     *     possible object is
     *     {@link HotelListResponse }
     *     
     */
    public HotelListResponse getHotelListResponse() {
        return hotelListResponse;
    }

    /**
     * Define el valor de la propiedad hotelListResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelListResponse }
     *     
     */
    public void setHotelListResponse(HotelListResponse value) {
        this.hotelListResponse = value;
    }

}
