package com.example.form.demo;

import java.util.List;

public class FilmCard {
    private String name;
    private List<String> genres;

    public FilmCard() {
    }

    public FilmCard(String name, List<String> genres) {
        this.name = name;
        this.genres = genres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }
}
