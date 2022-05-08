package io.adobre.spring5jokes.services;

import io.adobre.spring5jokesdata.entities.Joke;
import io.adobre.spring5jokesdata.generators.JokeGenerator;
import io.adobre.spring5jokesdata.repositories.JokeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by adobre on 5/8/2022.
 * ChuckNorrisQuotes
 **/
@Component
public class JokeService {

    JokeGenerator jokeGenerator;

    JokeRepository jokeRepository;

    @Autowired
    public JokeService(JokeGenerator jokeGenerator, JokeRepository jokeRepository) {
        this.jokeGenerator = jokeGenerator;
        this.jokeRepository = jokeRepository;
    }

    public String getRandomChuckNorrisQuote() {
        return jokeGenerator.getChuckNorrisQuote();
    }

    public Joke saveJoke(String jokeDescription) {
        Joke joke = new Joke(jokeDescription);
        this.jokeRepository.save(joke);
        return joke;
    }
    public List<Joke> getAllJokes() {
        return this.jokeRepository.findAll();
    }

}
