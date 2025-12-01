package com.example.demo;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Orders;
import com.example.demo.repo.CustomerRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo2Application {

	public Demo2Application() {
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Demo2Application.class, args);
		Customer customer = new Customer();
		customer.setName("John Doe");
		Orders order1 = new Orders();
		order1.setProductName("Laptop");
		Orders order2 = new Orders();
		order2.setProductName("Smartphone");
		order1.setCustomer(customer);
		order2.setCustomer(customer);
		customer.getOrders().add(order1);
		customer.getOrders().add(order2);
		CustomerRepo repo = ctx.getBean(CustomerRepo.class);
		repo.save(customer);

	}
}
