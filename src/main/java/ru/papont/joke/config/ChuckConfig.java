package ru.papont.joke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ChuckConfig {

//    @Bean
    public ChuckNorrisQuotes ChuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
