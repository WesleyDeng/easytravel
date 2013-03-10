
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HotelImage complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HotelImage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hotelImageId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="caption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thumbnailUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplierId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="byteSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelImage", propOrder = {
    "hotelImageId",
    "name",
    "category",
    "type",
    "caption",
    "url",
    "thumbnailUrl",
    "supplierId",
    "width",
    "height",
    "byteSize"
})
public class HotelImage {

    protected long hotelImageId;
    protected String name;
    protected int category;
    protected int type;
    protected String caption;
    protected String url;
    protected String thumbnailUrl;
    protected long supplierId;
    protected long width;
    protected long height;
    protected long byteSize;

    /**
     * Obtiene el valor de la propiedad hotelImageId.
     * 
     */
    public long getHotelImageId() {
        return hotelImageId;
    }

    /**
     * Define el valor de la propiedad hotelImageId.
     * 
     */
    public void setHotelImageId(long value) {
        this.hotelImageId = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad category.
     * 
     */
    public int getCategory() {
        return category;
    }

    /**
     * Define el valor de la propiedad category.
     * 
     */
    public void setCategory(int value) {
        this.category = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad caption.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Define el valor de la propiedad caption.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

    /**
     * Obtiene el valor de la propiedad url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Define el valor de la propiedad url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Obtiene el valor de la propiedad thumbnailUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    /**
     * Define el valor de la propiedad thumbnailUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnailUrl(String value) {
        this.thumbnailUrl = value;
    }

    /**
     * Obtiene el valor de la propiedad supplierId.
     * 
     */
    public long getSupplierId() {
        return supplierId;
    }

    /**
     * Define el valor de la propiedad supplierId.
     * 
     */
    public void setSupplierId(long value) {
        this.supplierId = value;
    }

    /**
     * Obtiene el valor de la propiedad width.
     * 
     */
    public long getWidth() {
        return width;
    }

    /**
     * Define el valor de la propiedad width.
     * 
     */
    public void setWidth(long value) {
        this.width = value;
    }

    /**
     * Obtiene el valor de la propiedad height.
     * 
     */
    public long getHeight() {
        return height;
    }

    /**
     * Define el valor de la propiedad height.
     * 
     */
    public void setHeight(long value) {
        this.height = value;
    }

    /**
     * Obtiene el valor de la propiedad byteSize.
     * 
     */
    public long getByteSize() {
        return byteSize;
    }

    /**
     * Define el valor de la propiedad byteSize.
     * 
     */
    public void setByteSize(long value) {
        this.byteSize = value;
    }

}
