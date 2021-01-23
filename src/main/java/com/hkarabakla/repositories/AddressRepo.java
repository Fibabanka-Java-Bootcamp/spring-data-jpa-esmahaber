package com.hkarabakla.repositories;

import org.springframework.data.repository.CrudRepository;

import com.hkarabakla.entities.Address;

import java.util.List;

public interface AddressRepo extends CrudRepository<Address, Integer> {

    List<Address> findByStreetAndCity(String street);

    List<Address> findAllByStreetLessThanAndNumber(Integer id, String name);
}
