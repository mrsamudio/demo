package tech.samudio.demo.model.entity.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class Sprites {
    @Id
    private String id;
    @Basic
    private String back_default;
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
    @OneToOne
    private OtherSprites other;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBack_default() {
        return back_default;
    }

    public void setBack_default(String backDefault) {
        this.back_default = backDefault;
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

    public OtherSprites getOther() {
        return other;
    }

    public void setOther(OtherSprites other) {
        this.other = other;
    }

}
