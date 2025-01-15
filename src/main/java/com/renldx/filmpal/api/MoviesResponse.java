package com.renldx.filmpal.api;

import java.util.Date;
import java.util.List;

public class MoviesResponse {
    private List<MovieResponse> movies;

    public MoviesResponse() {
    }

    public MoviesResponse(List<MovieResponse> movieResponseList) {
        this.movies = movieResponseList;
    }

    public List<MovieResponse> getMovies() {
        return movies;
    }

    public void setMovies(List<MovieResponse> movies) {
        this.movies = movies;
    }

    public static class MovieResponse {
        private String title;
        private Date release;

        public MovieResponse() {
        }

        public MovieResponse(String title, Date release) {
            this.title = title;
            this.release = release;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Date getRelease() {
            return release;
        }

        public void setRelease(Date release) {
            this.release = release;
        }
    }
}
