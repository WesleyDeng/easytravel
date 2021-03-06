
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getPingResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getPingResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PingResponse" type="{http://v3.hotel.wsapi.ean.com/}PingResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPingResponse", propOrder = {
    "pingResponse"
})
public class GetPingResponse {

    @XmlElement(name = "PingResponse")
    protected PingResponse pingResponse;

    /**
     * Obtiene el valor de la propiedad pingResponse.
     * 
     * @return
     *     possible object is
     *     {@link PingResponse }
     *     
     */
    public PingResponse getPingResponse() {
        return pingResponse;
    }

    /**
     * Define el valor de la propiedad pingResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link PingResponse }
     *     
     */
    public void setPingResponse(PingResponse value) {
        this.pingResponse = value;
    }

}
