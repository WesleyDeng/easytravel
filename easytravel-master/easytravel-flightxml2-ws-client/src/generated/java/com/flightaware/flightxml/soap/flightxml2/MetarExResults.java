
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MetarExResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MetarExResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MetarExResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ArrayOfMetarStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetarExResults", propOrder = {
    "metarExResult"
})
public class MetarExResults {

    @XmlElement(name = "MetarExResult", required = true)
    protected ArrayOfMetarStruct metarExResult;

    /**
     * Obtiene el valor de la propiedad metarExResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMetarStruct }
     *     
     */
    public ArrayOfMetarStruct getMetarExResult() {
        return metarExResult;
    }

    /**
     * Define el valor de la propiedad metarExResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMetarStruct }
     *     
     */
    public void setMetarExResult(ArrayOfMetarStruct value) {
        this.metarExResult = value;
    }

}
