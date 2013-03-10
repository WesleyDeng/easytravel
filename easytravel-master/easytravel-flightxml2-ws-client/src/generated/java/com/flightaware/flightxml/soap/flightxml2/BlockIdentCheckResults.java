
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BlockIdentCheckResults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BlockIdentCheckResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BlockIdentCheckResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlockIdentCheckResults", propOrder = {
    "blockIdentCheckResult"
})
public class BlockIdentCheckResults {

    @XmlElement(name = "BlockIdentCheckResult")
    protected int blockIdentCheckResult;

    /**
     * Obtiene el valor de la propiedad blockIdentCheckResult.
     * 
     */
    public int getBlockIdentCheckResult() {
        return blockIdentCheckResult;
    }

    /**
     * Define el valor de la propiedad blockIdentCheckResult.
     * 
     */
    public void setBlockIdentCheckResult(int value) {
        this.blockIdentCheckResult = value;
    }

}
