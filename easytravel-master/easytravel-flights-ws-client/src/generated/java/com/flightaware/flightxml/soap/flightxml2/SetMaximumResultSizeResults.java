
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SetMaximumResultSizeResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SetMaximumResultSizeResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SetMaximumResultSizeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetMaximumResultSizeResults", propOrder = {
    "setMaximumResultSizeResult"
})
public class SetMaximumResultSizeResults {

    @XmlElement(name = "SetMaximumResultSizeResult")
    protected int setMaximumResultSizeResult;

    /**
     * Obtiene el valor de la propiedad setMaximumResultSizeResult.
     * 
     */
    public int getSetMaximumResultSizeResult() {
        return setMaximumResultSizeResult;
    }

    /**
     * Define el valor de la propiedad setMaximumResultSizeResult.
     * 
     */
    public void setSetMaximumResultSizeResult(int value) {
        this.setMaximumResultSizeResult = value;
    }

}
