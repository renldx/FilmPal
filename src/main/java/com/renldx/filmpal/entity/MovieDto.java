package com.renldx.filmpal.entity;

import com.renldx.filmpal.helpers.MovieHelper;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MovieDto {

    @NotNull
    private String title;
    @NotNull
    private Date release;

    public MovieDto() {
    }

    public MovieDto(String title, Date release) {
        this.title = title;
        this.release = release;
    }

    public MovieDto(Movie movie) {
        this.title = movie.getTitle();
        this.release = movie.getRelease();
    }

    public String getCode() {
        return MovieHelper.GetMovieCode(title, release);
    }
}
