package tech.samudio.demo.model.webservice.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import tech.samudio.demo.model.webservice.PokemonSoapService;

@Endpoint
public class PokemonEndpoint {
    private static final String NAMESPACE_URI = "http://samudio.tech/demo";

    private PokemonSoapService pokemonSoapService;

    @Autowired
    public PokemonEndpoint(PokemonSoapService pokemonSoapService) {
        this.pokemonSoapService = pokemonSoapService;
    }

     @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPokemonRequest")
     @ResponsePayload
     public GetPokemonResponse getPokemon(@RequestPayload GetPokemonRequest request) {
         GetPokemonResponse response = new GetPokemonResponse();
         response.setPokemonSoapDTO(pokemonSoapService.getPokemonFromRestAndTransform(request.getId()));
         return response;
     }
     @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllPokeRequest")
     @ResponsePayload
     public GetAllPokeResponse getAllPokemon(@RequestPayload GetAllPokeRequest request) {
         GetAllPokeResponse response = new GetAllPokeResponse();
         String limit = request.getLimit();
         String offset = request.getOffset();
         response.setPokeResults(pokemonSoapService.getAllPokemonFromRest(limit, offset));
         return response;
     }

}
