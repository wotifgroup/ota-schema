@XmlSchema(
        namespace = "http://schemas.xmlsoap.org/soap/envelope/",
        elementFormDefault = XmlNsForm.QUALIFIED,
        xmlns = {
                @XmlNs(namespaceURI = "http://schemas.xmlsoap.org/soap/envelope/", prefix = "SOAP-ENV")
        })
@XmlAccessorType(XmlAccessType.FIELD)
package com.wotif.schema.ota._2007b.soap;

import javax.xml.bind.annotation.*;