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

		FoodOrder foodOrder = new FoodOrder();
		foodOrder.setCustomerName("John Doe");
		FoodItem item1 = new FoodItem();

		item1.setItemName("Pizza");
		item1.setPrice(12.99);
		item1.setQuantity(2);
		item1.setFoodOrder(foodOrder);
		FoodItem item2 = new FoodItem();
		item2.setItemName("Burger");
		item2.setPrice(8.99);
		item2.setQuantity(1);
		item2.setFoodOrder(foodOrder);
		foodOrder.setItems(List.of(item1, item2));
		FoodRepo repo = ctx.getBean(FoodRepo.class);
		repo.save(foodOrder);


	}
}
