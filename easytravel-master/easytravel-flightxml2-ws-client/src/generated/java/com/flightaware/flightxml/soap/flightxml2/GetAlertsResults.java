
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetAlertsResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetAlertsResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetAlertsResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}FlightAlertListing"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAlertsResults", propOrder = {
    "getAlertsResult"
})
public class GetAlertsResults {

    @XmlElement(name = "GetAlertsResult", required = true)
    protected FlightAlertListing getAlertsResult;

    /**
     * Obtiene el valor de la propiedad getAlertsResult.
     * 
     * @return
     *     possible object is
     *     {@link FlightAlertListing }
     *     
     */
    public FlightAlertListing getGetAlertsResult() {
        return getAlertsResult;
    }

    /**
     * Define el valor de la propiedad getAlertsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightAlertListing }
     *     
     */
    public void setGetAlertsResult(FlightAlertListing value) {
        this.getAlertsResult = value;
    }

}
