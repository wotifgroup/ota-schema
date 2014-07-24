package com.wotif.schema.ota._2007b.soap;

import javax.xml.bind.annotation.XmlElement;

public class UsernameToken {

    @XmlElement(name = "Username", namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd")
    public String username;

    @XmlElement(name = "Password", namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd")
    public String password;

    public UsernameToken() {
    }

    public UsernameToken(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}