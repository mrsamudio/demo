package tech.samudio.demo.model.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.samudio.demo.model.entity.Pokemon;
import tech.samudio.demo.model.source.datasource.PokemonRestService;
import tech.samudio.demo.model.source.designpatterns.PokemonAdapter;
import tech.samudio.demo.model.source.dtos.PokemonSoapDTO;

import java.util.List;

@Service
public class PokemonSoapService {
    private final PokemonAdapter pokemonAdapter;
    private final PokemonRestService pokemonRestService;

    @Autowired
    public PokemonSoapService(PokemonAdapter pokemonAdapter, PokemonRestService pokemonRestService) {
        this.pokemonAdapter = pokemonAdapter;
        this.pokemonRestService = pokemonRestService;
    }

    public PokemonSoapDTO getPokemonFromRestAndTransform(String id) {
        Pokemon restDto = callRestService(id);
        return pokemonAdapter.adaptFromRestToSoap(restDto);
    }

    private Pokemon callRestService(String id) {
        return pokemonRestService.getPokemonById(id);
    }
    private List<Pokemon> callRestService(int limit, int offset) {
        return pokemonRestService.getAllPokemon(limit, offset);
    }


}
