package io.adobre.spring5jokesdata.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.adobre.spring5jokesdata.entities.Joke;

/**
 * Created by adobre on 5/8/2022.
 * JokeDto
 **/
public class JokeDto {

    @JsonProperty("description")
    private String description;

    public JokeDto() {

    }

    public static JokeDto fromEntity(Joke joke) {
        JokeDto jokeDto = new JokeDto();
        jokeDto.setDescription(joke.getDescription());
        return jokeDto;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
