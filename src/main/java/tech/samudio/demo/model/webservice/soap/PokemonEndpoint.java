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
//         response.setPokemon(pokemonRepository.findPokemon(request.getId()));
         response.setPokemonSoapDTO(pokemonSoapService.getPokemonFromRestAndTransform(request.getId()));
         return response;
     }

}
