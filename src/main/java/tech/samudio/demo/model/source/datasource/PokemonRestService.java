package tech.samudio.demo.model.source.datasource;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tech.samudio.demo.model.entity.Pokemon;
import tech.samudio.demo.model.webservice.rest.GetAllPokemonResponse;

import java.util.List;

@Service
public class PokemonRestService {
    private static final String POKE_API_URL = "https://pokeapi.co/api/v2/pokemon";
    private final RestTemplate restTemplate;

    public PokemonRestService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     *
     * @param id
     * @returns an entity {@link Pokemon}
     */
    public Pokemon getPokemonById(String id) {
        String pokeApiUrl = POKE_API_URL + "/" + id;
        return restTemplate.getForObject(pokeApiUrl, Pokemon.class);
    }

    public List<Pokemon> getAllPokemon(int limit, int offset) {
        String pokeApiUrl = POKE_API_URL + "?limit=" + limit + "&offset=" + offset;
        GetAllPokemonResponse response = restTemplate.getForObject(pokeApiUrl, GetAllPokemonResponse.class);
//        System.out.println("API Response: " + response.toString()); // Para verificar la respuesta
//        System.out.println("API Response  Object: " + response.getResults()); // Para verificar la respuesta
//        return response.getResults();
        return restTemplate.getForObject(pokeApiUrl, GetAllPokemonResponse.class).getResults();
    }
}
