package tech.samudio.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tech.samudio.demo.model.entity.PokeResults;
import tech.samudio.demo.model.entity.Pokemon;
import tech.samudio.demo.model.webservice.PokemonRestService;

@RestController
public class PokemonController {
    private final PokemonRestService pokemonRestService;

    @Autowired
    public PokemonController(PokemonRestService pokemonService) {
        this.pokemonRestService = pokemonService;
    }

    @GetMapping("/pokemon/{id}")
    public Pokemon getPokemonById(@PathVariable String id) {
        return pokemonRestService.getPokemonById(id);
    }
    @GetMapping("/pokemon")
    public PokeResults getPokemon(@RequestParam(defaultValue = "20") int limit,
                                  @RequestParam(defaultValue = "0") int offset) {
        return pokemonRestService.getAllPokemon(limit, offset);
    }
}
