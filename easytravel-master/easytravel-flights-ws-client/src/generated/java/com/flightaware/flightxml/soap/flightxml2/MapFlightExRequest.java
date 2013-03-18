
package com.flightaware.flightxml.soap.flightxml2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MapFlightExRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MapFlightExRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faFlightID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mapHeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mapWidth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="layer_on" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="layer_off" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="show_data_blocks" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="show_airports" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="airports_expand_view" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="latlon_box" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapFlightExRequest", propOrder = {
    "faFlightID",
    "mapHeight",
    "mapWidth",
    "layerOn",
    "layerOff",
    "showDataBlocks",
    "showAirports",
    "airportsExpandView",
    "latlonBox"
})
public class MapFlightExRequest {

    @XmlElement(required = true)
    protected String faFlightID;
    protected int mapHeight;
    protected int mapWidth;
    @XmlElement(name = "layer_on", required = true)
    protected List<String> layerOn;
    @XmlElement(name = "layer_off", required = true)
    protected List<String> layerOff;
    @XmlElement(name = "show_data_blocks")
    protected boolean showDataBlocks;
    @XmlElement(name = "show_airports")
    protected boolean showAirports;
    @XmlElement(name = "airports_expand_view")
    protected boolean airportsExpandView;
    @XmlElement(name = "latlon_box", type = Float.class)
    protected List<Float> latlonBox;

    /**
     * Obtiene el valor de la propiedad faFlightID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaFlightID() {
        return faFlightID;
    }

    /**
     * Define el valor de la propiedad faFlightID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaFlightID(String value) {
        this.faFlightID = value;
    }

    /**
     * Obtiene el valor de la propiedad mapHeight.
     * 
     */
    public int getMapHeight() {
        return mapHeight;
    }

    /**
     * Define el valor de la propiedad mapHeight.
     * 
     */
    public void setMapHeight(int value) {
        this.mapHeight = value;
    }

    /**
     * Obtiene el valor de la propiedad mapWidth.
     * 
     */
    public int getMapWidth() {
        return mapWidth;
    }

    /**
     * Define el valor de la propiedad mapWidth.
     * 
     */
    public void setMapWidth(int value) {
        this.mapWidth = value;
    }

    /**
     * Gets the value of the layerOn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layerOn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayerOn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLayerOn() {
        if (layerOn == null) {
            layerOn = new ArrayList<String>();
        }
        return this.layerOn;
    }

    /**
     * Gets the value of the layerOff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layerOff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayerOff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLayerOff() {
        if (layerOff == null) {
            layerOff = new ArrayList<String>();
        }
        return this.layerOff;
    }

    /**
     * Obtiene el valor de la propiedad showDataBlocks.
     * 
     */
    public boolean isShowDataBlocks() {
        return showDataBlocks;
    }

    /**
     * Define el valor de la propiedad showDataBlocks.
     * 
     */
    public void setShowDataBlocks(boolean value) {
        this.showDataBlocks = value;
    }

    /**
     * Obtiene el valor de la propiedad showAirports.
     * 
     */
    public boolean isShowAirports() {
        return showAirports;
    }

    /**
     * Define el valor de la propiedad showAirports.
     * 
     */
    public void setShowAirports(boolean value) {
        this.showAirports = value;
    }

    /**
     * Obtiene el valor de la propiedad airportsExpandView.
     * 
     */
    public boolean isAirportsExpandView() {
        return airportsExpandView;
    }

    /**
     * Define el valor de la propiedad airportsExpandView.
     * 
     */
    public void setAirportsExpandView(boolean value) {
        this.airportsExpandView = value;
    }

    /**
     * Gets the value of the latlonBox property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the latlonBox property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLatlonBox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getLatlonBox() {
        if (latlonBox == null) {
            latlonBox = new ArrayList<Float>();
        }
        return this.latlonBox;
    }

}
