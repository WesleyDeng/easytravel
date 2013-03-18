
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FleetScheduledResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FleetScheduledResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FleetScheduledResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ScheduledStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FleetScheduledResults", propOrder = {
    "fleetScheduledResult"
})
public class FleetScheduledResults {

    @XmlElement(name = "FleetScheduledResult", required = true)
    protected ScheduledStruct fleetScheduledResult;

    /**
     * Obtiene el valor de la propiedad fleetScheduledResult.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStruct }
     *     
     */
    public ScheduledStruct getFleetScheduledResult() {
        return fleetScheduledResult;
    }

    /**
     * Define el valor de la propiedad fleetScheduledResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStruct }
     *     
     */
    public void setFleetScheduledResult(ScheduledStruct value) {
        this.fleetScheduledResult = value;
    }

}
