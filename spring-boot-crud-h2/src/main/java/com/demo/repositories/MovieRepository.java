package com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entites.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}

// class CustomRepository<T> {

//     void delete(int id);
//     void update(T m);
//     void save(T m);
//     List<T> findAll();

// }


// CustomRepository<User> obj = ?