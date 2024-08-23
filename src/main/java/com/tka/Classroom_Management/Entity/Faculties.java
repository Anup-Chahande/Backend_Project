package com.tka.Classroom_Management.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Faculties {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;

	@Column(nullable = false)
	long department_id;

	@Column(nullable = false, unique = true)
	String email;

	@Column(nullable = false)
	String name;

	public Faculties() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(long department_id) {
		this.department_id = department_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Faculties [id=" + id + ", department_id=" + department_id + ", email=" + email + ", name=" + name + "]";
	}

	public Faculties(long department_id, String email, String name) {
		super();
		this.department_id = department_id;
		this.email = email;
		this.name = name;
	}

	public Faculties(long id, long department_id, String email, String name) {
		super();
		this.id = id;
		this.department_id = department_id;
		this.email = email;
		this.name = name;
	}

}
