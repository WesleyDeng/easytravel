
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AirlineFlightSchedulesResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AirlineFlightSchedulesResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineFlightSchedulesResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ArrayOfAirlineFlightScheduleStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineFlightSchedulesResults", propOrder = {
    "airlineFlightSchedulesResult"
})
public class AirlineFlightSchedulesResults {

    @XmlElement(name = "AirlineFlightSchedulesResult", required = true)
    protected ArrayOfAirlineFlightScheduleStruct airlineFlightSchedulesResult;

    /**
     * Obtiene el valor de la propiedad airlineFlightSchedulesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAirlineFlightScheduleStruct }
     *     
     */
    public ArrayOfAirlineFlightScheduleStruct getAirlineFlightSchedulesResult() {
        return airlineFlightSchedulesResult;
    }

    /**
     * Define el valor de la propiedad airlineFlightSchedulesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAirlineFlightScheduleStruct }
     *     
     */
    public void setAirlineFlightSchedulesResult(ArrayOfAirlineFlightScheduleStruct value) {
        this.airlineFlightSchedulesResult = value;
    }

}
