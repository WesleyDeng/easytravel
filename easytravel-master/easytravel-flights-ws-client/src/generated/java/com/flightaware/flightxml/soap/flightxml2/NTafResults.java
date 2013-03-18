
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NTafResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NTafResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NTafResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}TafStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NTafResults", propOrder = {
    "nTafResult"
})
public class NTafResults {

    @XmlElement(name = "NTafResult", required = true)
    protected TafStruct nTafResult;

    /**
     * Obtiene el valor de la propiedad nTafResult.
     * 
     * @return
     *     possible object is
     *     {@link TafStruct }
     *     
     */
    public TafStruct getNTafResult() {
        return nTafResult;
    }

    /**
     * Define el valor de la propiedad nTafResult.
     * 
     * @param value
     *     allowed object is
     *     {@link TafStruct }
     *     
     */
    public void setNTafResult(TafStruct value) {
        this.nTafResult = value;
    }

}
