package tech.samudio.demo.model.entity.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class AbilityEntry {

    @Id
    private String id;
    @OneToOne
    @JsonProperty("ability")
    private Ability ability;
    @Basic
    @JsonProperty("is_hidden")
    private boolean isHidden;
    @Basic
    private int slot;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability abilities) {
        this.ability = abilities;
    }

    public boolean isHidden() {
        return isHidden;
    }

    public void setHidden(boolean hidden) {
        isHidden = hidden;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

}
