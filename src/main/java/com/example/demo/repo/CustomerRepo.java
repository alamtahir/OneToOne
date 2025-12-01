package com.example.demo.repo;

import com.example.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;
// Repository interface for Customer entity
public interface CustomerRepo extends JpaRepository<Customer, UUID> {

}
