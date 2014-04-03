package com.wotif.schema.ota._2007b.soap;

import javax.xml.bind.annotation.XmlElement;

public class ServiceHeader {

    @XmlElement
    public String service;

    @XmlElement
    public String version;

    @XmlElement
    public String requester;

    @XmlElement
    public String serviceVersion;

    public ServiceHeader() {
    }

    public ServiceHeader(String service, String version, String requester, String serviceVersion) {
        this.service = service;
        this.version = version;
        this.requester = requester;
        this.serviceVersion = serviceVersion;
    }

    public String getService() {
        return service;
    }

    public String getVersion() {
        return version;
    }

    public String getRequester() {
        return requester;
    }

    public String getServiceVersion() {
        return serviceVersion;
    }

}