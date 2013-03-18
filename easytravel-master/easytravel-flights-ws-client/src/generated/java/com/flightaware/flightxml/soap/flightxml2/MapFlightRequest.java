
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MapFlightRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MapFlightRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ident" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mapHeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mapWidth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapFlightRequest", propOrder = {
    "ident",
    "mapHeight",
    "mapWidth"
})
public class MapFlightRequest {

    @XmlElement(required = true)
    protected String ident;
    protected int mapHeight;
    protected int mapWidth;

    /**
     * Obtiene el valor de la propiedad ident.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdent() {
        return ident;
    }

    /**
     * Define el valor de la propiedad ident.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdent(String value) {
        this.ident = value;
    }

    /**
     * Obtiene el valor de la propiedad mapHeight.
     * 
     */
    public int getMapHeight() {
        return mapHeight;
    }

    /**
     * Define el valor de la propiedad mapHeight.
     * 
     */
    public void setMapHeight(int value) {
        this.mapHeight = value;
    }

    /**
     * Obtiene el valor de la propiedad mapWidth.
     * 
     */
    public int getMapWidth() {
        return mapWidth;
    }

    /**
     * Define el valor de la propiedad mapWidth.
     * 
     */
    public void setMapWidth(int value) {
        this.mapWidth = value;
    }

}
