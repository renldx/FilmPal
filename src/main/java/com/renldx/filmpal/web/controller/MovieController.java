package com.renldx.filmpal.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.renldx.filmpal.api.MovieApi;
import com.renldx.filmpal.entity.Genres;
import com.renldx.filmpal.service.MovieService;
import com.renldx.filmpal.web.viewmodel.MoviesViewModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {

    private final MovieApi movieApi;
    private final MovieService movieService;

    public MovieController(MovieApi movieApi, MovieService movieService) {
        this.movieApi = movieApi;
        this.movieService = movieService;
    }

    @GetMapping("/")
    public String index(Model model) throws JsonProcessingException {

        var genre = Genres.DRAMA;

        var seenMovies = movieService.getAllMovies();

        var newMovies = movieApi.GetMovies(genre);

        var newMovieVMList = newMovies.getMovies().stream()
                .map(s -> new MoviesViewModel.MovieViewModel(s.getTitle(), s.getRelease())).toList();

        model.addAttribute("vm", new MoviesViewModel((newMovieVMList)));

        return "index";
    }
}
