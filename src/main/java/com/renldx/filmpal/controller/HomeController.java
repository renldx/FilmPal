package com.renldx.filmpal.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.renldx.filmpal.api.MovieApi;
import com.renldx.filmpal.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final MovieApi movieApi;
    private final MovieService movieService;

    public HomeController(MovieApi movieApi, MovieService movieService) {
        this.movieApi = movieApi;
        this.movieService = movieService;
    }

    @GetMapping("/")
    public String home() throws JsonProcessingException {

        var seenMovies = movieService.getAllMovies();

        var newMovies = movieApi.GetMovies();

        return "Hello World";
    }

}
