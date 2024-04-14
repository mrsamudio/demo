package tech.samudio.demo.model.entity.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import tech.samudio.demo.model.entity.pokemon.othersprites.DreamWorldSprites;
import tech.samudio.demo.model.entity.pokemon.othersprites.Home;
import tech.samudio.demo.model.entity.pokemon.othersprites.OfficialArtworkSprites;
import tech.samudio.demo.model.entity.pokemon.othersprites.ShowdownSprites;

@Entity
public class OtherSprites {
    @Id
    private String id;
    @OneToOne
    @JsonProperty("dream_world")
    private DreamWorldSprites dreamWorld;
    @OneToOne
    @JsonProperty("home")
    private Home home;
    @OneToOne
    @JsonProperty("official-artwork")
    private OfficialArtworkSprites officialArtwork;
    @OneToOne
    private ShowdownSprites showdown;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DreamWorldSprites getDreamWorld() {
        return dreamWorld;
    }

    public void setDreamWorld(DreamWorldSprites dreamWorld) {
        this.dreamWorld = dreamWorld;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public OfficialArtworkSprites getOfficialArtwork() {
        return officialArtwork;
    }

    public void setOfficialArtwork(OfficialArtworkSprites officialArtwork) {
        this.officialArtwork = officialArtwork;
    }

    public ShowdownSprites getShowdown() {
        return showdown;
    }

    public void setShowdown(ShowdownSprites showdown) {
        this.showdown = showdown;
    }

}
