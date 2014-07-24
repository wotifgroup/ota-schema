package com.wotif.schema.ota._2007b.soap;

import javax.xml.bind.annotation.XmlElement;

public class Security {

    @XmlElement(name = "UsernameToken", namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd")
    public UsernameToken usernameToken;

    public Security() {
    }

    public Security(UsernameToken usernameToken) {
        this.usernameToken = usernameToken;
    }

    public UsernameToken getUsernameToken() {
        return usernameToken;
    }

}