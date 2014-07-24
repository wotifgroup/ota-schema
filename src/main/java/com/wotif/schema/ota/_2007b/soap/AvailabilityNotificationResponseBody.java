package com.wotif.schema.ota._2007b.soap;


import com.wotif.schema.ota._2007b.MessageAcknowledgementType;
import com.wotif.schema.ota._2007b.OTAHotelAvailRS;

import javax.xml.bind.annotation.XmlElement;

public class AvailabilityNotificationResponseBody {

    @XmlElement(name = "OTA_HotelAvailNotifRS", namespace = "http://www.opentravel.org/OTA/2003/05")
    private MessageAcknowledgementType otaHotelAvailNotifRS;

    public AvailabilityNotificationResponseBody() {
    }

    public AvailabilityNotificationResponseBody(MessageAcknowledgementType otaHotelAvailNotifRS) {
        this.otaHotelAvailNotifRS = otaHotelAvailNotifRS;
    }

    public MessageAcknowledgementType getOtaHotelAvailNotifRS() {
        return otaHotelAvailNotifRS;
    }

}
