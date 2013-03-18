
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SetAlertResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SetAlertResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SetAlertResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetAlertResults", propOrder = {
    "setAlertResult"
})
public class SetAlertResults {

    @XmlElement(name = "SetAlertResult")
    protected int setAlertResult;

    /**
     * Obtiene el valor de la propiedad setAlertResult.
     * 
     */
    public int getSetAlertResult() {
        return setAlertResult;
    }

    /**
     * Define el valor de la propiedad setAlertResult.
     * 
     */
    public void setSetAlertResult(int value) {
        this.setAlertResult = value;
    }

}
