//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.03 at 03:33:27 PM EST 
//


package com.wotif.schema.ota._2007b;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies passenger(s) who will travel on the reservation.
 * 
 * <p>Java class for TravelerInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelerInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirTraveler" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirTravelerType">
 *                 &lt;sequence>
 *                   &lt;element name="Comment" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FormattedTextTextType">
 *                           &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpecialReqDetails" type="{http://www.opentravel.org/OTA/2003/05}SpecialReqDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelerInfoType", propOrder = {
    "airTravelers",
    "specialReqDetails"
})
public class TravelerInfoType {

    @XmlElement(name = "AirTraveler")
    protected List<TravelerInfoType.AirTraveler> airTravelers;
    @XmlElement(name = "SpecialReqDetails")
    protected List<SpecialReqDetailsType> specialReqDetails;

    /**
     * Gets the value of the airTravelers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airTravelers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirTravelers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelerInfoType.AirTraveler }
     * 
     * 
     */
    public List<TravelerInfoType.AirTraveler> getAirTravelers() {
        if (airTravelers == null) {
            airTravelers = new ArrayList<TravelerInfoType.AirTraveler>();
        }
        return this.airTravelers;
    }

    /**
     * Gets the value of the specialReqDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialReqDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialReqDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialReqDetailsType }
     * 
     * 
     */
    public List<SpecialReqDetailsType> getSpecialReqDetails() {
        if (specialReqDetails == null) {
            specialReqDetails = new ArrayList<SpecialReqDetailsType>();
        }
        return this.specialReqDetails;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirTravelerType">
     *       &lt;sequence>
     *         &lt;element name="Comment" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FormattedTextTextType">
     *                 &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "comments"
    })
    public static class AirTraveler
        extends AirTravelerType
    {

        @XmlElement(name = "Comment")
        protected List<TravelerInfoType.AirTraveler.Comment> comments;

        /**
         * Gets the value of the comments property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the comments property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComments().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TravelerInfoType.AirTraveler.Comment }
         * 
         * 
         */
        public List<TravelerInfoType.AirTraveler.Comment> getComments() {
            if (comments == null) {
                comments = new ArrayList<TravelerInfoType.AirTraveler.Comment>();
            }
            return this.comments;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FormattedTextTextType">
         *       &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Comment
            extends FormattedTextTextType
        {

            @XmlAttribute(name = "Name")
            protected String name;

            /**
             * Gets the value of the name property.
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
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

        }

    }

}
