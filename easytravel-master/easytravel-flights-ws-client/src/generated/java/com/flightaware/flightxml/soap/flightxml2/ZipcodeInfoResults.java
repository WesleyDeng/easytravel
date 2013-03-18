
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ZipcodeInfoResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ZipcodeInfoResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZipcodeInfoResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ZipcodeInfoStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZipcodeInfoResults", propOrder = {
    "zipcodeInfoResult"
})
public class ZipcodeInfoResults {

    @XmlElement(name = "ZipcodeInfoResult", required = true)
    protected ZipcodeInfoStruct zipcodeInfoResult;

    /**
     * Obtiene el valor de la propiedad zipcodeInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link ZipcodeInfoStruct }
     *     
     */
    public ZipcodeInfoStruct getZipcodeInfoResult() {
        return zipcodeInfoResult;
    }

    /**
     * Define el valor de la propiedad zipcodeInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ZipcodeInfoStruct }
     *     
     */
    public void setZipcodeInfoResult(ZipcodeInfoStruct value) {
        this.zipcodeInfoResult = value;
    }

}
