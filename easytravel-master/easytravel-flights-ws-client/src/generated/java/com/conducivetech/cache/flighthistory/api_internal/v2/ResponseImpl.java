
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para responseImpl complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="responseImpl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="error" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}apiResponseError" minOccurs="0"/>
 *         &lt;element name="appendix" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}appendices" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseImpl", propOrder = {
    "error",
    "appendix"
})
@XmlSeeAlso({
    FlightTracksResponse.class,
    FlightStatusesResponse.class
})
public abstract class ResponseImpl {

    protected ApiResponseError error;
    protected Appendices appendix;

    /**
     * Obtiene el valor de la propiedad error.
     * 
     * @return
     *     possible object is
     *     {@link ApiResponseError }
     *     
     */
    public ApiResponseError getError() {
        return error;
    }

    /**
     * Define el valor de la propiedad error.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiResponseError }
     *     
     */
    public void setError(ApiResponseError value) {
        this.error = value;
    }

    /**
     * Obtiene el valor de la propiedad appendix.
     * 
     * @return
     *     possible object is
     *     {@link Appendices }
     *     
     */
    public Appendices getAppendix() {
        return appendix;
    }

    /**
     * Define el valor de la propiedad appendix.
     * 
     * @param value
     *     allowed object is
     *     {@link Appendices }
     *     
     */
    public void setAppendix(Appendices value) {
        this.appendix = value;
    }

}
