
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getPaymentInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getPaymentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelPaymentRequest" type="{http://v3.hotel.wsapi.ean.com/}v3.HotelPaymentRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPaymentInfo", propOrder = {
    "hotelPaymentRequest"
})
public class GetPaymentInfo {

    @XmlElement(name = "HotelPaymentRequest")
    protected V3HotelPaymentRequest hotelPaymentRequest;

    /**
     * Obtiene el valor de la propiedad hotelPaymentRequest.
     * 
     * @return
     *     possible object is
     *     {@link V3HotelPaymentRequest }
     *     
     */
    public V3HotelPaymentRequest getHotelPaymentRequest() {
        return hotelPaymentRequest;
    }

    /**
     * Define el valor de la propiedad hotelPaymentRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link V3HotelPaymentRequest }
     *     
     */
    public void setHotelPaymentRequest(V3HotelPaymentRequest value) {
        this.hotelPaymentRequest = value;
    }

}
