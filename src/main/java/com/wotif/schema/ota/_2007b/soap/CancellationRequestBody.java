package com.wotif.schema.ota._2007b.soap;

import com.wotif.schema.ota._2007b.OTACancelRQ;
import javax.xml.bind.annotation.XmlElement;

public class CancellationRequestBody {

    @XmlElement(name = "OTA_CancelRQ", namespace = "http://www.opentravel.org/OTA/2003/05")
    private OTACancelRQ otaCancellRQ;

    public CancellationRequestBody() {
    }

    public OTACancelRQ getOtaCancelRQ() {
        return otaCancellRQ;
    }

}
