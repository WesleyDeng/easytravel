
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para airlineV1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="airlineV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fs" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="icao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "airlineV1", propOrder = {
    "fs",
    "iata",
    "icao",
    "name",
    "phoneNumber",
    "active",
    "dateFrom",
    "dateTo"
})
public class AirlineV1 {

    @XmlElement(required = true)
    protected String fs;
    protected String iata;
    protected String icao;
    @XmlElement(required = true)
    protected String name;
    protected String phoneNumber;
    protected boolean active;
    protected String dateFrom;
    protected String dateTo;

    /**
     * Obtiene el valor de la propiedad fs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFs() {
        return fs;
    }

    /**
     * Define el valor de la propiedad fs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFs(String value) {
        this.fs = value;
    }

    /**
     * Obtiene el valor de la propiedad iata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIata() {
        return iata;
    }

    /**
     * Define el valor de la propiedad iata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIata(String value) {
        this.iata = value;
    }

    /**
     * Obtiene el valor de la propiedad icao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcao() {
        return icao;
    }

    /**
     * Define el valor de la propiedad icao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcao(String value) {
        this.icao = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Define el valor de la propiedad phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad active.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Define el valor de la propiedad active.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Obtiene el valor de la propiedad dateFrom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFrom() {
        return dateFrom;
    }

    /**
     * Define el valor de la propiedad dateFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFrom(String value) {
        this.dateFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad dateTo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTo() {
        return dateTo;
    }

    /**
     * Define el valor de la propiedad dateTo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTo(String value) {
        this.dateTo = value;
    }

}
