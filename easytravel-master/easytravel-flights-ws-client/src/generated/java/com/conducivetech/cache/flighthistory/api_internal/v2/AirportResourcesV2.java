
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para airportResourcesV2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="airportResourcesV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departureTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureGate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalGate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baggage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "airportResourcesV2", propOrder = {
    "departureTerminal",
    "departureGate",
    "arrivalTerminal",
    "arrivalGate",
    "baggage"
})
public class AirportResourcesV2 {

    protected String departureTerminal;
    protected String departureGate;
    protected String arrivalTerminal;
    protected String arrivalGate;
    protected String baggage;

    /**
     * Obtiene el valor de la propiedad departureTerminal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTerminal() {
        return departureTerminal;
    }

    /**
     * Define el valor de la propiedad departureTerminal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTerminal(String value) {
        this.departureTerminal = value;
    }

    /**
     * Obtiene el valor de la propiedad departureGate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureGate() {
        return departureGate;
    }

    /**
     * Define el valor de la propiedad departureGate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureGate(String value) {
        this.departureGate = value;
    }

    /**
     * Obtiene el valor de la propiedad arrivalTerminal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTerminal() {
        return arrivalTerminal;
    }

    /**
     * Define el valor de la propiedad arrivalTerminal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTerminal(String value) {
        this.arrivalTerminal = value;
    }

    /**
     * Obtiene el valor de la propiedad arrivalGate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalGate() {
        return arrivalGate;
    }

    /**
     * Define el valor de la propiedad arrivalGate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalGate(String value) {
        this.arrivalGate = value;
    }

    /**
     * Obtiene el valor de la propiedad baggage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggage() {
        return baggage;
    }

    /**
     * Define el valor de la propiedad baggage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggage(String value) {
        this.baggage = value;
    }

}
