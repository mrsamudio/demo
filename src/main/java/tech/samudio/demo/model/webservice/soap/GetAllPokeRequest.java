package tech.samudio.demo.model.webservice.soap;

import jakarta.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "limit", "offset" })
@XmlRootElement(name = "getAllPokeRequest")
public class GetAllPokeRequest {

    @XmlElement(required = false)
    protected String limit;

    @XmlElement(required = false)
    protected String offset;


    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }
}
