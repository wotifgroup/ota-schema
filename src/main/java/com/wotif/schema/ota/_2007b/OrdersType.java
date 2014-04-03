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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Provides the details of one or more orders.
 * 
 * <p>Java class for OrdersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrdersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Order" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Products" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Product" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                     &lt;attribute name="ProductIssueDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                                     &lt;attribute name="ProductID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                                     &lt;attribute name="ProductType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                                     &lt;attribute name="ProductQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="ProductSerialNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                                     &lt;attribute name="DiscountCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                                     &lt;attribute name="Status">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                           &lt;enumeration value="OrderPending"/>
 *                                           &lt;enumeration value="BackOrder"/>
 *                                           &lt;enumeration value="Unavailable"/>
 *                                           &lt;enumeration value="Confirmed"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="ListOfRecipientRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="OrderType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                 &lt;attribute name="OrderID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                 &lt;attribute name="ListOfRecipientRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="OrderType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="DiscountCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="VendorPurchaseOrderID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *       &lt;attribute name="OrderID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrdersType", propOrder = {
    "orders"
})
public class OrdersType {

    @XmlElement(name = "Order")
    protected List<OrdersType.Order> orders;
    @XmlAttribute(name = "OrderType")
    protected String orderType;
    @XmlAttribute(name = "DiscountCode")
    protected String discountCode;
    @XmlAttribute(name = "VendorPurchaseOrderID")
    protected String vendorPurchaseOrderID;
    @XmlAttribute(name = "OrderID")
    protected String orderID;

