
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para positionV2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="positionV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lon" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="speedMph" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="altitudeFt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "positionV2", propOrder = {
    "lon",
    "lat",
    "speedMph",
    "altitudeFt",
    "source",
    "date"
})
public class PositionV2 {

    protected double lon;
    protected double lat;
    protected Integer speedMph;
    protected Integer altitudeFt;
    protected String source;
    @XmlElement(required = true)
    protected String date;

    /**
     * Obtiene el valor de la propiedad lon.
     * 
     */
    public double getLon() {
        return lon;
    }

    /**
     * Define el valor de la propiedad lon.
     * 
     */
    public void setLon(double value) {
        this.lon = value;
    }

    /**
     * Obtiene el valor de la propiedad lat.
     * 
     */
    public double getLat() {
        return lat;
    }

    /**
     * Define el valor de la propiedad lat.
     * 
     */
    public void setLat(double value) {
        this.lat = value;
    }

    /**
     * Obtiene el valor de la propiedad speedMph.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpeedMph() {
        return speedMph;
    }

    /**
     * Define el valor de la propiedad speedMph.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpeedMph(Integer value) {
        this.speedMph = value;
    }

    /**
     * Obtiene el valor de la propiedad altitudeFt.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAltitudeFt() {
        return altitudeFt;
    }

    /**
     * Define el valor de la propiedad altitudeFt.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAltitudeFt(Integer value) {
        this.altitudeFt = value;
    }

    /**
     * Obtiene el valor de la propiedad source.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Define el valor de la propiedad source.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Obtiene el valor de la propiedad date.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Define el valor de la propiedad date.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

}
