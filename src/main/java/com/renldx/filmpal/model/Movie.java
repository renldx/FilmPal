package com.renldx.filmpal.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "MOVIES", uniqueConstraints = @UniqueConstraint(columnNames = {"TITLE", "YEAR"}))
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "YEAR", nullable = false)
    private Date year;

    public Movie() {
    }

    public Movie(Date year, String title) {
        this.year = year;
        this.title = title;
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
}
