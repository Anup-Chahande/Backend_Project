package com.tka.Classroom_Management.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subjects {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;

	@Column(nullable = false)
	long course_id;

	@Column(nullable = false)
	String name;

	public Subjects() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCourse_id() {
		return course_id;
	}

	public void setCourse_id(long course_id) {
		this.course_id = course_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Subjects [id=" + id + ", course_id=" + course_id + ", name=" + name + "]";
	}

	public Subjects(long course_id, String name) {
		super();
		this.course_id = course_id;
		this.name = name;
	}

	public Subjects(long id, long course_id, String name) {
		super();
		this.id = id;
		this.course_id = course_id;
		this.name = name;
	}

}
