package com.renldx.filmpal.web.viewmodel;

import java.util.List;

public class MoviesViewModel {

    private List<MovieViewModel> movieViewModelList;

    public MoviesViewModel(List<MovieViewModel> movieViewModelList) {
        this.movieViewModelList = movieViewModelList;
    }

    public List<MovieViewModel> getMovieViewModelList() {
        return movieViewModelList;
    }

    public void setMovieViewModelList(List<MovieViewModel> movieViewModelList) {
        this.movieViewModelList = movieViewModelList;
    }

    public static class MovieViewModel {

        private String title;
        private String year;

        public MovieViewModel(String title, String year) {
            this.title = title;
            this.year = year;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }
    }
}
