package io.adobre.spring5jokes.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.adobre.spring5jokes.services.JokeService;
import io.adobre.spring5jokesdata.entities.Joke;
import io.adobre.spring5jokesdata.json.JokeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by adobre on 5/8/2022.
 * JokeController
 **/
@Controller
public class JokeController {

    JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/joke/chucknorries")
    @ResponseBody
    public String retrieveJoke() {
        Joke joke = jokeService.saveJoke(jokeService.getRandomChuckNorrisQuote());
        JokeDto jokeDto = JokeDto.fromEntity(joke);
        ObjectMapper mapper = new ObjectMapper();
        String result = null;
        try {
            result = mapper.writeValueAsString(jokeDto);
        } catch(JsonProcessingException exception) {
            // do some logging.
        }
        return result;
    }

    @GetMapping("/jokes")
    @ResponseBody
    public String[] getAllSavedJokes() {
        List<Joke> jokes = jokeService.getAllJokes();
        String[] jokeDescriptions = new String[jokes.size()];
        int i = 0;
        for (Joke joke : jokes) {
            JokeDto jokeDto = JokeDto.fromEntity(joke);
            ObjectMapper mapper = new ObjectMapper();
            String result = null;
            try {
                result = mapper.writeValueAsString(jokeDto);
            } catch(JsonProcessingException exception) {
                // do some logging.
            }
            jokeDescriptions[i] = result;
            i++;
        }
        return jokeDescriptions;
    }

}
