//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.03 at 03:33:27 PM EST 
//


package com.wotif.schema.ota._2007b;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Holds a base fare, tax, total and currency information on a price
 * 
 * <p>Java class for FareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseFare" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EquivFare" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Taxes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Fees" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Fee" type="{http://www.opentravel.org/OTA/2003/05}AirFeeType" maxOccurs="9"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TotalFare" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareConstruction" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="FormattedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
 *                 &lt;attribute name="OriginCityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                 &lt;attribute name="OriginCodeContext" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                 &lt;attribute name="DestinationCityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                 &lt;attribute name="DestinationCodeContext" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UnstructuredFareCalc" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength1to128">
 *                 &lt;attribute name="FareCalcMode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}NegotiatedFareAttributes"/>
 *       &lt;attribute name="TicketDesignatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="TotalNbrTrips" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *       &lt;attribute name="TotalNbrPTC" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareType", propOrder = {
    "baseFare",
    "equivFare",
    "taxes",
    "fees",
    "totalFare",
    "fareConstruction",
    "unstructuredFareCalc",
    "tpaExtensions"
})
public class FareType {

    @XmlElement(name = "BaseFare")
    protected FareType.BaseFare baseFare;
    @XmlElement(name = "EquivFare")
    protected FareType.EquivFare equivFare;
    @XmlElement(name = "Taxes")
    protected FareType.Taxes taxes;
    @XmlElement(name = "Fees")
    protected FareType.Fees fees;
    @XmlElement(name = "TotalFare")
    protected FareType.TotalFare totalFare;
    @XmlElement(name = "FareConstruction")
    protected FareType.FareConstruction fareConstruction;
    @XmlElement(name = "UnstructuredFareCalc")
    protected FareType.UnstructuredFareCalc unstructuredFareCalc;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensions tpaExtensions;
    @XmlAttribute(name = "TicketDesignatorCode")
    protected String ticketDesignatorCode;
    @XmlAttribute(name = "TotalNbrTrips")
    protected Integer totalNbrTrips;
    @XmlAttribute(name = "TotalNbrPTC")
    protected Integer totalNbrPTC;
    @XmlAttribute(name = "NegotiatedFare")
    protected Boolean negotiatedFare;
    @XmlAttribute(name = "NegotiatedFareCode")
    protected String negotiatedFareCode;

