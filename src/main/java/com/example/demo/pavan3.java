package com.example.demo;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
public class pavan3 {
	@Id
	
	private int id;
	private String name;
	private String tech;
	public int getId() {
		return id;
	}
	public pavan3() {
		
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public pavan3(int id, String name, String tech) {
		super();
		this.id = id;
		this.name = name;
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "user_1 [id=" + id + ", name=" + name + ", tech=" + tech + "]";
	}
	

}
