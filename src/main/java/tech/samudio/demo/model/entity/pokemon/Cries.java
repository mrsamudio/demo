package tech.samudio.demo.model.entity.pokemon;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cries {
    @Id
    private String id;
    @Basic
    private String latest;
    @Basic
    private String legacy;

    public String getLatest() {
        return latest;
    }

    public void setLatest(String latest) {
        this.latest = latest;
    }

    public String getLegacy() {
        return legacy;
    }

    public void setLegacy(String legacy) {
        this.legacy = legacy;
    }

}
