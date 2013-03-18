
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para equipmentV1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="equipmentV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iata" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="turboProp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="jet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="widebody" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="regional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "equipmentV1", propOrder = {
    "iata",
    "name",
    "turboProp",
    "jet",
    "widebody",
    "regional"
})
public class EquipmentV1 {

    @XmlElement(required = true)
    protected String iata;
    @XmlElement(required = true)
    protected String name;
    protected boolean turboProp;
    protected boolean jet;
    protected boolean widebody;
    protected boolean regional;

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
     * Obtiene el valor de la propiedad turboProp.
     * 
     */
    public boolean isTurboProp() {
        return turboProp;
    }

    /**
     * Define el valor de la propiedad turboProp.
     * 
     */
    public void setTurboProp(boolean value) {
        this.turboProp = value;
    }

    /**
     * Obtiene el valor de la propiedad jet.
     * 
     */
    public boolean isJet() {
        return jet;
    }

    /**
     * Define el valor de la propiedad jet.
     * 
     */
    public void setJet(boolean value) {
        this.jet = value;
    }

    /**
     * Obtiene el valor de la propiedad widebody.
     * 
     */
    public boolean isWidebody() {
        return widebody;
    }

    /**
     * Define el valor de la propiedad widebody.
     * 
     */
    public void setWidebody(boolean value) {
        this.widebody = value;
    }

    /**
     * Obtiene el valor de la propiedad regional.
     * 
     */
    public boolean isRegional() {
        return regional;
    }

    /**
     * Define el valor de la propiedad regional.
     * 
     */
    public void setRegional(boolean value) {
        this.regional = value;
    }

}
