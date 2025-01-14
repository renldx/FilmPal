package com.renldx.filmpal.entity;

import java.util.Date;

public class Movie {

    private String title;

    private Date year;

    private String description;

    private boolean watched;

    public Movie() {
    }

    public Movie(Date year, String title, String description, boolean watched) {
        this.year = year;
        this.title = title;
        this.description = description;
        this.watched = watched;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }
}
