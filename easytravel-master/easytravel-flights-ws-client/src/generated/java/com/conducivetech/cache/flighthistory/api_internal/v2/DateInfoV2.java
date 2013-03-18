
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dateInfoV2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dateInfoV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateUtc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dateInfoV2", propOrder = {
    "dateLocal",
    "dateUtc"
})
public class DateInfoV2 {

    protected String dateLocal;
    protected String dateUtc;

    /**
     * Obtiene el valor de la propiedad dateLocal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateLocal() {
        return dateLocal;
    }

    /**
     * Define el valor de la propiedad dateLocal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateLocal(String value) {
        this.dateLocal = value;
    }

    /**
     * Obtiene el valor de la propiedad dateUtc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateUtc() {
        return dateUtc;
    }

    /**
     * Define el valor de la propiedad dateUtc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateUtc(String value) {
        this.dateUtc = value;
    }

}
