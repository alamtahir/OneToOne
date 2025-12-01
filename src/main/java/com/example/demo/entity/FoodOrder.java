package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;
import java.util.UUID;

@Entity
@Data
public class FoodOrder {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;
    private String customerName;
    @OneToMany(mappedBy = "foodOrder")
    private List<FoodItem> items;

}
