package com.renldx.filmpal.api;

import java.util.List;

public class MovieApiResponse {
    private List<MovieResponse> movies;

    public MovieApiResponse() {
    }

    public MovieApiResponse(List<MovieResponse> movieResponseList) {
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
        private String release;

        public MovieResponse() {
        }

        public MovieResponse(String title, String release) {
            this.title = title;
            this.release = release;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getRelease() {
            return release;
        }

        public void setRelease(String release) {
            this.release = release;
        }
    }
}
