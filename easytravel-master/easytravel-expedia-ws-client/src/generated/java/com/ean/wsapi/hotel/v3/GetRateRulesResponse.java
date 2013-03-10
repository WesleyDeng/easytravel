
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getRateRulesResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getRateRulesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelRateRulesResponse" type="{http://v3.hotel.wsapi.ean.com/}HotelRateRulesResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRateRulesResponse", propOrder = {
    "hotelRateRulesResponse"
})
public class GetRateRulesResponse {

    @XmlElement(name = "HotelRateRulesResponse")
    protected HotelRateRulesResponse hotelRateRulesResponse;

    /**
     * Obtiene el valor de la propiedad hotelRateRulesResponse.
     * 
     * @return
     *     possible object is
     *     {@link HotelRateRulesResponse }
     *     
     */
    public HotelRateRulesResponse getHotelRateRulesResponse() {
        return hotelRateRulesResponse;
    }

    /**
     * Define el valor de la propiedad hotelRateRulesResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRateRulesResponse }
     *     
     */
    public void setHotelRateRulesResponse(HotelRateRulesResponse value) {
        this.hotelRateRulesResponse = value;
    }

}
