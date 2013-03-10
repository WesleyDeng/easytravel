
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PingRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PingRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}HotelBaseRequest">
 *       &lt;sequence>
 *         &lt;element name="echo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PingRequest", propOrder = {
    "echo"
})
public class PingRequest
    extends HotelBaseRequest
{

    protected String echo;

    /**
     * Obtiene el valor de la propiedad echo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcho() {
        return echo;
    }

    /**
     * Define el valor de la propiedad echo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcho(String value) {
        this.echo = value;
    }

}
