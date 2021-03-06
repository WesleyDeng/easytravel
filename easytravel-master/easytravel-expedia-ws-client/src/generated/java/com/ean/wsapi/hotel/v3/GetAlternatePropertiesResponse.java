
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getAlternatePropertiesResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getAlternatePropertiesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlternatePropertyListResponse" type="{http://v3.hotel.wsapi.ean.com/}AlternatePropertyListResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAlternatePropertiesResponse", propOrder = {
    "alternatePropertyListResponse"
})
public class GetAlternatePropertiesResponse {

    @XmlElement(name = "AlternatePropertyListResponse")
    protected AlternatePropertyListResponse alternatePropertyListResponse;

    /**
     * Obtiene el valor de la propiedad alternatePropertyListResponse.
     * 
     * @return
     *     possible object is
     *     {@link AlternatePropertyListResponse }
     *     
     */
    public AlternatePropertyListResponse getAlternatePropertyListResponse() {
        return alternatePropertyListResponse;
    }

    /**
     * Define el valor de la propiedad alternatePropertyListResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternatePropertyListResponse }
     *     
     */
    public void setAlternatePropertyListResponse(AlternatePropertyListResponse value) {
        this.alternatePropertyListResponse = value;
    }

}
