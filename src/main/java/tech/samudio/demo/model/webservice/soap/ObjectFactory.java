package tech.samudio.demo.model.webservice.soap;

import jakarta.xml.bind.annotation.XmlRegistry;
import tech.samudio.demo.model.source.dtos.PokemonSoapDTO;
import tech.samudio.demo.model.entity.PokeResults;


@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPokemonRequest }
     * @return GetPokemonRequest
     */
    public GetPokemonRequest createGetPokemonRequest() {
        return new GetPokemonRequest();
    }

    /**
     * Create an instance of {@link GetPokemonResponse }
     * @return GetPokemonResponse
     */
    public GetPokemonResponse createGetPokemonResponse() {
        return new GetPokemonResponse();
    }

    /**
     * Create an instance of {@link PokemonSoapDTO }
     * @return PokemonSoapDTO
     */
    public PokemonSoapDTO createPokemon() {
        return new PokemonSoapDTO();
    }

    /**
     * Create an instance of {@link GetAllPokeRequest }
     * @return GetAllPokeRequest
     */
    public GetAllPokeRequest createGetAllPokeRequest() {
        return new GetAllPokeRequest();
    }

    /**
     * Create an instance of {@link GetAllPokeResponse }
     * @return GetAllPokeResponse
     */
    public GetAllPokeResponse createGetAllPokeResponse() {
        return new GetAllPokeResponse();
    }

    /**
     * Create an instance of {@link PokeResults }
     * @return PokeResults
     */
    public PokeResults createPokeResults() {
        return new PokeResults();
    }

}
