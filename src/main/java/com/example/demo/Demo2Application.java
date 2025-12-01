package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Profile;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Demo2Application.class, args);


	}

}
