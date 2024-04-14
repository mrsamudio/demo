package tech.samudio.demo.model.entity.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class GameIndex {
    @Id
    private String id;
    @Basic
    @JsonProperty("game_index")
    private int gameIndex;
    @OneToOne
    private Version version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGameIndex() {
        return gameIndex;
    }

    public void setGameIndex(int gameIndex) {
        this.gameIndex = gameIndex;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

}
