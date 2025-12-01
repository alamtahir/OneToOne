package com.example.demo.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;
    private String name;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Order> orders = new ArrayList<>();

    // Add helper method
    public void addOrder(Order order) {
        order.setCustomer(this);
        this.orders.add(order);
    }
}
