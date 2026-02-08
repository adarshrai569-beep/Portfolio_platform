package com.portfolio.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Client extends BaseEntity {
	
	private String name;
	private String logo;
	private String website;
	
	

}
