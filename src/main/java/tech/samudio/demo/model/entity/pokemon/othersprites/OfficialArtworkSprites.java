package tech.samudio.demo.model.entity.pokemon.othersprites;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OfficialArtworkSprites {
    @Id
    private String id;
    @Basic
    @JsonProperty("front_default")
    private String frontDefault;
    @Basic
    @JsonProperty("front_shiny")
    private String frontShiny;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFrontDefault() {
        return frontDefault;
    }

    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    public String getFrontShiny() {
        return frontShiny;
    }

    public void setFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
    }
}
