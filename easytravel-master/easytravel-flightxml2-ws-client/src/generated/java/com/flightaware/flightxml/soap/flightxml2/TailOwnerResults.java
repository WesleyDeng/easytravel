
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TailOwnerResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TailOwnerResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TailOwnerResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}TailOwnerStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TailOwnerResults", propOrder = {
    "tailOwnerResult"
})
public class TailOwnerResults {

    @XmlElement(name = "TailOwnerResult", required = true)
    protected TailOwnerStruct tailOwnerResult;

    /**
     * Obtiene el valor de la propiedad tailOwnerResult.
     * 
     * @return
     *     possible object is
     *     {@link TailOwnerStruct }
     *     
     */
    public TailOwnerStruct getTailOwnerResult() {
        return tailOwnerResult;
    }

    /**
     * Define el valor de la propiedad tailOwnerResult.
     * 
     * @param value
     *     allowed object is
     *     {@link TailOwnerStruct }
     *     
     */
    public void setTailOwnerResult(TailOwnerStruct value) {
        this.tailOwnerResult = value;
    }

}
