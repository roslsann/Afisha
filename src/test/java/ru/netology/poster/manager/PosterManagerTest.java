package ru.netology.poster.manager;

import org.junit.jupiter.api.Test;
import ru.netology.poster.domain.Movie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PosterManagerTest {
    PosterManager manager = new PosterManager();

    Movie first = new Movie(1, "first");
    Movie second = new Movie(2, "second");
    Movie third = new Movie(3, "third");
    Movie fourth = new Movie(4, "fourth");
    Movie fifth = new Movie(5, "fifth");
    Movie sixth = new Movie(6, "sixth");
    Movie seventh = new Movie(7, "seventh");
    Movie eighth = new Movie(8, "eighth");
    Movie ninth = new Movie(9, "ninth");
    Movie tenth = new Movie(10, "tenth");
    Movie eleveth = new Movie(11, "eleveth");
    Movie twelfht = new Movie(12, "twelfht");


    @Test
    public void shouldGetIfThreeMovies() {
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetIfTenMovies() {

        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetEmpty() {
        Movie[] actual = manager.getAll();
        Movie[] expeсted = new Movie[0];
        assertArrayEquals(expeсted, actual);
    }

    @Test
    public void shouldGetIfCountLessTen() {
        PosterManager manager = new PosterManager(5);
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{tenth,ninth,eighth,seventh,sixth};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAllIfMoviesUnderLimit() {
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        manager.addMovie(eleveth);
        manager.addMovie(twelfht);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{twelfht,eleveth,tenth,ninth,eighth,seventh,sixth,fifth, fourth, third};
        assertArrayEquals(expected, actual);
    }
}

