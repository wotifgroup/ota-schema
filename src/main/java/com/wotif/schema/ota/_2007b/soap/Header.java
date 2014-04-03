package com.wotif.schema.ota._2007b.soap;

import javax.xml.bind.annotation.XmlElement;

public class Header {

    @XmlElement(namespace = "http://www.opentravel.org/OTA/2003/05")
    private ServiceHeader serviceHeader;

    public Header() {
    }

    public Header(ServiceHeader serviceHeader) {
        this.serviceHeader = serviceHeader;
    }

    public ServiceHeader getServiceHeader() {
        return serviceHeader;
    }

}