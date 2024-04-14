package tech.samudio.demo.model.entity.pokemon;


import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ability {
    @Id
    private String id;
    @Basic
    private String name;
    @Basic
    private String url;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
