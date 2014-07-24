package com.wotif.schema.ota._2007b.soap;

import javax.xml.bind.annotation.XmlElement;

public class Header {

    @XmlElement(namespace = "http://www.opentravel.org/OTA/2003/05")
    private ServiceHeader serviceHeader;

    @XmlElement(name = "Security", namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd")
    private Security security;

    public Header() {
    }

    public Header(ServiceHeader serviceHeader) {
        this.serviceHeader = serviceHeader;
    }

    public Header(ServiceHeader serviceHeader, Security security) {
        this.serviceHeader = serviceHeader;
        this.security = security;
    }

    public ServiceHeader getServiceHeader() {
        return serviceHeader;
    }

    public Security getSecurity() {
        return security;
    }

}