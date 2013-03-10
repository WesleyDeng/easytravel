
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TafResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TafResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TafResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TafResults", propOrder = {
    "tafResult"
})
public class TafResults {

    @XmlElement(name = "TafResult", required = true)
    protected String tafResult;

    /**
     * Obtiene el valor de la propiedad tafResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTafResult() {
        return tafResult;
    }

    /**
     * Define el valor de la propiedad tafResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTafResult(String value) {
        this.tafResult = value;
    }

}
