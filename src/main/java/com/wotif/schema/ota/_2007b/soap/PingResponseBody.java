package com.wotif.schema.ota._2007b.soap;


import com.wotif.schema.ota._2007b.OTAPingRS;

import javax.xml.bind.annotation.XmlElement;

public class PingResponseBody {

    @XmlElement(name = "OTA_PingRS", namespace = "http://www.opentravel.org/OTA/2003/05")
    private OTAPingRS otaPingRS;

    public PingResponseBody(OTAPingRS otaPingRS) {
        this.otaPingRS = otaPingRS;
    }

    public OTAPingRS getOtaPingRS() {
        return otaPingRS;
    }

}
