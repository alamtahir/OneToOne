package com.example.demo.entity;

import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Profile {

	@Id
	@GeneratedValue
	@UuidGenerator
	private UUID id;
	@Column(name = "profile_name")
	private String profile_name;
	@OneToOne(mappedBy = "profile", cascade = CascadeType.ALL)
	private User user;

}
