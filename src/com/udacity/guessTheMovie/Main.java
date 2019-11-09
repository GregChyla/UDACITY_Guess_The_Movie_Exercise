package com.udacity.guessTheMovie;

public class Main {
    public static void main(String[] args) {
        LoadMovie loadMovie = new LoadMovie();
        loadMovie.loadMovieList("movies.txt");
        System.out.println(loadMovie.getMovieList());
        System.out.println(new PickMovieFromList().pickMovie(loadMovie.getMovieList()));
    }

}
