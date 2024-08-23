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

import com.tka.Classroom_Management.Entity.Faculties;
import com.tka.Classroom_Management.Entity.Subjects;
import com.tka.Classroom_Management.Service.Subjects_service;

@RestController
public class Subjects_controller {
	@Autowired
	Subjects_service ss;
	
	@GetMapping("allsubjects")
	public List<Subjects> getallSubjects() {
           return ss.getallSubjects();
	}
	@GetMapping("subjects/{id}")
	public ArrayList<Subjects> get_Faculties_by_id(@PathVariable long id) {
		return ss.get_Subjects_by_id(id);
	}
	
	@PostMapping("createsubjects")
	public Subjects create_Subjects(@RequestBody Subjects subjects) {

		return ss.create_Subjects(subjects);

	}
	
	@PutMapping("updatesubjects/{id}")
	public Subjects update_Subjects(@PathVariable long id, @RequestBody Subjects subjects) {

		return ss.update_Subjects(id, subjects);
	}
	
	@DeleteMapping("deletesubjects/{id}")
	public Subjects deletesubjects(@PathVariable long id) {
		
		
		return ss.deletesubjects(id);
		
	}

}
