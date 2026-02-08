package com.portfolio.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Employment extends BaseEntity {
	
	private String company;
	private String role;
	private String duration;
	private String description;
}