package ru.netology.poster.manager;

import ru.netology.poster.domain.Movie;

public class PosterManager {
    private int countMovie = 10;
    private Movie[] movies = new Movie[0];

    public PosterManager(int countMovie) {
        this.countMovie = countMovie;
    }

    public PosterManager() {

    }

    public void addMovie(Movie movie) {
        int lenght = movies.length + 1;
        Movie[] tmp = new Movie[lenght];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] getAll() {
        int resultLength;
        if(movies.length > countMovie) {
            resultLength = countMovie;
        } else {
            resultLength = movies.length;
        }
        Movie[] result = new Movie[resultLength];
        for(int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}
