package com.example.demo.entity;

import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class User {

	@Id
	@GeneratedValue
	@UuidGenerator
	@Column(name="user_id")
	private UUID id;
	
	@Column(name = "user_name")
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "profile_id")
	private Profile profile;
	
	
	
	

}
