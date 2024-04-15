package tech.samudio.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tech.samudio.demo.model.entity.PokeResults;
import tech.samudio.demo.model.webservice.PokemonRestService;

@Controller
public class IndexController {
    private final PokemonRestService pokemonRestService;

    @Value("${wsdl.url}")
    private String wsdlUrl;

    @Value("${rest.urlbyId}")
    private String restUrlById;

    @Value("${rest.url}")
    private String restUrl;

    @Autowired
    public IndexController(PokemonRestService pokemonRestService) {
        this.pokemonRestService = pokemonRestService;
    }

    @GetMapping("/")
    public String index() {
        return "redirect:/paginator";
    }

    @GetMapping("/paginator")
    public String getPokemon(@RequestParam(defaultValue = "20") int limit,
                             @RequestParam(defaultValue = "0") int offset,
                             Model model) {
        PokeResults pokeResults = pokemonRestService.getAllPokemon(limit, offset);
        model.addAttribute("pokeResults", pokeResults);
        model.addAttribute("wsdlUrl", wsdlUrl);
        model.addAttribute("restUrlById", restUrlById);
        model.addAttribute("restUrl", restUrl);
        return "pagination";
    }

}
