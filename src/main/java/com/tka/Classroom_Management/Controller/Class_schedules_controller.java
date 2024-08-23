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

import com.tka.Classroom_Management.Entity.Class_schedules;
import com.tka.Classroom_Management.Service.Class_schedules_service;

@RestController
public class Class_schedules_controller {
	@Autowired
	Class_schedules_service css;

	@GetMapping("allschedules")
	public List<Class_schedules> get_all_class_schddules() {

		return css.get_all_class_schddules();

	}
	@GetMapping("classrooms/{id}")
	public ArrayList<Class_schedules> get_schddules_by_id(@PathVariable long id) {
		return css.get_schddules_by_id(id);
	}
	
	@PostMapping("createschedule")
	public Class_schedules create_class_schedule(@RequestBody Class_schedules data ) {
		
		
		
		return css.create_class_schedule(data);
		
		
	}
	@PutMapping("update/{id}")
	public Class_schedules update_schedule( @PathVariable long id,@RequestBody Class_schedules data) {
		
		
		
		return css.update_schedule(id,data);
	}
	
	@DeleteMapping("delete/{id}")
public Class_schedules deleteclasroom(@PathVariable long id) {
		
		
		
		return css.deleteclasroom(id);
	
	

}
	




}
