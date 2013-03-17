
package net.restfulwebservices.servicecontracts._2008._01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import net.restfulwebservices.datacontracts._2008._01.Airport;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetDetailsByAirportNameResult" type="{http://www.restfulwebservices.net/DataContracts/2008/01}Airport" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getDetailsByAirportNameResult"
})
@XmlRootElement(name = "GetDetailsByAirportNameResponse")
public class GetDetailsByAirportNameResponse {

    @XmlElementRef(name = "GetDetailsByAirportNameResult", namespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Airport> getDetailsByAirportNameResult;

    /**
     * Obtiene el valor de la propiedad getDetailsByAirportNameResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Airport }{@code >}
     *     
     */
    public JAXBElement<Airport> getGetDetailsByAirportNameResult() {
        return getDetailsByAirportNameResult;
    }

    /**
     * Define el valor de la propiedad getDetailsByAirportNameResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Airport }{@code >}
     *     
     */
    public void setGetDetailsByAirportNameResult(JAXBElement<Airport> value) {
        this.getDetailsByAirportNameResult = value;
    }

}
