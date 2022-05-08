package io.adobre.spring5jokes.configurations;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by adobre on 5/8/2022.
 * DataConfiguration
 **/
@Configuration
@EnableJpaRepositories(basePackages = {"io.adobre.spring5jokesdata"})
@EntityScan(basePackages = {"io.adobre.spring5jokesdata"})
@ComponentScan(basePackages = {"io.adobre.spring5jokesdata"})
public class DataConfiguration {
}
