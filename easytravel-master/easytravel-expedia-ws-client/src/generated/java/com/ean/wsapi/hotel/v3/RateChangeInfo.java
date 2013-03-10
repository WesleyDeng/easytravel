
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RateChangeInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RateChangeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="rawRateChangeData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateChangeInfo", propOrder = {
    "beginDate",
    "endDate",
    "rate",
    "rawRateChangeData"
})
public class RateChangeInfo {

    protected String beginDate;
    protected String endDate;
    protected float rate;
    protected String rawRateChangeData;

    /**
     * Obtiene el valor de la propiedad beginDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginDate() {
        return beginDate;
    }

    /**
     * Define el valor de la propiedad beginDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginDate(String value) {
        this.beginDate = value;
    }

    /**
     * Obtiene el valor de la propiedad endDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Define el valor de la propiedad endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Obtiene el valor de la propiedad rate.
     * 
     */
    public float getRate() {
        return rate;
    }

    /**
     * Define el valor de la propiedad rate.
     * 
     */
    public void setRate(float value) {
        this.rate = value;
    }

    /**
     * Obtiene el valor de la propiedad rawRateChangeData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawRateChangeData() {
        return rawRateChangeData;
    }

    /**
     * Define el valor de la propiedad rawRateChangeData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawRateChangeData(String value) {
        this.rawRateChangeData = value;
    }

}
