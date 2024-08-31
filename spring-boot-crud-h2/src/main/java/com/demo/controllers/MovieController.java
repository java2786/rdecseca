package com.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entites.Movie;
import com.demo.repositories.MovieRepository;

// @Controller // MVC
@RestController // = @Controller + @ResponseBody
public class MovieController {

    @Autowired
    private MovieRepository repo;
    
    // localhost:8080/find-all-movies
    // @GetMapping("find-all-movies")
    // @ResponseBody
    // public List<String> getAllMovies(){
    //     return Arrays.asList("Superman", "Hulk", "Ironman");
    // }

    @GetMapping("find-all-movies")
    // @ResponseBody
    public List<Movie> getAllMovies(){
        Movie m1 = new Movie();
        m1.setTitle("Superman");
        m1.setReleaseYear(2015);
        m1.setRating(4.5);

        Movie m2 = new Movie();
        m2.setTitle("Ironman");
        m2.setReleaseYear(2018);
        m2.setRating(4.9);

        Movie m3 = new Movie();
        m3.setTitle("Spiderman");
        m3.setReleaseYear(2014);
        m3.setRating(4.2);

        
        // return Arrays.asList(m1, m2, m3);
        return repo.findAll();
    }

    //
    @GetMapping("/saveInDb")
    // @ResponseBody
    public Movie saveMovieIntoDatabase(){
        Movie m1 = new Movie();
        // m1.setId(1);
        m1.setTitle("Superman");
        m1.setReleaseYear(2015);
        m1.setRating(4.5);

        return repo.save(m1);
    }

}
