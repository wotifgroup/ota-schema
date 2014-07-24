////////////////////////////////////////////////////////////////////////////////
//
// Copyright (c) 2013, Wotif.com. All rights reserved.
//
// This is unpublished proprietary source code of Wotif.com.
// The copyright notice above does not evidence any actual or intended
// publication of such source code.
//
////////////////////////////////////////////////////////////////////////////////
package com.wotif.schema.ota._2007b.soap;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Envelope")
public class AvailabilityNotificationResponseEnvelope {

    @XmlElement(name = "Header")
    private Header header;

    @XmlElement(name = "Body")
    private AvailabilityNotificationResponseBody body;

    public AvailabilityNotificationResponseEnvelope() {
    }

    public AvailabilityNotificationResponseEnvelope(Header header, AvailabilityNotificationResponseBody body) {
        this.header = header;
        this.body = body;
    }

    public Header getHeader() {
        return header;
    }

    public AvailabilityNotificationResponseBody getBody() {
        return body;
    }

}