
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RoomRateDetails complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RoomRateDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxRoomOccupancy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="quotedRoomOccupancy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="minGuestAge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="roomDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoDetailText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentAllotment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="propertyAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="propertyRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="expediaPropertyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RateInfo" type="{http://v3.hotel.wsapi.ean.com/}HotelRateInfo" minOccurs="0"/>
 *         &lt;element name="RateInfos" type="{http://v3.hotel.wsapi.ean.com/}RateInfos" minOccurs="0"/>
 *         &lt;element name="ValueAdds" type="{http://v3.hotel.wsapi.ean.com/}ValueAdds" minOccurs="0"/>
 *         &lt;element name="BedTypes" type="{http://v3.hotel.wsapi.ean.com/}BedTypes" minOccurs="0"/>
 *         &lt;element name="smokingPreferences" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomRateDetails", propOrder = {
    "roomTypeCode",
    "rateCode",
    "maxRoomOccupancy",
    "quotedRoomOccupancy",
    "minGuestAge",
    "roomDescription",
    "promoId",
    "promoDescription",
    "promoDetailText",
    "currentAllotment",
    "propertyAvailable",
    "propertyRestricted",
    "expediaPropertyId",
    "rateKey",
    "rateType",
    "nonRefundable",
    "rateInfo",
    "rateInfos",
    "valueAdds",
    "bedTypes",
    "smokingPreferences"
})
public class RoomRateDetails {

    protected String roomTypeCode;
    protected String rateCode;
    protected Integer maxRoomOccupancy;
    protected Integer quotedRoomOccupancy;
    protected Integer minGuestAge;
    protected String roomDescription;
    protected String promoId;
    protected String promoDescription;
    protected String promoDetailText;
    protected Integer currentAllotment;
    protected Boolean propertyAvailable;
    protected Boolean propertyRestricted;
    protected String expediaPropertyId;
    protected String rateKey;
    protected String rateType;
    protected Boolean nonRefundable;
    @XmlElement(name = "RateInfo")
    protected HotelRateInfo rateInfo;
    @XmlElement(name = "RateInfos")
    protected RateInfos rateInfos;
    @XmlElement(name = "ValueAdds")
    protected ValueAdds valueAdds;
    @XmlElement(name = "BedTypes")
    protected BedTypes bedTypes;
    protected String smokingPreferences;

