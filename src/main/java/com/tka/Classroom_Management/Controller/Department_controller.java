package com.tka.Classroom_Management.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Classroom_Management.Entity.Course;
import com.tka.Classroom_Management.Entity.Department;
import com.tka.Classroom_Management.Service.Department_service;

@RestController
public class Department_controller {
	@Autowired
	Department_service ds;
	
	@GetMapping("alldepartment")
	public List<Department> getalldepartment() {
           return ds.getalldepartment();
	}
	
	@GetMapping("department/{id}")
	public ArrayList<Department> get_Department_by_id(@PathVariable long id) {
		return ds.get_Department_by_id(id);
	}
	
	@PostMapping("createdepartment")
	public Department create_Department(@RequestBody Department department) {

		return ds.create_Department(department);

	}
	
	@PutMapping("updatedepartment/{id}")
	public Department update_Course(@PathVariable long id, @RequestBody Department department) {

		return ds.update_Course(id, department);
	}
	
	@DeleteMapping("deletedepartment/{id}")
	public Department deletedepartment(@PathVariable long id) {
		
		
		return ds.deletedepartment(id);
		
	}
	
	
	
}
