package io.adobre.spring5jokesdata.repositories;

import io.adobre.spring5jokesdata.entities.Joke;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by adobre on 5/8/2022.
 * JokeRepository
 **/
public interface JokeRepository extends JpaRepository<Joke, Long> {

}
