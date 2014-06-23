package com.wotif.schema.ota._2007b.soap;


import com.wotif.schema.ota._2007b.OTACancelRS;
import com.wotif.schema.ota._2007b.OTAHotelAvailRS;

import javax.xml.bind.annotation.XmlElement;

public class CancellationResponseBody {

    @XmlElement(name = "OTA_CancelRS", namespace = "http://www.opentravel.org/OTA/2003/05")
    private OTACancelRS otaCancelRS;

    public CancellationResponseBody() {
    }

    public CancellationResponseBody(OTACancelRS otaCancelRS) {
        this.otaCancelRS = otaCancelRS;
    }

    public OTACancelRS getOtaCancelRS() {
        return otaCancelRS;
    }

}
