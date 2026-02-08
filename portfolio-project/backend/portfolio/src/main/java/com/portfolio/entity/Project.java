package com.portfolio.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Project  extends BaseEntity{
	
	private String title;
	private String description;
	private String githubUrl;
	private String liveUrl;
	private String image;
	
	@ManyToOne
	private Client client;
	

}
