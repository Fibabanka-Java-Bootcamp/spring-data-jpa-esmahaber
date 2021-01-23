package com.hkarabakla.services;

import com.hkarabakla.entities.Address;
import com.hkarabakla.entities.Order;
import com.hkarabakla.entities.User;
import com.hkarabakla.repositories.UserRepo;

import java.sql.Timestamp;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    private final UserRepo repo;

    public UserService(UserRepo repo) {
        this.repo = repo;
    }

    public void userOperations() {
        User u = new User();
        u.setName("user");

        Address address = new Address();
        address.setStreet("Gazo sokak");
        address.setNumber("7");
        address.setCity("Istanbul");

        u.setAddress(address);
        
        Order order1 = new Order();
        Timestamp created_at = new Timestamp(System.currentTimeMillis());
        order1.setCreated_at(created_at);
        order1.setTotal(55.51);
        
        Set<Order> orderList = null;
        orderList.add(order1);
        
        u.setOrders(orderList);

        repo.save(u);

        System.out.println(u.getId());

        System.out.println(repo.findAllByNameContainingIgnoreCase("se"));
    }
}
