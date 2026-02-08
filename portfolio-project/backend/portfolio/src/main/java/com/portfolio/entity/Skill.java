package com.portfolio.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Skill extends BaseEntity {
	
	private String name;
	private int percentage;
	private String category;
	

}
