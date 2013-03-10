
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getPaymentInfoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getPaymentInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelPaymentResponse" type="{http://v3.hotel.wsapi.ean.com/}HotelPaymentResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPaymentInfoResponse", propOrder = {
    "hotelPaymentResponse"
})
public class GetPaymentInfoResponse {

    @XmlElement(name = "HotelPaymentResponse")
    protected HotelPaymentResponse hotelPaymentResponse;

    /**
     * Obtiene el valor de la propiedad hotelPaymentResponse.
     * 
     * @return
     *     possible object is
     *     {@link HotelPaymentResponse }
     *     
     */
    public HotelPaymentResponse getHotelPaymentResponse() {
        return hotelPaymentResponse;
    }

    /**
     * Define el valor de la propiedad hotelPaymentResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelPaymentResponse }
     *     
     */
    public void setHotelPaymentResponse(HotelPaymentResponse value) {
        this.hotelPaymentResponse = value;
    }

}
