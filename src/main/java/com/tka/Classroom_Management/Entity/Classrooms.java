package com.tka.Classroom_Management.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classrooms {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	String name;

	public Classrooms() {
		super();
	}

	public Classrooms(long id2) {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Classrooms [id=" + id + ", name=" + name + "]";
	}

	public Classrooms(String name) {
		super();
		this.name = name;
	}

	public Classrooms(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	

}
