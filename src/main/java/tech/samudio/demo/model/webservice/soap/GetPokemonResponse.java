package tech.samudio.demo.model.webservice.soap;

import jakarta.xml.bind.annotation.*;
import tech.samudio.demo.model.source.dtos.PokemonSoapDTO;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"pokemonSoapDTO"})
@XmlRootElement(name = "getPokemonResponse")
public class GetPokemonResponse {

    @XmlElement(required = true)
    protected PokemonSoapDTO pokemonSoapDTO;

    public PokemonSoapDTO getPokemonSoapDTO() {
        return pokemonSoapDTO;
    }

    public void setPokemonSoapDTO(PokemonSoapDTO pokemonSoapDTO) {
        this.pokemonSoapDTO = pokemonSoapDTO;
    }
}
