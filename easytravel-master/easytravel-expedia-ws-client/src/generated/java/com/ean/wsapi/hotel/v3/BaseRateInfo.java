
package com.ean.wsapi.hotel.v3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para baseRateInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="baseRateInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Discounts" type="{http://v3.hotel.wsapi.ean.com/}baseRateInfoDiscounts" minOccurs="0"/>
 *         &lt;element name="NightlyRatesPerRoom" type="{http://v3.hotel.wsapi.ean.com/}baseRateInfoNightlyRatesPerRoom" minOccurs="0"/>
 *         &lt;element name="promoDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Surcharges" type="{http://v3.hotel.wsapi.ean.com/}baseRateInfoSurcharges" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="averageBaseRate" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="averageRate" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="commissionableUsdTotal" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="discountTotal" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="eanCompensationOffline" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="eanCompensationOnline" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="maxNightlyRate" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="nightlyRateTotal" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="grossProfitOffline" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="grossProfitOnline" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="surchargeTotal" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseRateInfo", propOrder = {
    "discounts",
    "nightlyRatesPerRoom",
    "promoDescription",
    "surcharges"
})
public class BaseRateInfo {

    @XmlElement(name = "Discounts")
    protected BaseRateInfoDiscounts discounts;
    @XmlElement(name = "NightlyRatesPerRoom")
    protected BaseRateInfoNightlyRatesPerRoom nightlyRatesPerRoom;
    protected String promoDescription;
    @XmlElement(name = "Surcharges")
    protected BaseRateInfoSurcharges surcharges;
    @XmlAttribute(name = "averageBaseRate")
    protected Float averageBaseRate;
    @XmlAttribute(name = "averageRate")
    protected Float averageRate;
    @XmlAttribute(name = "commissionableUsdTotal")
    protected Float commissionableUsdTotal;
    @XmlAttribute(name = "currencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "discountTotal")
    protected Float discountTotal;
    @XmlAttribute(name = "eanCompensationOffline")
    protected BigDecimal eanCompensationOffline;
    @XmlAttribute(name = "eanCompensationOnline")
    protected BigDecimal eanCompensationOnline;
    @XmlAttribute(name = "maxNightlyRate")
    protected Float maxNightlyRate;
    @XmlAttribute(name = "nightlyRateTotal")
    protected Float nightlyRateTotal;
    @XmlAttribute(name = "grossProfitOffline")
    protected BigDecimal grossProfitOffline;
    @XmlAttribute(name = "grossProfitOnline")
    protected BigDecimal grossProfitOnline;
    @XmlAttribute(name = "surchargeTotal")
    protected Float surchargeTotal;
    @XmlAttribute(name = "total")
    protected Float total;

    /**
     * Obtiene el valor de la propiedad discounts.
     * 
     * @return
     *     possible object is
     *     {@link BaseRateInfoDiscounts }
     *     
     */
    public BaseRateInfoDiscounts getDiscounts() {
        return discounts;
    }

    /**
     * Define el valor de la propiedad discounts.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRateInfoDiscounts }
     *     
     */
    public void setDiscounts(BaseRateInfoDiscounts value) {
        this.discounts = value;
    }

    /**
     * Obtiene el valor de la propiedad nightlyRatesPerRoom.
     * 
     * @return
     *     possible object is
     *     {@link BaseRateInfoNightlyRatesPerRoom }
     *     
     */
    public BaseRateInfoNightlyRatesPerRoom getNightlyRatesPerRoom() {
        return nightlyRatesPerRoom;
    }

    /**
     * Define el valor de la propiedad nightlyRatesPerRoom.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRateInfoNightlyRatesPerRoom }
     *     
     */
    public void setNightlyRatesPerRoom(BaseRateInfoNightlyRatesPerRoom value) {
        this.nightlyRatesPerRoom = value;
    }

    /**
     * Obtiene el valor de la propiedad promoDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoDescription() {
        return promoDescription;
    }

    /**
     * Define el valor de la propiedad promoDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoDescription(String value) {
        this.promoDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad surcharges.
     * 
     * @return
     *     possible object is
     *     {@link BaseRateInfoSurcharges }
     *     
     */
    public BaseRateInfoSurcharges getSurcharges() {
        return surcharges;
    }

    /**
     * Define el valor de la propiedad surcharges.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRateInfoSurcharges }
     *     
     */
    public void setSurcharges(BaseRateInfoSurcharges value) {
        this.surcharges = value;
    }

    /**
     * Obtiene el valor de la propiedad averageBaseRate.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAverageBaseRate() {
        return averageBaseRate;
    }

    /**
     * Define el valor de la propiedad averageBaseRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAverageBaseRate(Float value) {
        this.averageBaseRate = value;
    }

    /**
     * Obtiene el valor de la propiedad averageRate.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAverageRate() {
        return averageRate;
    }

    /**
     * Define el valor de la propiedad averageRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAverageRate(Float value) {
        this.averageRate = value;
    }

    /**
     * Obtiene el valor de la propiedad commissionableUsdTotal.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCommissionableUsdTotal() {
        return commissionableUsdTotal;
    }

    /**
     * Define el valor de la propiedad commissionableUsdTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCommissionableUsdTotal(Float value) {
        this.commissionableUsdTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Define el valor de la propiedad currencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad discountTotal.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDiscountTotal() {
        return discountTotal;
    }

    /**
     * Define el valor de la propiedad discountTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDiscountTotal(Float value) {
        this.discountTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad eanCompensationOffline.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEanCompensationOffline() {
        return eanCompensationOffline;
    }

    /**
     * Define el valor de la propiedad eanCompensationOffline.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEanCompensationOffline(BigDecimal value) {
        this.eanCompensationOffline = value;
    }

    /**
     * Obtiene el valor de la propiedad eanCompensationOnline.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEanCompensationOnline() {
        return eanCompensationOnline;
    }

    /**
     * Define el valor de la propiedad eanCompensationOnline.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEanCompensationOnline(BigDecimal value) {
        this.eanCompensationOnline = value;
    }

    /**
     * Obtiene el valor de la propiedad maxNightlyRate.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxNightlyRate() {
        return maxNightlyRate;
    }

    /**
     * Define el valor de la propiedad maxNightlyRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxNightlyRate(Float value) {
        this.maxNightlyRate = value;
    }

    /**
     * Obtiene el valor de la propiedad nightlyRateTotal.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNightlyRateTotal() {
        return nightlyRateTotal;
    }

    /**
     * Define el valor de la propiedad nightlyRateTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNightlyRateTotal(Float value) {
        this.nightlyRateTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad grossProfitOffline.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossProfitOffline() {
        return grossProfitOffline;
    }

    /**
     * Define el valor de la propiedad grossProfitOffline.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossProfitOffline(BigDecimal value) {
        this.grossProfitOffline = value;
    }

    /**
     * Obtiene el valor de la propiedad grossProfitOnline.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossProfitOnline() {
        return grossProfitOnline;
    }

    /**
     * Define el valor de la propiedad grossProfitOnline.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossProfitOnline(BigDecimal value) {
        this.grossProfitOnline = value;
    }

    /**
     * Obtiene el valor de la propiedad surchargeTotal.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSurchargeTotal() {
        return surchargeTotal;
    }

    /**
     * Define el valor de la propiedad surchargeTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSurchargeTotal(Float value) {
        this.surchargeTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTotal(Float value) {
        this.total = value;
    }

}
