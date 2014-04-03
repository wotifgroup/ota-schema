package com.wotif.schema.ota._2007b.soap;


import com.wotif.schema.ota._2007b.OTAPingRQ;

import javax.xml.bind.annotation.XmlElement;

public class PingRequestBody {

    @XmlElement(name = "OTA_PingRQ", namespace = "http://www.opentravel.org/OTA/2003/05")
    private OTAPingRQ otaPingRQ;

    public PingRequestBody() {
    }

    public OTAPingRQ getOtaPingRQ() {
        return otaPingRQ;
    }

}