    /**
     * Obtiene el valor de la propiedad roomTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    /**
     * Define el valor de la propiedad roomTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeCode(String value) {
        this.roomTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad rateCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Define el valor de la propiedad rateCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * Obtiene el valor de la propiedad maxRoomOccupancy.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRoomOccupancy() {
        return maxRoomOccupancy;
    }

    /**
     * Define el valor de la propiedad maxRoomOccupancy.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRoomOccupancy(Integer value) {
        this.maxRoomOccupancy = value;
    }

    /**
     * Obtiene el valor de la propiedad quotedRoomOccupancy.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuotedRoomOccupancy() {
        return quotedRoomOccupancy;
    }

    /**
     * Define el valor de la propiedad quotedRoomOccupancy.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuotedRoomOccupancy(Integer value) {
        this.quotedRoomOccupancy = value;
    }

    /**
     * Obtiene el valor de la propiedad minGuestAge.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinGuestAge() {
        return minGuestAge;
    }

    /**
     * Define el valor de la propiedad minGuestAge.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinGuestAge(Integer value) {
        this.minGuestAge = value;
    }

    /**
     * Obtiene el valor de la propiedad roomDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomDescription() {
        return roomDescription;
    }

    /**
     * Define el valor de la propiedad roomDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomDescription(String value) {
        this.roomDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad promoId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoId() {
        return promoId;
    }

    /**
     * Define el valor de la propiedad promoId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoId(String value) {
        this.promoId = value;
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
     * Obtiene el valor de la propiedad promoDetailText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoDetailText() {
        return promoDetailText;
    }

    /**
     * Define el valor de la propiedad promoDetailText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoDetailText(String value) {
        this.promoDetailText = value;
    }

    /**
     * Obtiene el valor de la propiedad currentAllotment.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentAllotment() {
        return currentAllotment;
    }

    /**
     * Define el valor de la propiedad currentAllotment.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentAllotment(Integer value) {
        this.currentAllotment = value;
    }

    /**
     * Obtiene el valor de la propiedad propertyAvailable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPropertyAvailable() {
        return propertyAvailable;
    }

    /**
     * Define el valor de la propiedad propertyAvailable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPropertyAvailable(Boolean value) {
        this.propertyAvailable = value;
    }

    /**
     * Obtiene el valor de la propiedad propertyRestricted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPropertyRestricted() {
        return propertyRestricted;
    }

    /**
     * Define el valor de la propiedad propertyRestricted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPropertyRestricted(Boolean value) {
        this.propertyRestricted = value;
    }

    /**
     * Obtiene el valor de la propiedad expediaPropertyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpediaPropertyId() {
        return expediaPropertyId;
    }

    /**
     * Define el valor de la propiedad expediaPropertyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpediaPropertyId(String value) {
        this.expediaPropertyId = value;
    }

    /**
     * Obtiene el valor de la propiedad rateKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateKey() {
        return rateKey;
    }

    /**
     * Define el valor de la propiedad rateKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateKey(String value) {
        this.rateKey = value;
    }

    /**
     * Obtiene el valor de la propiedad rateType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateType() {
        return rateType;
    }

    /**
     * Define el valor de la propiedad rateType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateType(String value) {
        this.rateType = value;
    }

    /**
     * Obtiene el valor de la propiedad nonRefundable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonRefundable() {
        return nonRefundable;
    }

    /**
     * Define el valor de la propiedad nonRefundable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonRefundable(Boolean value) {
        this.nonRefundable = value;
    }

    /**
     * Obtiene el valor de la propiedad rateInfo.
     * 
     * @return
     *     possible object is
     *     {@link HotelRateInfo }
     *     
     */
    public HotelRateInfo getRateInfo() {
        return rateInfo;
    }

    /**
     * Define el valor de la propiedad rateInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRateInfo }
     *     
     */
    public void setRateInfo(HotelRateInfo value) {
        this.rateInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad rateInfos.
     * 
     * @return
     *     possible object is
     *     {@link RateInfos }
     *     
     */
    public RateInfos getRateInfos() {
        return rateInfos;
    }

    /**
     * Define el valor de la propiedad rateInfos.
     * 
     * @param value
     *     allowed object is
     *     {@link RateInfos }
     *     
     */
    public void setRateInfos(RateInfos value) {
        this.rateInfos = value;
    }

    /**
     * Obtiene el valor de la propiedad valueAdds.
     * 
     * @return
     *     possible object is
     *     {@link ValueAdds }
     *     
     */
    public ValueAdds getValueAdds() {
        return valueAdds;
    }

    /**
     * Define el valor de la propiedad valueAdds.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueAdds }
     *     
     */
    public void setValueAdds(ValueAdds value) {
        this.valueAdds = value;
    }

    /**
     * Obtiene el valor de la propiedad bedTypes.
     * 
     * @return
     *     possible object is
     *     {@link BedTypes }
     *     
     */
    public BedTypes getBedTypes() {
        return bedTypes;
    }

    /**
     * Define el valor de la propiedad bedTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link BedTypes }
     *     
     */
    public void setBedTypes(BedTypes value) {
        this.bedTypes = value;
    }

    /**
     * Obtiene el valor de la propiedad smokingPreferences.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmokingPreferences() {
        return smokingPreferences;
    }

    /**
     * Define el valor de la propiedad smokingPreferences.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmokingPreferences(String value) {
        this.smokingPreferences = value;
    }

}
