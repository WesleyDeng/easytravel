
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para flightStatusUpdatedDateV2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="flightStatusUpdatedDateV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originalDateLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newDateLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightStatusUpdatedDateV2", propOrder = {
    "field",
    "originalDateLocal",
    "newDateLocal"
})
public class FlightStatusUpdatedDateV2 {

    @XmlElement(required = true)
    protected String field;
    protected String originalDateLocal;
    protected String newDateLocal;

    /**
     * Obtiene el valor de la propiedad field.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Define el valor de la propiedad field.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Obtiene el valor de la propiedad originalDateLocal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalDateLocal() {
        return originalDateLocal;
    }

    /**
     * Define el valor de la propiedad originalDateLocal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalDateLocal(String value) {
        this.originalDateLocal = value;
    }

    /**
     * Obtiene el valor de la propiedad newDateLocal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewDateLocal() {
        return newDateLocal;
    }

    /**
     * Define el valor de la propiedad newDateLocal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewDateLocal(String value) {
        this.newDateLocal = value;
    }

}
