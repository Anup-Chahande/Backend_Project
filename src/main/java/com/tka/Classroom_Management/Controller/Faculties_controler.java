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

import com.tka.Classroom_Management.Entity.Department;
import com.tka.Classroom_Management.Entity.Faculties;
import com.tka.Classroom_Management.Service.Faculties_service;

@RestController
public class Faculties_controler {
	@Autowired
	Faculties_service fs;
	
	
	@GetMapping("allfaculties")
	public List<Faculties> getallfaculties() {
           return fs.getallfaculties();
	}
	
	@GetMapping("faculties/{id}")
	public ArrayList<Faculties> get_Faculties_by_id(@PathVariable long id) {
		return fs.get_Faculties_by_id(id);
	}
	
	@PostMapping("createfaculties")
	public Faculties create_Department(@RequestBody Faculties faculties) {

		return fs.create_Faculties(faculties);

	}
	
	@PutMapping("updatefaculties/{id}")
	public Faculties update_Faculties(@PathVariable long id, @RequestBody Faculties faculties) {

		return fs.update_Faculties(id, faculties);
	}
	
	@DeleteMapping("deletefaculties/{id}")
	public Faculties deletefaculties(@PathVariable long id) {
		
		
		return fs.deletefaculties(id);
		
	}

}
