
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RegisterAlertEndpointResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegisterAlertEndpointResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegisterAlertEndpointResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterAlertEndpointResults", propOrder = {
    "registerAlertEndpointResult"
})
public class RegisterAlertEndpointResults {

    @XmlElement(name = "RegisterAlertEndpointResult")
    protected int registerAlertEndpointResult;

    /**
     * Obtiene el valor de la propiedad registerAlertEndpointResult.
     * 
     */
    public int getRegisterAlertEndpointResult() {
        return registerAlertEndpointResult;
    }

    /**
     * Define el valor de la propiedad registerAlertEndpointResult.
     * 
     */
    public void setRegisterAlertEndpointResult(int value) {
        this.registerAlertEndpointResult = value;
    }

}
