package com.renldx.filmpal.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.renldx.filmpal.api.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final MovieService movieService;

    public HomeController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/")
    public String home() throws JsonProcessingException {

        movieService.GetMovies();

        return "Hello World";
    }

}
