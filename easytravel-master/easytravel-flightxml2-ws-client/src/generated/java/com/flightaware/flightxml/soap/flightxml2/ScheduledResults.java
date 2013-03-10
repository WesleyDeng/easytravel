
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ScheduledResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ScheduledResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScheduledResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ScheduledStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledResults", propOrder = {
    "scheduledResult"
})
public class ScheduledResults {

    @XmlElement(name = "ScheduledResult", required = true)
    protected ScheduledStruct scheduledResult;

    /**
     * Obtiene el valor de la propiedad scheduledResult.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStruct }
     *     
     */
    public ScheduledStruct getScheduledResult() {
        return scheduledResult;
    }

    /**
     * Define el valor de la propiedad scheduledResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStruct }
     *     
     */
    public void setScheduledResult(ScheduledStruct value) {
        this.scheduledResult = value;
    }

}
