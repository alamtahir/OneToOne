package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Data

public class Orders {

    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    private String productName;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
