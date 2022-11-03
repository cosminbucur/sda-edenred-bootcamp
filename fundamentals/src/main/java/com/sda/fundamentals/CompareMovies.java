package com.sda.fundamentals;

import java.util.Comparator;

public class CompareMovies implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