    /**
     * Gets the value of the orders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrdersType.Order }
     * 
     * 
     */
    public List<OrdersType.Order> getOrders() {
        if (orders == null) {
            orders = new ArrayList<OrdersType.Order>();
        }
        return this.orders;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the discountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountCode() {
        return discountCode;
    }

    /**
     * Sets the value of the discountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountCode(String value) {
        this.discountCode = value;
    }

    /**
     * Gets the value of the vendorPurchaseOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorPurchaseOrderID() {
        return vendorPurchaseOrderID;
    }

    /**
     * Sets the value of the vendorPurchaseOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorPurchaseOrderID(String value) {
        this.vendorPurchaseOrderID = value;
    }

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
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
     *         &lt;element name="Products" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Product" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                           &lt;attribute name="ProductIssueDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *                           &lt;attribute name="ProductID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *                           &lt;attribute name="ProductType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *                           &lt;attribute name="ProductQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;attribute name="ProductSerialNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *                           &lt;attribute name="DiscountCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                           &lt;attribute name="Status">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                                 &lt;enumeration value="OrderPending"/>
     *                                 &lt;enumeration value="BackOrder"/>
     *                                 &lt;enumeration value="Unavailable"/>
     *                                 &lt;enumeration value="Confirmed"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="ListOfRecipientRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="OrderType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *       &lt;attribute name="OrderID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *       &lt;attribute name="ListOfRecipientRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "products"
    })
    public static class Order {

        @XmlElement(name = "Products")
        protected OrdersType.Order.Products products;
        @XmlAttribute(name = "OrderType")
        protected String orderType;
        @XmlAttribute(name = "OrderID")
        protected String orderID;
        @XmlAttribute(name = "ListOfRecipientRPH")
        protected List<String> listOfRecipientRPHs;

        /**
         * Gets the value of the products property.
         * 
         * @return
         *     possible object is
         *     {@link OrdersType.Order.Products }
         *     
         */
        public OrdersType.Order.Products getProducts() {
            return products;
        }

        /**
         * Sets the value of the products property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrdersType.Order.Products }
         *     
         */
        public void setProducts(OrdersType.Order.Products value) {
            this.products = value;
        }

        /**
         * Gets the value of the orderType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderType() {
            return orderType;
        }

        /**
         * Sets the value of the orderType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderType(String value) {
            this.orderType = value;
        }

        /**
         * Gets the value of the orderID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderID() {
            return orderID;
        }

        /**
         * Sets the value of the orderID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderID(String value) {
            this.orderID = value;
        }

        /**
         * Gets the value of the listOfRecipientRPHs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listOfRecipientRPHs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getListOfRecipientRPHs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getListOfRecipientRPHs() {
            if (listOfRecipientRPHs == null) {
                listOfRecipientRPHs = new ArrayList<String>();
            }
            return this.listOfRecipientRPHs;
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
         *         &lt;element name="Product" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *                 &lt;attribute name="ProductIssueDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *                 &lt;attribute name="ProductID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
         *                 &lt;attribute name="ProductType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
         *                 &lt;attribute name="ProductQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;attribute name="ProductSerialNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
         *                 &lt;attribute name="DiscountCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *                 &lt;attribute name="Status">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *                       &lt;enumeration value="OrderPending"/>
         *                       &lt;enumeration value="BackOrder"/>
         *                       &lt;enumeration value="Unavailable"/>
         *                       &lt;enumeration value="Confirmed"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="ListOfRecipientRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "products"
        })
        public static class Products {

            @XmlElement(name = "Product")
            protected List<OrdersType.Order.Products.Product> products;

            /**
             * Gets the value of the products property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the products property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProducts().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OrdersType.Order.Products.Product }
             * 
             * 
             */
            public List<OrdersType.Order.Products.Product> getProducts() {
                if (products == null) {
                    products = new ArrayList<OrdersType.Order.Products.Product>();
                }
                return this.products;
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
             *       &lt;attribute name="ProductIssueDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
             *       &lt;attribute name="ProductID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
             *       &lt;attribute name="ProductType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
             *       &lt;attribute name="ProductQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="ProductSerialNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
             *       &lt;attribute name="DiscountCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
             *       &lt;attribute name="Status">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
             *             &lt;enumeration value="OrderPending"/>
             *             &lt;enumeration value="BackOrder"/>
             *             &lt;enumeration value="Unavailable"/>
             *             &lt;enumeration value="Confirmed"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="ListOfRecipientRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Product {

                @XmlAttribute(name = "ProductIssueDate")
                protected String productIssueDate;
                @XmlAttribute(name = "ProductID")
                protected String productID;
                @XmlAttribute(name = "ProductType")
                protected String productType;
                @XmlAttribute(name = "ProductQuantity")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger productQuantity;
                @XmlAttribute(name = "ProductSerialNumber")
                protected String productSerialNumber;
                @XmlAttribute(name = "DiscountCode")
                protected String discountCode;
                @XmlAttribute(name = "Status")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String status;
                @XmlAttribute(name = "ListOfRecipientRPH")
                protected List<String> listOfRecipientRPHs;
                @XmlAttribute(name = "Amount")
                protected BigDecimal amount;
                @XmlAttribute(name = "CurrencyCode")
                protected String currencyCode;
                @XmlAttribute(name = "DecimalPlaces")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger decimalPlaces;

                /**
                 * Gets the value of the productIssueDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProductIssueDate() {
                    return productIssueDate;
                }

                /**
                 * Sets the value of the productIssueDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProductIssueDate(String value) {
                    this.productIssueDate = value;
                }

                /**
                 * Gets the value of the productID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProductID() {
                    return productID;
                }

                /**
                 * Sets the value of the productID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProductID(String value) {
                    this.productID = value;
                }

                /**
                 * Gets the value of the productType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProductType() {
                    return productType;
                }

                /**
                 * Sets the value of the productType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProductType(String value) {
                    this.productType = value;
                }

                /**
                 * Gets the value of the productQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getProductQuantity() {
                    return productQuantity;
                }

                /**
                 * Sets the value of the productQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setProductQuantity(BigInteger value) {
                    this.productQuantity = value;
                }

                /**
                 * Gets the value of the productSerialNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProductSerialNumber() {
                    return productSerialNumber;
                }

                /**
                 * Sets the value of the productSerialNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProductSerialNumber(String value) {
                    this.productSerialNumber = value;
                }

                /**
                 * Gets the value of the discountCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDiscountCode() {
                    return discountCode;
                }

                /**
                 * Sets the value of the discountCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDiscountCode(String value) {
                    this.discountCode = value;
                }

                /**
                 * Gets the value of the status property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatus() {
                    return status;
                }

                /**
                 * Sets the value of the status property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatus(String value) {
                    this.status = value;
                }

                /**
                 * Gets the value of the listOfRecipientRPHs property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the listOfRecipientRPHs property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getListOfRecipientRPHs().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getListOfRecipientRPHs() {
                    if (listOfRecipientRPHs == null) {
                        listOfRecipientRPHs = new ArrayList<String>();
                    }
                    return this.listOfRecipientRPHs;
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

        }

    }

}