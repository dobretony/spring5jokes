package io.adobre.spring5jokesdata.generators;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Component;

/**
 * Created by adobre on 5/8/2022.
 * JokeGenerator
 **/
@Component
public class JokeGenerator {

    public String getChuckNorrisQuote() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }

}
