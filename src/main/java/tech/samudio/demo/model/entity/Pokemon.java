package tech.samudio.demo.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import tech.samudio.demo.model.entity.pokemon.*;

import java.util.List;

@Entity
public class Pokemon {
    @Id
    private String id;
    @Basic
    private String name;
    @Basic
    private String imageUrl;
    @OneToMany
    @JsonProperty("abilities")
    private List<AbilityEntry> abilities;
    @Basic
    @JsonProperty("base_experience")
    private int baseExperience;
    @OneToOne
    private Cries cries;
    @OneToMany
    private List<Form> forms;
    @OneToMany
    @JsonProperty("game_indices")
    private List<GameIndex> gameIndices;
    @Basic
    private int height;
    @Basic
    @JsonProperty("is_default")
    private boolean isDefault;
    @Basic
    @JsonProperty("location_area_encounters")
    private String locationAreaEncounters;
    @Basic
    @JsonProperty("order")
    private int order_number;
    @OneToOne
    private Species species;
    @OneToOne
    private Sprites sprites;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<AbilityEntry> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<AbilityEntry> abilities) {
        this.abilities = abilities;
    }

    public int getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(int baseExperience) {
        this.baseExperience = baseExperience;
    }

    public Cries getCries() {
        return cries;
    }

    public void setCries(Cries cries) {
        this.cries = cries;
    }

    public List<Form> getForms() {
        return forms;
    }

    public void setForms(List<Form> forms) {
        this.forms = forms;
    }

    public List<GameIndex> getGameIndices() {
        return gameIndices;
    }

    public void setGameIndices(List<GameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    public void setLocationAreaEncounters(String locationAreaEncounters) {
        this.locationAreaEncounters = locationAreaEncounters;
    }

    public int getOrder_number() {
        return order_number;
    }

    public void setOrder_number(int order) {
        this.order_number = order;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }
}
