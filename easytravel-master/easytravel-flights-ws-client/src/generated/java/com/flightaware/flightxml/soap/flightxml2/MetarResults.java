
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MetarResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MetarResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MetarResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetarResults", propOrder = {
    "metarResult"
})
public class MetarResults {

    @XmlElement(name = "MetarResult", required = true)
    protected String metarResult;

    /**
     * Obtiene el valor de la propiedad metarResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetarResult() {
        return metarResult;
    }

    /**
     * Define el valor de la propiedad metarResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetarResult(String value) {
        this.metarResult = value;
    }

}
