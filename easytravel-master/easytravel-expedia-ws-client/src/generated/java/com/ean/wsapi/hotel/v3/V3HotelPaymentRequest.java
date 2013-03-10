
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para v3.HotelPaymentRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="v3.HotelPaymentRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}HotelPaymentRequest">
 *       &lt;sequence>
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="supplierType" type="{http://v3.hotel.wsapi.ean.com/}SupplierType" minOccurs="0"/>
 *         &lt;element name="rateType" type="{http://v3.hotel.wsapi.ean.com/}RatePlanType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "v3.HotelPaymentRequest", propOrder = {
    "hotelId",
    "supplierType",
    "rateType"
})
public class V3HotelPaymentRequest
    extends HotelPaymentRequest
{

    protected Long hotelId;
    protected SupplierType supplierType;
    protected RatePlanType rateType;

    /**
     * Obtiene el valor de la propiedad hotelId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHotelId() {
        return hotelId;
    }

    /**
     * Define el valor de la propiedad hotelId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHotelId(Long value) {
        this.hotelId = value;
    }

    /**
     * Obtiene el valor de la propiedad supplierType.
     * 
     * @return
     *     possible object is
     *     {@link SupplierType }
     *     
     */
    public SupplierType getSupplierType() {
        return supplierType;
    }

    /**
     * Define el valor de la propiedad supplierType.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierType }
     *     
     */
    public void setSupplierType(SupplierType value) {
        this.supplierType = value;
    }

    /**
     * Obtiene el valor de la propiedad rateType.
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType }
     *     
     */
    public RatePlanType getRateType() {
        return rateType;
    }

    /**
     * Define el valor de la propiedad rateType.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType }
     *     
     */
    public void setRateType(RatePlanType value) {
        this.rateType = value;
    }

}
