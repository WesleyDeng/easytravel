
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ItineraryQuery complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ItineraryQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creationDateStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureDateStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includeChildAffiliates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryQuery", propOrder = {
    "creationDateStart",
    "creationDateEnd",
    "departureDateStart",
    "departureDateEnd",
    "includeChildAffiliates"
})
public class ItineraryQuery {

    protected String creationDateStart;
    protected String creationDateEnd;
    protected String departureDateStart;
    protected String departureDateEnd;
    protected Boolean includeChildAffiliates;

    /**
     * Obtiene el valor de la propiedad creationDateStart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDateStart() {
        return creationDateStart;
    }

    /**
     * Define el valor de la propiedad creationDateStart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDateStart(String value) {
        this.creationDateStart = value;
    }

    /**
     * Obtiene el valor de la propiedad creationDateEnd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDateEnd() {
        return creationDateEnd;
    }

    /**
     * Define el valor de la propiedad creationDateEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDateEnd(String value) {
        this.creationDateEnd = value;
    }

    /**
     * Obtiene el valor de la propiedad departureDateStart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDateStart() {
        return departureDateStart;
    }

    /**
     * Define el valor de la propiedad departureDateStart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDateStart(String value) {
        this.departureDateStart = value;
    }

    /**
     * Obtiene el valor de la propiedad departureDateEnd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDateEnd() {
        return departureDateEnd;
    }

    /**
     * Define el valor de la propiedad departureDateEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDateEnd(String value) {
        this.departureDateEnd = value;
    }

    /**
     * Obtiene el valor de la propiedad includeChildAffiliates.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeChildAffiliates() {
        return includeChildAffiliates;
    }

    /**
     * Define el valor de la propiedad includeChildAffiliates.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeChildAffiliates(Boolean value) {
        this.includeChildAffiliates = value;
    }

}
