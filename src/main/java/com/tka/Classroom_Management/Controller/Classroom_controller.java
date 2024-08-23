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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Classroom_Management.Entity.Classrooms;
import com.tka.Classroom_Management.Service.Classroom_Service;

@RestController
public class Classroom_controller {
	@Autowired
	Classroom_Service cs;

	@GetMapping("allclassrooms")
	public List<Classrooms> getallclassrooms() {

		return cs.allclassrooms();
		

	}

	@GetMapping("getclassroom/{id}")
	public ArrayList<Classrooms> get_classroom_by_id(@PathVariable long id) {

		return cs.get_classroom_by_id(id);
	}

	@PostMapping("createclass")
	public Classrooms create_Classroom(@RequestBody Classrooms clasroom) {

		return cs.create_Classroom(clasroom);

	}

	@PutMapping("updateclass/{id}")
	public Classrooms update_classroom(@PathVariable long id, @RequestBody Classrooms classroom) {

		return cs.update_classroom(id, classroom);
	}

	@DeleteMapping("deleteclass/{id}")
	public Classrooms deleteclasroom(@PathVariable long id) {
		
		
		return cs.deleteclasroom(id);
		
	}

}
