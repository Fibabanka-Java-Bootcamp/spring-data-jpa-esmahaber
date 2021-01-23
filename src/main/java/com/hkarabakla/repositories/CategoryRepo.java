package com.hkarabakla.repositories;

import com.hkarabakla.entities.Category;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, Integer> {
	
	Category findByName(String name);

    List<Category> findByNameAllIgnoreCase(String name);
    
}
