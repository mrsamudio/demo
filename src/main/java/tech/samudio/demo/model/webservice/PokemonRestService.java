package tech.samudio.demo.model.webservice;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tech.samudio.demo.model.entity.PokeResults;
import tech.samudio.demo.model.entity.Pokemon;

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

    public PokeResults getAllPokemon(int limit, int offset) {
        String pokeApiUrl = POKE_API_URL + "?limit=" + limit + "&offset=" + offset;
        PokeResults pokeResults = restTemplate.getForObject(pokeApiUrl, PokeResults.class);
        extracted(offset, pokeResults);

        pokeResults.setLimiter(limit);
        pokeResults.setOffsetter(offset);

        return pokeResults;
    }

    private static void extracted(int offset, PokeResults pokeResults) {
        if (pokeResults != null && pokeResults.getResults() != null) {
            List<PokeResults.Results> results = pokeResults.getResults();
            int startId = offset + 1;

            for (int i = 0; i < results.size(); i++) {
                PokeResults.Results result = results.get(i);
                Long id = (long) (startId + i);
                result.setId(id);
            }
        }
    }
}
