package tech.samudio.demo.model.source.designpatterns;

import org.springframework.stereotype.Component;
import tech.samudio.demo.model.entity.Pokemon;
import tech.samudio.demo.model.entity.pokemon.AbilityEntry;
import tech.samudio.demo.model.entity.pokemon.Form;
import tech.samudio.demo.model.entity.pokemon.GameIndex;
import tech.samudio.demo.model.source.dtos.PokemonSoapDTO;

import java.util.ArrayList;
import java.util.List;

@Component
public class PokemonAdapter {

    /**
     * Adapts from rest consumer reponse to Soap service request
     * @param restDto
     * @return {@link PokemonSoapDTO}
     */
    public PokemonSoapDTO adaptFromRestToSoap(Pokemon restDto) {
        PokemonSoapDTO soapDto = new PokemonSoapDTO();

        soapDto.setId(restDto.getId());
        soapDto.setName(restDto.getName());
        soapDto.setImageUrl(soapDto.getImageUrl());

        PokemonSoapDTO.Abilities abilities = getAbilityList(restDto);
        soapDto.setAbilities(abilities);

        soapDto.setBaseExperience(restDto.getBaseExperience());

        PokemonSoapDTO.Cries cries = new PokemonSoapDTO.Cries();
        cries.setLatest(restDto.getCries().getLatest());
        cries.setLegacy(restDto.getCries().getLegacy());
        soapDto.setCries(cries);

        List<PokemonSoapDTO.Form> forms = getFormList(restDto);
        soapDto.setForms(forms);

        PokemonSoapDTO.GameIndex gameIndex = getGameIndex(restDto);
        soapDto.setGameIndex(gameIndex);

        soapDto.setHeight(restDto.getHeight());
        soapDto.setDefault(restDto.isDefault());
        soapDto.setLocationAreaEncounters(restDto.getLocationAreaEncounters());
        soapDto.setOrder_number(restDto.getOrder_number());

        PokemonSoapDTO.Species species = getEspecies(restDto);
        soapDto.setSpecies(species);

        PokemonSoapDTO.Sprites sprites = getSprites(restDto);
        soapDto.setSprites(sprites);

        return soapDto;
    }

    private static PokemonSoapDTO.Abilities getAbilityList(Pokemon restDto) {
        PokemonSoapDTO.Abilities abilities = new PokemonSoapDTO.Abilities();
        List<PokemonSoapDTO.Abilities.Ability> soapAbilityList = new ArrayList<>();

        for (AbilityEntry ae : restDto.getAbilities()) {
            PokemonSoapDTO.Abilities.Ability ability = new PokemonSoapDTO.Abilities.Ability();
            ability.setName(ae.getAbility().getName());
            ability.setUrl(ae.getAbility().getUrl());
            ability.setHidden(ae.isHidden());
            ability.setSlot(ae.getSlot());

            soapAbilityList.add(ability);
        }
        abilities.setAbility(soapAbilityList);

        return abilities;
    }

    private static List<PokemonSoapDTO.Form> getFormList(Pokemon restDto) {
        List<PokemonSoapDTO.Form> forms = new ArrayList<>();
        PokemonSoapDTO.Form form = new PokemonSoapDTO.Form();

        for (Form f : restDto.getForms()) {
            form.setName(f.getName());
            form.setUrl(f.getUrl());
            forms.add(form);
        }
        return forms;
    }

    private static PokemonSoapDTO.GameIndex getGameIndex(Pokemon restDto){
        PokemonSoapDTO.GameIndex gameIndex = new PokemonSoapDTO.GameIndex();
        List<PokemonSoapDTO.GameIndex.Indexes> gameIndexes = new ArrayList<>();

        for (GameIndex g : restDto.getGameIndices()){
            PokemonSoapDTO.GameIndex.Indexes index = new PokemonSoapDTO.GameIndex.Indexes();
            index.setIndex(Integer.toString(g.getGameIndex()));

            PokemonSoapDTO.GameIndex.Indexes.Version version = new PokemonSoapDTO.GameIndex.Indexes.Version();
            version.setName(g.getVersion().getName());
            version.setUrl(g.getVersion().getUrl());
            index.setVersion(version);

            gameIndexes.add(index);
        }
        gameIndex.setGameIndexes(gameIndexes);

        return gameIndex;
    }

