package tech.samudio.demo.model.entity.pokemon.othersprites;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ShowdownSprites {
    @Id
    private String id;
    @Basic
    @JsonProperty("back_default")
    private String backDefault;
    @Basic
    @JsonProperty("back_female")
    private String backFemale;
    @Basic
    @JsonProperty("back_shiny")
    private String backShiny;
    @Basic
    @JsonProperty("back_shiny_female")
    private String backShinyFemale;
    @Basic
    @JsonProperty("front_default")
    private String frontDefault;
    @Basic
    @JsonProperty("front_female")
    private String frontFemale;
    @Basic
    @JsonProperty("front_shiny")
    private String frontShiny;
    @Basic
    @JsonProperty("front_shiny_female")
    private String frontShinyFemale;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBackDefault() {
        return backDefault;
    }

    public void setBackDefault(String backDefault) {
        this.backDefault = backDefault;
    }

    public String getBackFemale() {
        return backFemale;
    }

    public void setBackFemale(String backFemale) {
        this.backFemale = backFemale;
    }

    public String getBackShiny() {
        return backShiny;
    }

    public void setBackShiny(String backShiny) {
        this.backShiny = backShiny;
    }

    public String getBackShinyFemale() {
        return backShinyFemale;
    }

    public void setBackShinyFemale(String backShinyFemale) {
        this.backShinyFemale = backShinyFemale;
    }

    public String getFrontDefault() {
        return frontDefault;
    }

    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    public String getFrontFemale() {
        return frontFemale;
    }

    public void setFrontFemale(String frontFemale) {
        this.frontFemale = frontFemale;
    }

    public String getFrontShiny() {
        return frontShiny;
    }

    public void setFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
    }

    public String getFrontShinyFemale() {
        return frontShinyFemale;
    }

    public void setFrontShinyFemale(String frontShinyFemale) {
        this.frontShinyFemale = frontShinyFemale;
    }
}
