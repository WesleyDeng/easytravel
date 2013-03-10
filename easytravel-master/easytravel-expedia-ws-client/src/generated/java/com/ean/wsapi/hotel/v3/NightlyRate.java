
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NightlyRate complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NightlyRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="baseRate" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="rate" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="promo" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NightlyRate")
public class NightlyRate {

    @XmlAttribute(name = "baseRate")
    protected Float baseRate;
    @XmlAttribute(name = "rate")
    protected Float rate;
    @XmlAttribute(name = "promo")
    protected Boolean promo;

    /**
     * Obtiene el valor de la propiedad baseRate.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBaseRate() {
        return baseRate;
    }

    /**
     * Define el valor de la propiedad baseRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBaseRate(Float value) {
        this.baseRate = value;
    }

    /**
     * Obtiene el valor de la propiedad rate.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRate() {
        return rate;
    }

    /**
     * Define el valor de la propiedad rate.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRate(Float value) {
        this.rate = value;
    }

    /**
     * Obtiene el valor de la propiedad promo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromo() {
        return promo;
    }

    /**
     * Define el valor de la propiedad promo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromo(Boolean value) {
        this.promo = value;
    }

}
