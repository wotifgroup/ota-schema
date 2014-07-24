package com.wotif.schema.ota._2007b.soap;


import javax.xml.bind.annotation.XmlElement;

public class Fault {

    @XmlElement(name = "faultcode", namespace = "")
    private String faultCode;

    @XmlElement(name = "faultstring", namespace = "")
    private String faultString;

    public Fault() {
    }

    public Fault(String faultCode, String faultString) {
        this.faultCode = faultCode;
        this.faultString = faultString;
    }

    public String getFaultCode() {
        return faultCode;
    }

    public String getFaultString() {
        return faultString;
    }

}
