
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CouponInformation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CouponInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="couponCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="couponDiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="couponEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponInformation", propOrder = {
    "couponCode",
    "couponDiscount",
    "couponEmail"
})
public class CouponInformation {

    protected String couponCode;
    protected String couponDiscount;
    protected String couponEmail;

    /**
     * Obtiene el valor de la propiedad couponCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * Define el valor de la propiedad couponCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponCode(String value) {
        this.couponCode = value;
    }

    /**
     * Obtiene el valor de la propiedad couponDiscount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponDiscount() {
        return couponDiscount;
    }

    /**
     * Define el valor de la propiedad couponDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponDiscount(String value) {
        this.couponDiscount = value;
    }

    /**
     * Obtiene el valor de la propiedad couponEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponEmail() {
        return couponEmail;
    }

    /**
     * Define el valor de la propiedad couponEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponEmail(String value) {
        this.couponEmail = value;
    }

}
