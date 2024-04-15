package tech.samudio.demo.model.webservice.soap;

import jakarta.xml.bind.annotation.*;
import tech.samudio.demo.model.entity.PokeResults;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"pokeResults"})
@XmlRootElement(name = "getAllPokeResponse")
public class GetAllPokeResponse {

    @XmlElement(required = true)
    protected PokeResults pokeResults;

    public PokeResults getPokeResults() {
        return pokeResults;
    }

    public void setPokeResults(PokeResults pokeResults) {
        this.pokeResults = pokeResults;
    }
}
