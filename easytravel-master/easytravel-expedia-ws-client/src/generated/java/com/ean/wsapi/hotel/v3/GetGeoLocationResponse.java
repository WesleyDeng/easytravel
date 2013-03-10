
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getGeoLocationResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getGeoLocationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationInfoResponse" type="{http://v3.hotel.wsapi.ean.com/}LocationInfoResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGeoLocationResponse", propOrder = {
    "locationInfoResponse"
})
public class GetGeoLocationResponse {

    @XmlElement(name = "LocationInfoResponse")
    protected LocationInfoResponse locationInfoResponse;

    /**
     * Obtiene el valor de la propiedad locationInfoResponse.
     * 
     * @return
     *     possible object is
     *     {@link LocationInfoResponse }
     *     
     */
    public LocationInfoResponse getLocationInfoResponse() {
        return locationInfoResponse;
    }

    /**
     * Define el valor de la propiedad locationInfoResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationInfoResponse }
     *     
     */
    public void setLocationInfoResponse(LocationInfoResponse value) {
        this.locationInfoResponse = value;
    }

}
