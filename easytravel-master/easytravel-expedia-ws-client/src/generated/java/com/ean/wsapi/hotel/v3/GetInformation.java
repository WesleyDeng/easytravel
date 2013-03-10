
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getInformation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelInformationRequest" type="{http://v3.hotel.wsapi.ean.com/}HotelInformationRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInformation", propOrder = {
    "hotelInformationRequest"
})
public class GetInformation {

    @XmlElement(name = "HotelInformationRequest")
    protected HotelInformationRequest hotelInformationRequest;

    /**
     * Obtiene el valor de la propiedad hotelInformationRequest.
     * 
     * @return
     *     possible object is
     *     {@link HotelInformationRequest }
     *     
     */
    public HotelInformationRequest getHotelInformationRequest() {
        return hotelInformationRequest;
    }

    /**
     * Define el valor de la propiedad hotelInformationRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInformationRequest }
     *     
     */
    public void setHotelInformationRequest(HotelInformationRequest value) {
        this.hotelInformationRequest = value;
    }

}
