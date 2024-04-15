package tech.samudio.demo.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class PokeResults {
    @Id
    private String id;
    @Basic
    private int count;
    @Basic
    private int limiter;
    @Basic
    private int offsetter;
    @Basic
    private String next;
    @Basic
    private String previous;
    @OneToMany
    private List<Results> results;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getLimiter() {
        return limiter;
    }

    public void setLimiter(int limit) {
        this.limiter = limit;
    }

    public int getOffsetter() {
        return offsetter;
    }

    public void setOffsetter(int offset) {
        this.offsetter = offset;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

    @Entity
    public static class Results {
        @Id
        private Long id;
        @Basic
        private String name;
        @Basic
        private String url;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
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