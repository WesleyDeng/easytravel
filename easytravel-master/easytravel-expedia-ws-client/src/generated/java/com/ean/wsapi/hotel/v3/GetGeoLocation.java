
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getGeoLocation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getGeoLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationInfoRequest" type="{http://v3.hotel.wsapi.ean.com/}LocationInfoRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGeoLocation", propOrder = {
    "locationInfoRequest"
})
public class GetGeoLocation {

    @XmlElement(name = "LocationInfoRequest")
    protected LocationInfoRequest locationInfoRequest;

    /**
     * Obtiene el valor de la propiedad locationInfoRequest.
     * 
     * @return
     *     possible object is
     *     {@link LocationInfoRequest }
     *     
     */
    public LocationInfoRequest getLocationInfoRequest() {
        return locationInfoRequest;
    }

    /**
     * Define el valor de la propiedad locationInfoRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationInfoRequest }
     *     
     */
    public void setLocationInfoRequest(LocationInfoRequest value) {
        this.locationInfoRequest = value;
    }

}
