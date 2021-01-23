package com.hkarabakla.repositories;

import org.springframework.data.repository.CrudRepository;

import com.hkarabakla.entities.Order;

import java.util.List;

public interface OrderRepo extends CrudRepository<Order, Integer> {

    Order findById(String name);

    List<Order> findAllByNameAllIgnoreCase(String name);

    List<Order> findAllByIdLessThanAndName(Integer id, String name);
}

