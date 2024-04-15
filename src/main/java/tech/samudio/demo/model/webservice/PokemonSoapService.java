package tech.samudio.demo.model.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.samudio.demo.model.entity.PokeResults;
import tech.samudio.demo.model.entity.Pokemon;
import tech.samudio.demo.model.source.designpatterns.PokemonAdapter;
import tech.samudio.demo.model.source.dtos.PokemonSoapDTO;

@Service
public class PokemonSoapService {
    private static final int DEFAULT_LIMIT = 20;
    private static final int DEFAULT_OFFSET = 0;
    private final PokemonAdapter pokemonAdapter;
    private final PokemonRestService pokemonRestService;

    @Autowired
    public PokemonSoapService(PokemonAdapter pokemonAdapter, PokemonRestService pokemonRestService) {
        this.pokemonAdapter = pokemonAdapter;
        this.pokemonRestService = pokemonRestService;
    }

    public PokeResults getAllPokemonFromRest(String limit, String offset) {
        int limitValue = (limit != null && !limit.isEmpty()) ? Integer.parseInt(limit) : DEFAULT_LIMIT;
        int offsetValue = (offset != null && !offset.isEmpty()) ? Integer.parseInt(offset) : DEFAULT_OFFSET;

        return callRestService(limitValue, offsetValue);
    }
    private PokeResults callRestService(int limit, int offset) {
        return pokemonRestService.getAllPokemon(limit, offset);
    }

    public PokemonSoapDTO getPokemonFromRestAndTransform(String id) {
        Pokemon restDto = callRestService(id);
        return pokemonAdapter.adaptFromRestToSoap(restDto);
    }
    private Pokemon callRestService(String id) {
        return pokemonRestService.getPokemonById(id);
    }



}
