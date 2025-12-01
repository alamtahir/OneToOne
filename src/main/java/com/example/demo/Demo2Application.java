package com.example.demo;
import com.example.demo.entity.FoodItem;
import com.example.demo.entity.FoodOrder;
import com.example.demo.repo.FoodRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class Demo2Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Demo2Application.class, args);

	}
}
