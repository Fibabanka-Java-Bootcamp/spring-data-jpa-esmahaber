package com.hkarabakla.repositories;

import org.springframework.data.repository.CrudRepository;

import com.hkarabakla.entities.Book;

import java.util.List;

public interface BookRepo extends CrudRepository<Book, Integer> {

    Book findByName(String name); 

    List<Book> findAllByNameContainingIgnoreCase(String name);

    List<Book> findByNameOrderByPriceDesc(Integer name, String price);
    
    List<Book> orderByPriceDesc(String price);
    
    List<Book> orderByPriceAsc(String price);
    
    List<Book> findByPriceGreaterThan(String price);
    
    List<Book> findByCurrencyContaining(String currency);

    
    
}

