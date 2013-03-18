
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para flightEquipmentV2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="flightEquipmentV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scheduledEquipment" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}equipmentV1" minOccurs="0"/>
 *         &lt;element name="scheduledEquipmentIataCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actualEquipment" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}equipmentV1" minOccurs="0"/>
 *         &lt;element name="actualEquipmentIataCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tailNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightEquipmentV2", propOrder = {
    "scheduledEquipment",
    "scheduledEquipmentIataCode",
    "actualEquipment",
    "actualEquipmentIataCode",
    "tailNumber"
})
public class FlightEquipmentV2 {

    protected EquipmentV1 scheduledEquipment;
    protected String scheduledEquipmentIataCode;
    protected EquipmentV1 actualEquipment;
    protected String actualEquipmentIataCode;
    protected String tailNumber;

    /**
     * Obtiene el valor de la propiedad scheduledEquipment.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentV1 }
     *     
     */
    public EquipmentV1 getScheduledEquipment() {
        return scheduledEquipment;
    }

    /**
     * Define el valor de la propiedad scheduledEquipment.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentV1 }
     *     
     */
    public void setScheduledEquipment(EquipmentV1 value) {
        this.scheduledEquipment = value;
    }

    /**
     * Obtiene el valor de la propiedad scheduledEquipmentIataCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledEquipmentIataCode() {
        return scheduledEquipmentIataCode;
    }

    /**
     * Define el valor de la propiedad scheduledEquipmentIataCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledEquipmentIataCode(String value) {
        this.scheduledEquipmentIataCode = value;
    }

    /**
     * Obtiene el valor de la propiedad actualEquipment.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentV1 }
     *     
     */
    public EquipmentV1 getActualEquipment() {
        return actualEquipment;
    }

    /**
     * Define el valor de la propiedad actualEquipment.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentV1 }
     *     
     */
    public void setActualEquipment(EquipmentV1 value) {
        this.actualEquipment = value;
    }

    /**
     * Obtiene el valor de la propiedad actualEquipmentIataCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualEquipmentIataCode() {
        return actualEquipmentIataCode;
    }

    /**
     * Define el valor de la propiedad actualEquipmentIataCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualEquipmentIataCode(String value) {
        this.actualEquipmentIataCode = value;
    }

    /**
     * Obtiene el valor de la propiedad tailNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTailNumber() {
        return tailNumber;
    }

    /**
     * Define el valor de la propiedad tailNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTailNumber(String value) {
        this.tailNumber = value;
    }

}
