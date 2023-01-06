package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    public MovieRepository movieRepository;




    // MOck Interview API build
    public String getDirectorNameByMovieName(String movie){return movieRepository.getDirectorNameByMovieName(movie);}












    public void addMovie(Movie movie) {
        movieRepository.addMovie(movie);
    }

    public void addDirector(Director director) {
        movieRepository.addDirector(director);
    }

    public void addMovieDirectorPair(String movieName, String directorName) {
        movieRepository.addMovieDirectorPair(movieName, directorName);
    }

    public Movie getMovieByName(String searchMovie) {
        return movieRepository.getMovieByName(searchMovie);
    }

    public Director getDirectorByName(String searchDirector) {
        return movieRepository.getDirectorByName(searchDirector);
    }

    //6
    public List<String> getMoviesByDirectorName(String director) {
        return (List<String>) movieRepository.getMoviesByDirectorName(director);
    }

    //7
    public List<String> findAllMovies() {
        return movieRepository.findAllMovies();
    }

}