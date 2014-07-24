@XmlSchema(
        namespace = "http://schemas.xmlsoap.org/soap/envelope/",
        elementFormDefault = XmlNsForm.QUALIFIED,
        xmlns = {
                @XmlNs(namespaceURI = "http://schemas.xmlsoap.org/soap/envelope/", prefix = "SOAP-ENV"),
                @XmlNs(namespaceURI = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", prefix = "wsse")
        })
@XmlAccessorType(XmlAccessType.FIELD)
package com.wotif.schema.ota._2007b.soap;

import javax.xml.bind.annotation.*;