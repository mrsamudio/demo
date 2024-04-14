package tech.samudio.demo.model.source.dtos;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pokemonSoapDTO", propOrder = {
        "id",
        "name",
        "imageUrl",
        "abilities",
        "baseExperience",
        "cries",
        "forms",
        "gameIndex",
        "height",
        "isDefault",
        "locationAreaEncounters",
        "order_number",
        "species",
        "sprites",
})
public class PokemonSoapDTO {

    @XmlElement(required = true)
    protected String id;

    @XmlElement
    protected String name;

    @XmlElement
    protected String imageUrl;

    //    @XmlElement(name = "ability")
    //    @XmlElementWrapper(name = "abilities")
// TODO: PATRON BUILDER
    @XmlElement
    private Abilities abilities;
    @XmlElement
    private int baseExperience;
    @XmlElement
    private Cries cries;
    @XmlElement
    private List<Form> forms;
    @XmlElement
    private GameIndex gameIndex;
    @XmlElement
    private int height;
    @XmlElement
    private boolean isDefault;
    @XmlElement
    private String locationAreaEncounters;
    @XmlElement
    private int order_number;
    @XmlElement
    private Species species;
    @XmlElement
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

    public Abilities getAbilities() {
        return abilities;
    }

    public void setAbilities(Abilities abilities) {
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

    public GameIndex getGameIndex() {
        return gameIndex;
    }

    public void setGameIndex(GameIndex gameIndex) {
        this.gameIndex = gameIndex;
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

    public void setOrder_number(int order_number) {
        this.order_number = order_number;
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

    public static class Abilities {
        private String id;
        private List<Ability> ability;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<Ability> getAbility() {
            return ability;
        }

        public void setAbility(List<Ability> ability) {
            this.ability = ability;
        }

        public static class Ability {
            private String id;
            private String name;
            private String url;
            private boolean isHidden;
            private int slot;

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
    }
    public static class Cries {
        private String id;
        private String latest;
        private String legacy;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

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
    public static class Form {
        private String id;
        private String name;
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
    public static class GameIndex {
        private String id;
        private List<Indexes> gameIndexes;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<Indexes> getGameIndexes() {
            return gameIndexes;
        }

        public void setGameIndexes(List<Indexes> gameIndexes) {
            this.gameIndexes = gameIndexes;
        }

        public static class Indexes {
            private String index;
            private Version version;

            public String getIndex() {
                return index;
            }

            public void setIndex(String index) {
                this.index = index;
            }

            public Version getVersion() {
                return version;
            }

            public void setVersion(Version version) {
                this.version = version;
            }

            public static class Version {
                private String id;
                private String name;
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
        }
    }
    public static class Species {
        private String id;
        private String name;
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
    public static class Sprites {
        private String id;
        private String back_default;
        private String backFemale;
        private String backShiny;
        private String backShinyFemale;
        private String frontDefault;
        private String frontFemale;
        private String frontShiny;
        private String frontShinyFemale;
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

        public void setBack_default(String back_default) {
            this.back_default = back_default;
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

        public static class OtherSprites {
            private String id;
            private DreamWorldSprites dreamWorld;
            private Home home;
            private OfficialArtworkSprites officialArtwork;
            private ShowdownSprites showdown;

            public static class DreamWorldSprites {
                private String id;
                private String frontDefault;
                private String frontFemale;

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

                public String getFrontFemale() {
                    return frontFemale;
                }

                public void setFrontFemale(String frontFemale) {
                    this.frontFemale = frontFemale;
                }
            }
            public static class Home {
                private String id;
                private String frontDefault;
                private String frontFemale;
                private String frontShiny;
                private String frontShinyFemale;

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
            public static class OfficialArtworkSprites {
                private String id;
                private String frontDefault;
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
            public static class ShowdownSprites {
                private String id;
                private String backDefault;
                private String backFemale;
                private String backShiny;
                private String backShinyFemale;
                private String frontDefault;
                private String frontFemale;
                private String frontShiny;
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
    }

}