    private static PokemonSoapDTO.Species getEspecies(Pokemon restDto) {
        PokemonSoapDTO.Species species = new PokemonSoapDTO.Species();
        species.setName(restDto.getSpecies().getName());
        species.setUrl(restDto.getSpecies().getUrl());

        return species;
    }

    private  static PokemonSoapDTO.Sprites getSprites(Pokemon restDto) {
        PokemonSoapDTO.Sprites sprites = new PokemonSoapDTO.Sprites();
        sprites.setBack_default(restDto.getSprites().getBack_default());
        sprites.setBackFemale(restDto.getSprites().getBackFemale());
        sprites.setBackShiny(restDto.getSprites().getBackShiny());
        sprites.setBackShinyFemale(restDto.getSprites().getBackShinyFemale());
        sprites.setFrontDefault(restDto.getSprites().getFrontDefault());
        sprites.setFrontFemale(restDto.getSprites().getFrontFemale());
        sprites.setFrontShiny(restDto.getSprites().getFrontShiny());
        sprites.setFrontShinyFemale(restDto.getSprites().getFrontShinyFemale());

        PokemonSoapDTO.Sprites.OtherSprites otherSprites = getOtherSprites(restDto);
        sprites.setOther(otherSprites);

        return sprites;
    }

    private static PokemonSoapDTO.Sprites.OtherSprites getOtherSprites(Pokemon restDto) {
        PokemonSoapDTO.Sprites.OtherSprites otherSprites = new PokemonSoapDTO.Sprites.OtherSprites();
        PokemonSoapDTO.Sprites.OtherSprites.DreamWorldSprites dreamWorld = new PokemonSoapDTO.Sprites.OtherSprites.DreamWorldSprites();
        PokemonSoapDTO.Sprites.OtherSprites.Home home = new PokemonSoapDTO.Sprites.OtherSprites.Home();
        PokemonSoapDTO.Sprites.OtherSprites.OfficialArtworkSprites offArtwork = new PokemonSoapDTO.Sprites.OtherSprites.OfficialArtworkSprites();
        PokemonSoapDTO.Sprites.OtherSprites.ShowdownSprites showdown = new PokemonSoapDTO.Sprites.OtherSprites.ShowdownSprites();

//        NOTE: este es el svg
        dreamWorld.setFrontDefault(restDto.getSprites().getOther().getDreamWorld().getFrontDefault());
        dreamWorld.setFrontFemale(restDto.getSprites().getOther().getDreamWorld().getFrontFemale());

        home.setFrontDefault(restDto.getSprites().getOther().getHome().getFrontDefault());
        home.setFrontFemale(restDto.getSprites().getOther().getHome().getFrontFemale());
        home.setFrontShiny(restDto.getSprites().getOther().getHome().getFrontShiny());
        home.setFrontShinyFemale(restDto.getSprites().getOther().getHome().getFrontShinyFemale());

        offArtwork.setFrontDefault(restDto.getSprites().getOther().getOfficialArtwork().getFrontDefault());
        offArtwork.setFrontShiny(restDto.getSprites().getOther().getOfficialArtwork().getFrontShiny());

        showdown.setBackDefault(restDto.getSprites().getOther().getShowdown().getBackDefault());
        showdown.setBackFemale(restDto.getSprites().getOther().getShowdown().getBackFemale());
        showdown.setBackShiny(restDto.getSprites().getOther().getShowdown().getBackShiny());
        showdown.setBackShinyFemale(restDto.getSprites().getOther().getShowdown().getBackShinyFemale());
        showdown.setFrontDefault(restDto.getSprites().getOther().getShowdown().getFrontDefault());
        showdown.setFrontFemale(restDto.getSprites().getOther().getShowdown().getFrontFemale());
        showdown.setFrontShiny(restDto.getSprites().getOther().getShowdown().getFrontShiny());
        showdown.setFrontShinyFemale(restDto.getSprites().getOther().getShowdown().getFrontShinyFemale());

        otherSprites.setDreamWorld(dreamWorld);
        otherSprites.setHome(home);
        otherSprites.setOfficialArtwork(offArtwork);
        otherSprites.setShowdown(showdown);

        return otherSprites;
    }

}