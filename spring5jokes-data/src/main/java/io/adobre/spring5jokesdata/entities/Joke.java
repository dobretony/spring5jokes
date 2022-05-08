package io.adobre.spring5jokesdata.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Created by adobre on 5/8/2022.
 * Joke
 **/
@Entity
@Table(name = "Jokes")
public class Joke {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "joke_description")
    private String jokeDescription;

    public Joke() {


    }

    public Joke(String jokeDescription) {
        this.jokeDescription = jokeDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return jokeDescription;
    }

    public void setDescription(String jokeDescription) {
        this.jokeDescription = jokeDescription;
    }
}
