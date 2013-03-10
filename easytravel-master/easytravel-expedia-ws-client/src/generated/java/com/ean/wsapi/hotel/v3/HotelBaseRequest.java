
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HotelBaseRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HotelBaseRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="minorRev" type="{http://v3.hotel.wsapi.ean.com/}HotelMinorRevType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelBaseRequest", propOrder = {
    "minorRev"
})
@XmlSeeAlso({
    HotelInformationRequest.class,
    HotelRateRulesRequest.class,
    HotelListRequest.class,
    HotelRoomReservationRequest.class,
    HotelRoomImageRequest.class,
    HotelRoomAvailabilityRequest.class,
    HotelItineraryRequest.class,
    AlternatePropertyListRequest.class,
    HotelRoomCancellationRequest.class,
    PingRequest.class,
    LocationInfoRequest.class,
    HotelPaymentRequest.class
})
public abstract class HotelBaseRequest
    extends BaseRequest
{

    protected Integer minorRev;

    /**
     * Obtiene el valor de la propiedad minorRev.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinorRev() {
        return minorRev;
    }

    /**
     * Define el valor de la propiedad minorRev.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinorRev(Integer value) {
        this.minorRev = value;
    }

}
