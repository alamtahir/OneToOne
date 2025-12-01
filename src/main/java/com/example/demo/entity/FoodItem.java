package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;
import jakarta.persistence.*;
@Entity
@Data
public class FoodItem {

    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;
    private String itemName;
    private double price;
    private int quantity;
    @ManyToOne(
         cascade = CascadeType.ALL
    )
    @JoinColumn(name = "food_order_id")
    private FoodOrder foodOrder;

}
