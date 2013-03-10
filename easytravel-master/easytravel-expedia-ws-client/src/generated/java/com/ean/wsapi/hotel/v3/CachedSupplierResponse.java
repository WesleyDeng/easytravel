
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CachedSupplierResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CachedSupplierResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *       &lt;/all>
 *       &lt;attribute name="supplierCacheTolerance" type="{http://v3.hotel.wsapi.ean.com/}SupplierCacheTolerance" />
 *       &lt;attribute name="cachedTime" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="cacheEntryHitNum" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="cacheEntryMissNum" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="cacheEntryExpiredNum" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="cacheRetrievalTime" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="supplierRequestNum" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="supplierResponseNum" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="supplierResponseTime" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="candidatePreptime" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="otherOverheadTime" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="tpidUsed" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="matchedCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="matchedLocale" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="extrapolatedCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="extrapolatedLocale" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CachedSupplierResponse", propOrder = {

})
public class CachedSupplierResponse {

    @XmlAttribute(name = "supplierCacheTolerance")
    protected SupplierCacheTolerance supplierCacheTolerance;
    @XmlAttribute(name = "cachedTime")
    protected Long cachedTime;
    @XmlAttribute(name = "cacheEntryHitNum")
    protected Integer cacheEntryHitNum;
    @XmlAttribute(name = "cacheEntryMissNum")
    protected Integer cacheEntryMissNum;
    @XmlAttribute(name = "cacheEntryExpiredNum")
    protected Integer cacheEntryExpiredNum;
    @XmlAttribute(name = "cacheRetrievalTime")
    protected Long cacheRetrievalTime;
    @XmlAttribute(name = "supplierRequestNum")
    protected Integer supplierRequestNum;
    @XmlAttribute(name = "supplierResponseNum")
    protected Integer supplierResponseNum;
    @XmlAttribute(name = "supplierResponseTime")
    protected Long supplierResponseTime;
    @XmlAttribute(name = "candidatePreptime")
    protected Long candidatePreptime;
    @XmlAttribute(name = "otherOverheadTime")
    protected Long otherOverheadTime;
    @XmlAttribute(name = "tpidUsed")
    protected Integer tpidUsed;
    @XmlAttribute(name = "matchedCurrency")
    protected Boolean matchedCurrency;
    @XmlAttribute(name = "matchedLocale")
    protected Boolean matchedLocale;
    @XmlAttribute(name = "extrapolatedCurrency")
    protected Boolean extrapolatedCurrency;
    @XmlAttribute(name = "extrapolatedLocale")
    protected Boolean extrapolatedLocale;

    /**
     * Obtiene el valor de la propiedad supplierCacheTolerance.
     * 
     * @return
     *     possible object is
     *     {@link SupplierCacheTolerance }
     *     
     */
    public SupplierCacheTolerance getSupplierCacheTolerance() {
        return supplierCacheTolerance;
    }

    /**
     * Define el valor de la propiedad supplierCacheTolerance.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierCacheTolerance }
     *     
     */
    public void setSupplierCacheTolerance(SupplierCacheTolerance value) {
        this.supplierCacheTolerance = value;
    }

    /**
     * Obtiene el valor de la propiedad cachedTime.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCachedTime() {
        return cachedTime;
    }

    /**
     * Define el valor de la propiedad cachedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCachedTime(Long value) {
        this.cachedTime = value;
    }

    /**
     * Obtiene el valor de la propiedad cacheEntryHitNum.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCacheEntryHitNum() {
        return cacheEntryHitNum;
    }

    /**
     * Define el valor de la propiedad cacheEntryHitNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCacheEntryHitNum(Integer value) {
        this.cacheEntryHitNum = value;
    }

    /**
     * Obtiene el valor de la propiedad cacheEntryMissNum.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCacheEntryMissNum() {
        return cacheEntryMissNum;
    }

    /**
     * Define el valor de la propiedad cacheEntryMissNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCacheEntryMissNum(Integer value) {
        this.cacheEntryMissNum = value;
    }

    /**
     * Obtiene el valor de la propiedad cacheEntryExpiredNum.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCacheEntryExpiredNum() {
        return cacheEntryExpiredNum;
    }

    /**
     * Define el valor de la propiedad cacheEntryExpiredNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCacheEntryExpiredNum(Integer value) {
        this.cacheEntryExpiredNum = value;
    }

    /**
     * Obtiene el valor de la propiedad cacheRetrievalTime.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCacheRetrievalTime() {
        return cacheRetrievalTime;
    }

    /**
     * Define el valor de la propiedad cacheRetrievalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCacheRetrievalTime(Long value) {
        this.cacheRetrievalTime = value;
    }

    /**
     * Obtiene el valor de la propiedad supplierRequestNum.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSupplierRequestNum() {
        return supplierRequestNum;
    }

    /**
     * Define el valor de la propiedad supplierRequestNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSupplierRequestNum(Integer value) {
        this.supplierRequestNum = value;
    }

    /**
     * Obtiene el valor de la propiedad supplierResponseNum.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSupplierResponseNum() {
        return supplierResponseNum;
    }

    /**
     * Define el valor de la propiedad supplierResponseNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSupplierResponseNum(Integer value) {
        this.supplierResponseNum = value;
    }

    /**
     * Obtiene el valor de la propiedad supplierResponseTime.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSupplierResponseTime() {
        return supplierResponseTime;
    }

    /**
     * Define el valor de la propiedad supplierResponseTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSupplierResponseTime(Long value) {
        this.supplierResponseTime = value;
    }

    /**
     * Obtiene el valor de la propiedad candidatePreptime.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCandidatePreptime() {
        return candidatePreptime;
    }

    /**
     * Define el valor de la propiedad candidatePreptime.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCandidatePreptime(Long value) {
        this.candidatePreptime = value;
    }

    /**
     * Obtiene el valor de la propiedad otherOverheadTime.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOtherOverheadTime() {
        return otherOverheadTime;
    }

    /**
     * Define el valor de la propiedad otherOverheadTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOtherOverheadTime(Long value) {
        this.otherOverheadTime = value;
    }

    /**
     * Obtiene el valor de la propiedad tpidUsed.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTpidUsed() {
        return tpidUsed;
    }

    /**
     * Define el valor de la propiedad tpidUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTpidUsed(Integer value) {
        this.tpidUsed = value;
    }

    /**
     * Obtiene el valor de la propiedad matchedCurrency.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMatchedCurrency() {
        return matchedCurrency;
    }

    /**
     * Define el valor de la propiedad matchedCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatchedCurrency(Boolean value) {
        this.matchedCurrency = value;
    }

    /**
     * Obtiene el valor de la propiedad matchedLocale.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMatchedLocale() {
        return matchedLocale;
    }

    /**
     * Define el valor de la propiedad matchedLocale.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatchedLocale(Boolean value) {
        this.matchedLocale = value;
    }

    /**
     * Obtiene el valor de la propiedad extrapolatedCurrency.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtrapolatedCurrency() {
        return extrapolatedCurrency;
    }

    /**
     * Define el valor de la propiedad extrapolatedCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtrapolatedCurrency(Boolean value) {
        this.extrapolatedCurrency = value;
    }

    /**
     * Obtiene el valor de la propiedad extrapolatedLocale.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtrapolatedLocale() {
        return extrapolatedLocale;
    }

    /**
     * Define el valor de la propiedad extrapolatedLocale.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtrapolatedLocale(Boolean value) {
        this.extrapolatedLocale = value;
    }

}
