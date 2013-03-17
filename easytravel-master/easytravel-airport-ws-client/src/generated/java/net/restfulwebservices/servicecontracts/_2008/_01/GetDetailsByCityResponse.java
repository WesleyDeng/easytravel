
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
 *         &lt;element name="GetDetailsByCityResult" type="{http://www.restfulwebservices.net/DataContracts/2008/01}Airport" minOccurs="0"/>
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
    "getDetailsByCityResult"
})
@XmlRootElement(name = "GetDetailsByCityResponse")
public class GetDetailsByCityResponse {

    @XmlElementRef(name = "GetDetailsByCityResult", namespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Airport> getDetailsByCityResult;

    /**
     * Obtiene el valor de la propiedad getDetailsByCityResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Airport }{@code >}
     *     
     */
    public JAXBElement<Airport> getGetDetailsByCityResult() {
        return getDetailsByCityResult;
    }

    /**
     * Define el valor de la propiedad getDetailsByCityResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Airport }{@code >}
     *     
     */
    public void setGetDetailsByCityResult(JAXBElement<Airport> value) {
        this.getDetailsByCityResult = value;
    }

}
