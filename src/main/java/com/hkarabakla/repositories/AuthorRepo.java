package com.hkarabakla.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hkarabakla.entities.Author;

public interface AuthorRepo extends CrudRepository<Author, Integer> {
	    
    Author findByName(String name);

    List<Author> findAllByNameContainingIgnoreCase(String name);

    List<Author> findAllByIdLessThanAndName(Integer id, String name);

}
