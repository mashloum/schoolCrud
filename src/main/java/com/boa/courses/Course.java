package com.boa.courses;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	private String id;
	private String name;
	private String description;
	
	public Course(String id, String name, String desc) {
		super();
		this.id=id;
		this.name=name;
		this.description=desc;
		
	}

	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Course() {
		// TODO Auto-generated constructor stub
	}

}