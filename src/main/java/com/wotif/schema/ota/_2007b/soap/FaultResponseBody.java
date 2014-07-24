package com.wotif.schema.ota._2007b.soap;


import javax.xml.bind.annotation.XmlElement;

public class FaultResponseBody {

    @XmlElement(name = "Fault")
    private Fault fault;

    public FaultResponseBody() {
    }

    public FaultResponseBody(Fault fault) {
        this.fault = fault;
    }

    public Fault getFault() { return fault;
    }

}
