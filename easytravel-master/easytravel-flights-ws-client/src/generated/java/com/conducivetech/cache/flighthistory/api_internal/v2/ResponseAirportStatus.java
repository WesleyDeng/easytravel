
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para responseAirportStatus complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="responseAirportStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}flightStatusesResponse">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestAirportStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseAirportStatus", propOrder = {
    "request"
})
public class ResponseAirportStatus
    extends FlightStatusesResponse
{

    protected RequestAirportStatus request;

    /**
     * Obtiene el valor de la propiedad request.
     * 
     * @return
     *     possible object is
     *     {@link RequestAirportStatus }
     *     
     */
    public RequestAirportStatus getRequest() {
        return request;
    }

    /**
     * Define el valor de la propiedad request.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestAirportStatus }
     *     
     */
    public void setRequest(RequestAirportStatus value) {
        this.request = value;
    }

}
