
package com.armandorv.easytravel.usersws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para flightBooking complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="flightBooking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destiny" type="{http://armandorv.com/easytravel/usersws}destiny" minOccurs="0"/>
 *         &lt;element name="flightInfo" type="{http://armandorv.com/easytravel/usersws}flightInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightBooking", propOrder = {
    "destiny",
    "flightInfo"
})
public class FlightBooking {

    protected Destiny destiny;
    protected FlightInfo flightInfo;

    /**
     * Obtiene el valor de la propiedad destiny.
     * 
     * @return
     *     possible object is
     *     {@link Destiny }
     *     
     */
    public Destiny getDestiny() {
        return destiny;
    }

    /**
     * Define el valor de la propiedad destiny.
     * 
     * @param value
     *     allowed object is
     *     {@link Destiny }
     *     
     */
    public void setDestiny(Destiny value) {
        this.destiny = value;
    }

    /**
     * Obtiene el valor de la propiedad flightInfo.
     * 
     * @return
     *     possible object is
     *     {@link FlightInfo }
     *     
     */
    public FlightInfo getFlightInfo() {
        return flightInfo;
    }

    /**
     * Define el valor de la propiedad flightInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightInfo }
     *     
     */
    public void setFlightInfo(FlightInfo value) {
        this.flightInfo = value;
    }

}
