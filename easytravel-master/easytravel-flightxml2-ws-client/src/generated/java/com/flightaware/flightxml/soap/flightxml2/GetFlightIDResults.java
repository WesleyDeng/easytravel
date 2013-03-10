
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetFlightIDResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetFlightIDResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetFlightIDResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFlightIDResults", propOrder = {
    "getFlightIDResult"
})
public class GetFlightIDResults {

    @XmlElement(name = "GetFlightIDResult", required = true)
    protected String getFlightIDResult;

    /**
     * Obtiene el valor de la propiedad getFlightIDResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetFlightIDResult() {
        return getFlightIDResult;
    }

    /**
     * Define el valor de la propiedad getFlightIDResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetFlightIDResult(String value) {
        this.getFlightIDResult = value;
    }

}