    /**
     * Gets the value of the baseFare property.
     * 
     * @return
     *     possible object is
     *     {@link FareType.BaseFare }
     *     
     */
    public FareType.BaseFare getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType.BaseFare }
     *     
     */
    public void setBaseFare(FareType.BaseFare value) {
        this.baseFare = value;
    }

    /**
     * Gets the value of the equivFare property.
     * 
     * @return
     *     possible object is
     *     {@link FareType.EquivFare }
     *     
     */
    public FareType.EquivFare getEquivFare() {
        return equivFare;
    }

    /**
     * Sets the value of the equivFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType.EquivFare }
     *     
     */
    public void setEquivFare(FareType.EquivFare value) {
        this.equivFare = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link FareType.Taxes }
     *     
     */
    public FareType.Taxes getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType.Taxes }
     *     
     */
    public void setTaxes(FareType.Taxes value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link FareType.Fees }
     *     
     */
    public FareType.Fees getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType.Fees }
     *     
     */
    public void setFees(FareType.Fees value) {
        this.fees = value;
    }

    /**
     * Gets the value of the totalFare property.
     * 
     * @return
     *     possible object is
     *     {@link FareType.TotalFare }
     *     
     */
    public FareType.TotalFare getTotalFare() {
        return totalFare;
    }

    /**
     * Sets the value of the totalFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType.TotalFare }
     *     
     */
    public void setTotalFare(FareType.TotalFare value) {
        this.totalFare = value;
    }

    /**
     * Gets the value of the fareConstruction property.
     * 
     * @return
     *     possible object is
     *     {@link FareType.FareConstruction }
     *     
     */
    public FareType.FareConstruction getFareConstruction() {
        return fareConstruction;
    }

    /**
     * Sets the value of the fareConstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType.FareConstruction }
     *     
     */
    public void setFareConstruction(FareType.FareConstruction value) {
        this.fareConstruction = value;
    }

    /**
     * Gets the value of the unstructuredFareCalc property.
     * 
     * @return
     *     possible object is
     *     {@link FareType.UnstructuredFareCalc }
     *     
     */
    public FareType.UnstructuredFareCalc getUnstructuredFareCalc() {
        return unstructuredFareCalc;
    }

    /**
     * Sets the value of the unstructuredFareCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType.UnstructuredFareCalc }
     *     
     */
    public void setUnstructuredFareCalc(FareType.UnstructuredFareCalc value) {
        this.unstructuredFareCalc = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensions }
     *     
     */
    public TPAExtensions getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensions }
     *     
     */
    public void setTPAExtensions(TPAExtensions value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the ticketDesignatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketDesignatorCode() {
        return ticketDesignatorCode;
    }

    /**
     * Sets the value of the ticketDesignatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketDesignatorCode(String value) {
        this.ticketDesignatorCode = value;
    }

    /**
     * Gets the value of the totalNbrTrips property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNbrTrips() {
        return totalNbrTrips;
    }

    /**
     * Sets the value of the totalNbrTrips property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNbrTrips(Integer value) {
        this.totalNbrTrips = value;
    }

    /**
     * Gets the value of the totalNbrPTC property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNbrPTC() {
        return totalNbrPTC;
    }

    /**
     * Sets the value of the totalNbrPTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNbrPTC(Integer value) {
        this.totalNbrPTC = value;
    }

    /**
     * Gets the value of the negotiatedFare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNegotiatedFare() {
        if (negotiatedFare == null) {
            return false;
        } else {
            return negotiatedFare;
        }
    }

    /**
     * Sets the value of the negotiatedFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegotiatedFare(Boolean value) {
        this.negotiatedFare = value;
    }

    /**
     * Gets the value of the negotiatedFareCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegotiatedFareCode() {
        return negotiatedFareCode;
    }

    /**
     * Sets the value of the negotiatedFareCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegotiatedFareCode(String value) {
        this.negotiatedFareCode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BaseFare {

        @XmlAttribute(name = "FromCurrency")
        protected String fromCurrency;
        @XmlAttribute(name = "ToCurrency")
        protected String toCurrency;
        @XmlAttribute(name = "Rate")
        protected BigDecimal rate;
        @XmlAttribute(name = "Date")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;

        /**
         * Gets the value of the fromCurrency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFromCurrency() {
            return fromCurrency;
        }

        /**
         * Sets the value of the fromCurrency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFromCurrency(String value) {
            this.fromCurrency = value;
        }

        /**
         * Gets the value of the toCurrency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToCurrency() {
            return toCurrency;
        }

        /**
         * Sets the value of the toCurrency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToCurrency(String value) {
            this.toCurrency = value;
        }

        /**
         * Gets the value of the rate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRate() {
            return rate;
        }

        /**
         * Sets the value of the rate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRate(BigDecimal value) {
            this.rate = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

        /**
         * Gets the value of the decimalPlaces property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDecimalPlaces() {
            return decimalPlaces;
        }

        /**
         * Sets the value of the decimalPlaces property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDecimalPlaces(BigInteger value) {
            this.decimalPlaces = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EquivFare {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

        /**
         * Gets the value of the decimalPlaces property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDecimalPlaces() {
            return decimalPlaces;
        }

        /**
         * Sets the value of the decimalPlaces property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDecimalPlaces(BigInteger value) {
            this.decimalPlaces = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="FormattedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
     *       &lt;attribute name="OriginCityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *       &lt;attribute name="OriginCodeContext" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *       &lt;attribute name="DestinationCityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *       &lt;attribute name="DestinationCodeContext" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FareConstruction {

        @XmlAttribute(name = "FormattedIndicator")
        protected Boolean formattedIndicator;
        @XmlAttribute(name = "Language")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected String language;
        @XmlAttribute(name = "OriginCityCode")
        protected String originCityCode;
        @XmlAttribute(name = "OriginCodeContext")
        protected String originCodeContext;
        @XmlAttribute(name = "DestinationCityCode")
        protected String destinationCityCode;
        @XmlAttribute(name = "DestinationCodeContext")
        protected String destinationCodeContext;

        /**
         * Gets the value of the formattedIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFormattedIndicator() {
            return formattedIndicator;
        }

        /**
         * Sets the value of the formattedIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFormattedIndicator(Boolean value) {
            this.formattedIndicator = value;
        }

        /**
         * Gets the value of the language property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguage() {
            return language;
        }

        /**
         * Sets the value of the language property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguage(String value) {
            this.language = value;
        }

        /**
         * Gets the value of the originCityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginCityCode() {
            return originCityCode;
        }

        /**
         * Sets the value of the originCityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginCityCode(String value) {
            this.originCityCode = value;
        }

        /**
         * Gets the value of the originCodeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginCodeContext() {
            return originCodeContext;
        }

        /**
         * Sets the value of the originCodeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginCodeContext(String value) {
            this.originCodeContext = value;
        }

        /**
         * Gets the value of the destinationCityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestinationCityCode() {
            return destinationCityCode;
        }

        /**
         * Sets the value of the destinationCityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestinationCityCode(String value) {
            this.destinationCityCode = value;
        }

        /**
         * Gets the value of the destinationCodeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestinationCodeContext() {
            return destinationCodeContext;
        }

        /**
         * Sets the value of the destinationCodeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestinationCodeContext(String value) {
            this.destinationCodeContext = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Fee" type="{http://www.opentravel.org/OTA/2003/05}AirFeeType" maxOccurs="9"/>
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
        "fees"
    })
    public static class Fees {

        @XmlElement(name = "Fee", required = true)
        protected List<AirFeeType> fees;

        /**
         * Gets the value of the fees property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fees property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFees().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirFeeType }
         * 
         * 
         */
        public List<AirFeeType> getFees() {
            if (fees == null) {
                fees = new ArrayList<AirFeeType>();
            }
            return this.fees;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99"/>
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
        "taxes"
    })
    public static class Taxes {

        @XmlElement(name = "Tax", required = true)
        protected List<AirTaxType> taxes;

        /**
         * Gets the value of the taxes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirTaxType }
         * 
         * 
         */
        public List<AirTaxType> getTaxes() {
            if (taxes == null) {
                taxes = new ArrayList<AirTaxType>();
            }
            return this.taxes;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TotalFare {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

        /**
         * Gets the value of the decimalPlaces property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDecimalPlaces() {
            return decimalPlaces;
        }

        /**
         * Sets the value of the decimalPlaces property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDecimalPlaces(BigInteger value) {
            this.decimalPlaces = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength1to128">
     *       &lt;attribute name="FareCalcMode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class UnstructuredFareCalc {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "FareCalcMode")
        protected String fareCalcMode;

        /**
         * Used for Character Strings, length 1 to 128
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the fareCalcMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareCalcMode() {
            return fareCalcMode;
        }

        /**
         * Sets the value of the fareCalcMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareCalcMode(String value) {
            this.fareCalcMode = value;
        }

    }

}