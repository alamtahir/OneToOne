package com.example.demo.repo;

import com.example.demo.entity.FoodOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FoodRepo extends JpaRepository<FoodOrder, UUID> {
}
