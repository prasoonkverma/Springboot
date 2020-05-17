package com.example.java.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {

	private String name;
	private Integer age;
	private String email;
	
	@JsonIgnore
	private Integer id;
	
	public User() {
		super();
	}
	
	public User(String name, Integer age, String email, Integer id) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", email=" + email + ", id=" + id + "]";
	}
}
