package com.sda.fundamentals;

import java.util.Comparator;

public class Movie {

    private String title;
    private float rating;
    private int year;

    public Movie(String title, float rating, int year) {
        this.title = title;
        this.rating = rating;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
